package com.jpa;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @user zzw
 * @date 2018/11/5
 */
public class Test {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("name", "郑智文");
        try {
            Configuration config = new Configuration();

            config.setDefaultEncoding("UTF-8");
            config.setDirectoryForTemplateLoading(new File("D:\\IDEAProjects\\jpa\\src\\test\\java\\com\\jpa"));

            Template template = config.getTemplate("test.ftl");
            template.process(map, new FileWriter("E:\\bb.html"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
