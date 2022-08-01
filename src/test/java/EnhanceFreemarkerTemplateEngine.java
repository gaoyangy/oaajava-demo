import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Map;

public final class EnhanceFreemarkerTemplateEngine extends FreemarkerTemplateEngine {

    public static Object getFieldValueByName(Object o, String fieldName) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(o, new Object[]{});
            return value;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void outputCustomFile(@NotNull Map<String, String> customFile, @NotNull TableInfo tableInfo, @NotNull Map<String, Object> objectMap) {
        String entityName = tableInfo.getEntityName();
        String otherPath = this.getPathInfo(OutputFile.other);
        customFile.forEach((key, value) -> {
            String fileName = String.format(otherPath + File.separator + entityName + "%s", key);
            Object table = objectMap.get("table");
            Object controllerName = getFieldValueByName(table, "controllerName");
            objectMap.put("apiName", controllerName.toString().replace("Controller", ""));
            Object a = objectMap.get("apiName");
            this.outputFile(new File(fileName.replace(".java", "Dto.java")), objectMap, value, this.getConfigBuilder().getInjectionConfig().isFileOverride());
        });
    }

}