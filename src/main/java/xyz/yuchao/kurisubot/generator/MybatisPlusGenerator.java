package xyz.yuchao.kurisubot.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.IConfigBuilder;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MybatisPlusGenerator {

    private static final String url = "jdbc:mysql://192.168.50.183:3306/Kurisu?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&useSSL=false";
    private static final String username = "root";
    private static final String password = "12345678";
    private static final String outputPath = "D:\\code\\java\\kurisuBot\\src\\main\\java";
    private static final String xmlOutputPath = "D:\\code\\java\\kurisuBot\\src\\main\\resources\\mapper";
    private static final String tables = "process_ec_study";
    private static final String moduleName = ".process";


    public static void main(String[] args) {
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("yc") // 设置作者
                            .disableOpenDir()
                            .outputDir(outputPath); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("xyz.yuchao.kurisubot") // 设置父包名
                            .entity("entity" + moduleName)
                            .service("service" + moduleName)
                            .serviceImpl("service" + moduleName + ".impl")
                            .controller("controller" + moduleName)
                            .mapper("mapper" + moduleName)
                            .pathInfo(Collections.singletonMap(OutputFile.xml, xmlOutputPath)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables)
                            .entityBuilder()
                            .enableFileOverride()
                            .enableTableFieldAnnotation()
                            .build()
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .enableFileOverride()
                            .build()
                            .mapperBuilder()
                            .enableBaseResultMap()
                            .enableMapperAnnotation()
                            .enableBaseColumnList()
                            .enableFileOverride()
                            .build()
                            .controllerBuilder()
                            .enableRestStyle()
                            .enableFileOverride()
                            .build(); // 设置需要生成的表名;

                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }


    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }


}
