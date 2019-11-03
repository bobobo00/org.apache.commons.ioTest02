package cn.io.commons;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
/**
 * 拷贝
 * @author dell
 *
 */

public class CIOTest02 {
	public static void main(String[] args) throws IOException {
		//复制文件
		FileUtils.copyFile(new File("E://workspace-java//IO流技术//捕获2.png"), new File("dest.png"));
	    //复制文件到目录
		FileUtils.copyFileToDirectory(new File("E://workspace-java//IO流技术//捕获2.png"),new File("lib"));	
	    //复制目录
		FileUtils.copyDirectory(new File("lib"), new File("lib-copy"));
		//复制目录到目录
		FileUtils.copyDirectoryToDirectory(new File("lib"), new File("lib-copy"));
		//拷贝URL目录
		
		String datas=IOUtils.toString(new URL("http://www.baidu.com"),"utf-8");
	    System.out.println(datas);
	}

}
