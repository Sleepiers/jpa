package com.jpa.ftl;

import com.jpa.entity.Animal;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @user zzw
 * @date 2018/11/5
 */
public class Test2 {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setName("小狗");
        a1.setPrice(88);
        Animal a2 = new Animal();
        a2.setName("小喵");
        a2.setPrice(80);

        List<Animal> list = new ArrayList<Animal>();
        list.add(a1);
        list.add(a2);

        Map<String,Object> sexMap=new HashMap<String,Object>();
        sexMap.put("1", "男");
        sexMap.put("0","女");

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("user", "冉冉");
        map.put("score", 13);
        map.put("team", "一班,二班");
        map.put("animals", list);
        map.put("sexMap",sexMap);
        try {
            Configuration config = new Configuration();

            config.setDefaultEncoding("UTF-8");
            config.setDirectoryForTemplateLoading(new File("D:\\IDEAProjects\\jpa\\src\\test\\java\\com\\jpa"));

            Template template = config.getTemplate("hello.ftl");
            template.process(map,new FileWriter("E:\\bb.html"));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
