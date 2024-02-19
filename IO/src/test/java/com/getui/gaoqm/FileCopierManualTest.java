package com.getui.gaoqm;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileCopierManualTest {
    @Test
    public void testFileCopierManual() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("E:\\GitRepository\\Study\\IO\\information.properties"));
        String sourceFilePath = properties.getProperty("srcFilePath"); // 源文件路径
        String destinationFilePath = properties.getProperty("destFilePath"); // 目标文件路径

        try {
            FileCopierManual fileCopierManual = new FileCopierManual();
            fileCopierManual.copyFileManually(sourceFilePath, destinationFilePath);
            System.out.println("文件拷贝成功！");
        } catch (IOException e) {
            System.out.println("文件拷贝失败：" + e.getMessage());
        }
    }
}