package com.jpa.common.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * @user zzw
 * @date 2018/11/9
 */
public class CMDTest {

    public static void main(String[] args) {
        //获取运行时环境对象
        Runtime runtime = Runtime.getRuntime();
        //要执行的cmd命令
        //String command =" ping www.baidu.com";
        String command = "ipconfig";
        String line = null;
        StringBuilder sb = new StringBuilder();
        try {
            //运行外部【指的程序之外的】程序/命令
            Process process = runtime.exec(command);
            //注意加上Charset.forName("GBK")，这个是将返回结果进行编码，不安会出现中文乱码
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), Charset.forName("GBK")));
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb.toString());
    }
}
