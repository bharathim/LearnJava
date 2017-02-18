package com.bharathi.java.io;

import java.io.File;
import java.io.IOException;

public final class FileExample {
	private static File helloDir = new File("HelloDir");
	private static File f = new File(helloDir, "test");
	private static File dest = new File(helloDir, "rename.txt");
	
	public static void create() {
		helloDir.mkdir();
		try {
			boolean result = f.createNewFile();
			System.out.println("File creation result: " + result);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	public static void rename() {
		
		boolean result = f.renameTo(dest);
		System.out.println("Rename result: " + result);
	}
	
	public static void delete() {
		System.out.println("Deleting....");
		boolean result = f.delete();
		System.out.println("Delete test result: " + result);
		result = dest.delete();
		System.out.println("Delete rename result: " + result);
		result = f.getParentFile().delete();
		System.out.println("Delete helloDir result: " + result);
	}
	
	public static void is() {
		System.out.println("isFile: " + f.isFile());
		System.out.println("isDirectory: " + f.isDirectory());
		System.out.println("isAbsolute: " + f.isAbsolute());
		System.out.println("isHidden: " + f.isHidden());
	}
	
	public static void get() {
		System.out.println("Name: " + f.getName());
		System.out.println("Path: " + f.getPath());
		System.out.println("Absolute Path: " + f.getAbsolutePath());
		try {
			System.out.println("CanonicalPath: " + f.getCanonicalPath());
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		System.out.println("ParentFile: " + f.getParentFile());
		
		System.out.println("FreeSpace: " + f.getFreeSpace());
		System.out.println("TotalSpace: " + f.getTotalSpace());
		System.out.println("UsableSpace: " + f.getUsableSpace());
	
	}
	
	public static void prop() {
		System.out.println("lastModified: " + f.lastModified());
		System.out.println("length: " + f.length());
		System.out.println("File to URI: " + f.toURI());
	}
	
	public static void can() {
		System.out.println("can Read: " + f.canRead());
		System.out.println("can Write: " + f.canWrite());
		System.out.println("can Execute: " + f.canExecute());
		System.out.println("File does not exists: " + f.exists());
	}	
}
