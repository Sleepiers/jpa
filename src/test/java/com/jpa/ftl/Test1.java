package com.jpa.ftl;

import freemarker.template.Template;

import java.io.FileWriter;
import java.io.StringReader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * @user zzw
 * @date 2018/11/5
 */
public class Test1 {

    public static void main(String[] args) {
        try {
            // 创建插值的map
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("user", "rr");
            map.put("url", "http://www.baidu.com/");
            map.put("name", "百度");

            // 创建一个模板对象
            Template t = new Template(null, new StringReader(
                    "用户名：${user};URL：    ${url};姓名： 　${name}"), null);

            // 执行插值，并输出到指定的输出流中
            Writer writer = new FileWriter("E:\\aa.html");
            t.process(map, writer);
            // t.process(map, new OutputStreamWriter(System.out));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
