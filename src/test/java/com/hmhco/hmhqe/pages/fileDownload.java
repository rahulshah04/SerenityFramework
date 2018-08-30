package com.hmhco.hmhqe.pages;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

public class fileDownload {
	public static boolean isFiledownload(String downloadPath, String fileName){
		boolean flag = false;
		File dir = new File(downloadPath);
		File[] dir_contents = dir.listFiles();
		
		for(int i =0; i < dir_contents.length; i++) {
			if(dir_contents[i].getName().equals(fileName))
				return flag = true;
		}	
		
	return flag;
		}
	
	public static boolean isFiledownloadActivityCards(String downloadPath, String fileName){
		boolean flag = false;
		File dir = new File(downloadPath);
		File[] dir_contents = dir.listFiles();
		
		for(int i =0; i < dir_contents.length; i++) {
			if(dir_contents[i].getName().contains(fileName))
				return flag = true;
		}	
		
	return flag;
		}
}

