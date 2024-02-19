package com.getui.gaoqm;

import java.io.*;

//实现一个本地系统文件拷贝工具
public class FileCopierManual {
    public void copyFileManually(String source, String dest) throws IOException {
        /*
            引入的“try-with-resources”语句，它确保了在完成文件操作后，
            FileInputStream和FileOutputStream都会被正确地关闭，
            即使发生了异常也是如此，这有助于避免资源泄露。
         */
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[1024]; // 创建一个缓冲区来存储数据
            int length;

            // 从源文件读取数据并写入目标文件，直到没有更多数据可读
            while ((length = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, length);
            }
        }
    }
}