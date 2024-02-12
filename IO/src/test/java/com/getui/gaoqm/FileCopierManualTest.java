package com.getui.gaoqm;

import org.junit.Test;
import java.io.IOException;

public class FileCopierManualTest {
    @Test
    public void testFileCopierManual() {
        String sourceFilePath = "E:\\GitRepository\\Study\\IO\\testfiles\\inputfile.txt"; // 源文件路径
        String destinationFilePath = "E:\\GitRepository\\Study\\IO\\testfiles\\outputfile.txt"; // 目标文件路径
        FileCopierManual fileCopierManual = new FileCopierManual();

        try {
            fileCopierManual.copyFileManually(sourceFilePath, destinationFilePath);
            System.out.println("文件拷贝成功！");
        } catch (IOException e) {
            System.out.println("文件拷贝失败：" + e.getMessage());
        }
    }
}