package com.bharathi.java.io;

import java.io.File;
import java.io.IOException;

public class FileExample {
	public void write() {
		try {
			System.out.println("Create directory");
			File dir = new File(".\\hello");
			dir.mkdir();
			File f = new File(dir, "text");
			System.out.println("Name: " + f.getName());
			System.out.println("File does not exists: " + f.exists());
			System.out.println("Creating file");
			
			f.createNewFile(); // create a new file.  The file should not exist already
			
			System.out.println("File exists: " + f.exists());
			
			

			System.out.println("Path: " + f.getPath());
			System.out.println("Absolute Path: " + f.getAbsolutePath());
			System.out.println("CanonicalPath: " + f.getCanonicalPath());

			System.out.println("isFile: " + f.isFile());
			System.out.println("isDirectory: " + f.isDirectory());
			System.out.println("isAbsolute: " + f.isAbsolute());
			System.out.println("isHidden: " + f.isHidden());

			System.out.println("can Read: " + f.canRead());
			System.out.println("can Write: " + f.canWrite());
			System.out.println("can Execute: " + f.canExecute());

			System.out.println("lastModified: " + f.lastModified());
			System.out.println("length: " + f.length());
			
			System.out.println("ParentFile: " + f.getParentFile());

			System.out.println("Length: " + f.length());
			System.out.println("FreeSpace: " + f.getFreeSpace());
			System.out.println("TotalSpace: " + f.getTotalSpace());
			System.out.println("UsableSpace: " + f.getUsableSpace());
			
		    System.out.println("File to URI: " + f.toURI());
		    boolean result = f.renameTo(new File(dir, "rename")); // problematic on windows
		    System.out.println("Rename result: " + result);
		    System.out.println("CanonicalPath: " + f.getCanonicalPath());
		    System.out.println("File exists: " + f.exists());
			System.out.println("Deleting file ");

			f.delete();
			System.out.println("File parent: " + f.getParentFile());
			f.getParentFile().delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
