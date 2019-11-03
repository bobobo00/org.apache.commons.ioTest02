package cn.io.commons;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
/**
 * ����
 * @author dell
 *
 */

public class CIOTest02 {
	public static void main(String[] args) throws IOException {
		//�����ļ�
		FileUtils.copyFile(new File("E://workspace-java//IO������//����2.png"), new File("dest.png"));
	    //�����ļ���Ŀ¼
		FileUtils.copyFileToDirectory(new File("E://workspace-java//IO������//����2.png"),new File("lib"));	
	    //����Ŀ¼
		FileUtils.copyDirectory(new File("lib"), new File("lib-copy"));
		//����Ŀ¼��Ŀ¼
		FileUtils.copyDirectoryToDirectory(new File("lib"), new File("lib-copy"));
		//����URLĿ¼
		
		String datas=IOUtils.toString(new URL("http://www.baidu.com"),"utf-8");
	    System.out.println(datas);
	}

}
