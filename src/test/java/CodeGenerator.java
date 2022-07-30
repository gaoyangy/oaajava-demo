import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.IFill;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.fill.Column;

public class CodeGenerator {
    public static void main(String[] args) {
        // 数据源配置
        DataSourceConfig.Builder dataSourceConfigBuilder = new DataSourceConfig
                .Builder(
                "jdbc:mysql://127.0.0.1:3306/oaajava?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&autoReconnect=true&useSSL=false",
                "root",
                "root");//内部会自行判断数据库类型
        // 全局配置
        GlobalConfig.Builder globalConfigBuilder = new GlobalConfig.Builder();
        // 代码生成目录
        String projectPath = System.getProperty("user.dir");
        globalConfigBuilder.outputDir(projectPath + "/src/main/java");

        // 作者
        globalConfigBuilder.author("gaoyangy");
        // 结束时是否打开文件夹
        globalConfigBuilder.openDir(false);
        // 是否覆盖旧的文件
        globalConfigBuilder.fileOverride();
        // 实体属性Swagger2注解
        globalConfigBuilder.enableSwagger();
        // 包配置，如模块名、实体、mapper、service、controller等
        PackageConfig.Builder packageConfigBuilder = new PackageConfig.Builder();
//                packageConfigBuilder.moduleName("");
        packageConfigBuilder.parent("com.oaajava.demo");
                packageConfigBuilder.entity("entity");
                packageConfigBuilder.service("service");
                packageConfigBuilder.mapper("dao");
                packageConfigBuilder.xml("xml");
                packageConfigBuilder.serviceImpl("serviceImpl");
                packageConfigBuilder.controller("controller");

        // 策略配置
        StrategyConfig.Builder strategyConfigBuilder = new StrategyConfig.Builder();

        // 设置需要映射的表名
        strategyConfigBuilder.addInclude("sys_user", "sys_role", "sys_user_role");//字符串数组，可以生成多个表

        // 下划线转驼峰
        strategyConfigBuilder.entityBuilder().naming(NamingStrategy.underline_to_camel);
        strategyConfigBuilder.entityBuilder().columnNaming(NamingStrategy.underline_to_camel);
        // 去除前缀"t_"
        //strategyConfigBuilder.addTablePrefix("t_");

        // entity的Lombok
        strategyConfigBuilder.entityBuilder().enableLombok();

        // 逻辑删除
        strategyConfigBuilder.entityBuilder().logicDeleteColumnName("deleted");
        strategyConfigBuilder.entityBuilder().logicDeletePropertyName("deleted");

        // 创建时间
        IFill gmtCreate = new Column("create_time", FieldFill.INSERT);
        // 更新时间
        IFill gmtModified = new Column("update_time", FieldFill.INSERT_UPDATE);
        strategyConfigBuilder.entityBuilder().addTableFills(gmtCreate, gmtModified);
        // 乐观锁
        strategyConfigBuilder.entityBuilder().enableSerialVersionUID();
        strategyConfigBuilder.entityBuilder().versionColumnName("version");
        strategyConfigBuilder.entityBuilder().versionPropertyName("version");

        // 使用Restful风格的Controller
        strategyConfigBuilder.controllerBuilder().enableRestStyle();
        // -------------------- Service 策略配置
        // 设置 IService 父类
        strategyConfigBuilder.serviceBuilder().superServiceClass(IService.class);
//         strategyConfigBuilder.serviceBuilder().superServiceClass("com.oaajava.user.staff.BaseService");
        // 设置 ServiceImpl 父类
        strategyConfigBuilder.serviceBuilder().superServiceImplClass(ServiceImpl.class);
//        strategyConfigBuilder.serviceBuilder().superServiceImplClass("com.oaajava.user.staff.BaseService");
        // -------------------- Mapper 策略配置
        // 设置父类
        strategyConfigBuilder.mapperBuilder().superClass(BaseMapper.class);
//        strategyConfigBuilder.mapperBuilder().superClass("com.oaajava.user.staff.BaseMapper");
        // 启用 BaseResultMap 生成
        strategyConfigBuilder.mapperBuilder().enableBaseResultMap();
        // 启用 BaseColumnList
        strategyConfigBuilder.mapperBuilder().enableBaseColumnList();

        // 将请求地址转换为驼峰命名，如 http://localhost:8080/hello_id_2
        strategyConfigBuilder.controllerBuilder().enableHyphenStyle();

        // 创建代码生成器对象，加载配置
        AutoGenerator autoGenerator = new AutoGenerator(dataSourceConfigBuilder.build());
        autoGenerator.global(globalConfigBuilder.build());
        autoGenerator.packageInfo(packageConfigBuilder.build());
        autoGenerator.strategy(strategyConfigBuilder.build());

        // 执行
        autoGenerator.execute();
    }
}