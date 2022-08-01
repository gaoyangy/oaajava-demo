import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.fill.Property;

import java.util.HashMap;
import java.util.Map;


public class CodeGenerator {
    public static void main(String[] args) {
        // 数据源配置
        String url = "jdbc:mysql://127.0.0.1:3306/oaajava?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&autoReconnect=true&useSSL=false";
        String username = "root";
        String password = "root";
        String projectPath = System.getProperty("user.dir");
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("gaoyangy") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .disableOpenDir() //禁止打开输出目录
                            .outputDir(projectPath + "/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.oaajava.demo") // 设置父包名
                            .entity("model.entity") //设置entity包名
                            .controller("controller")
                            .xml("mapper.xml")
                            .other("model.dto"); // 设置dto包名
//                            .pathInfo(Collections.singletonMap(OutputFile.xml, projectPath + "/src/main/resources/mapper")); // 设置mapperXml生成路径

                }).templateConfig(builder -> {
                    builder
                            .entity("/templates/entity.java")
                            .service("/templates/service.java")
                            .serviceImpl("/templates/serviceImpl.java")
                            .mapper("/templates/mapper.java")
                            .xml("/templates/mapper.xml")
                            .controller("/templates/controller.java")
                            .build();
                })
                .injectionConfig(consumer -> {
                    Map<String, String> customFile = new HashMap<>();
                    // DTO
                    customFile.put(".java", "/templates/dto.java.ftl");
                    consumer.customFile(customFile);
                })
                .strategyConfig(builder -> {
                    builder.enableCapitalMode().controllerBuilder()
//                            .enableHyphenStyle()
                            .enableRestStyle()
//                            .formatFileName("%s")
                            .entityBuilder()
                            .enableTableFieldAnnotation()
                            .disableSerialVersionUID()
                            .enableChainModel()
                            .enableLombok()
                            .enableRemoveIsPrefix()
                            .enableTableFieldAnnotation()
                            .enableActiveRecord()
                            .versionColumnName("version")
                            .versionPropertyName("version")
                            .logicDeleteColumnName("deleted")
                            .logicDeletePropertyName("deleteFlag")
                            .naming(NamingStrategy.underline_to_camel)
                            .columnNaming(NamingStrategy.underline_to_camel)
                            .idType(IdType.AUTO)
                            .addSuperEntityColumns("id", "created_by", "created_time", "updated_by", "updated_time")
                            .addIgnoreColumns("age")
                            .addTableFills(new Column("create_time", FieldFill.INSERT))
                            .addTableFills(new Property("updateTime", FieldFill.INSERT_UPDATE))
                            .formatFileName("%sEntity")
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImp")
                            .superServiceClass(com.baomidou.mybatisplus.extension.service.IService.class)
                            .superServiceImplClass(com.baomidou.mybatisplus.extension.service.impl.ServiceImpl.class)
                            .mapperBuilder()
                            .superClass(com.baomidou.mybatisplus.core.mapper.BaseMapper.class)
                            .enableMapperAnnotation()
                            .enableBaseResultMap()
                            .enableBaseColumnList()
                            .formatMapperFileName("%sMapper")
                            .formatXmlFileName("%sXml")
                            .build();
                    ;
                })
                .templateEngine(new EnhanceFreemarkerTemplateEngine()).execute();
    }
}