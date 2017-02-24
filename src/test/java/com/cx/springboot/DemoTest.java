package com.cx.springboot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import antlr.collections.impl.Vector;

public class DemoTest {

	/** 一次性压缩多个文件，文件存放至一个文件夹中 */
	public static void ZipMultiFile(String filepath, String zippath) {
		try {
			File file = new File(filepath);// 要被压缩的文件夹
			File zipFile = new File(zippath);
			InputStream input = null;
			ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				for (int i = 0; i < files.length; ++i) {
					input = new FileInputStream(files[i]);
					zipOut.putNextEntry(new ZipEntry(file.getName() + File.separator + files[i].getName()));
					int temp = 0;
					while ((temp = input.read()) != -1) {
						zipOut.write(temp);
					}
					input.close();
				}
			}
			zipOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] arg0) {
		ZipMultiFile("C:\\Users\\chenxin\\Desktop\\11", "C:\\Users\\chenxin\\Desktop\\11.zip");
	}
}
