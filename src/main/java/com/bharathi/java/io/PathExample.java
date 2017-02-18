package com.bharathi.java.io;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class PathExample {
	PathExample() {
	}

	private static Path p;

	static {
		try {
			p = Paths.get(new URI("file:/D:/git/LearnJava/HelloDir/test"));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public static void get() {
		System.out.println("FileName: " + p.getFileName());
		System.out.println("Name count: " + p.getNameCount());
		System.out.println("File System: " + p.getFileSystem());
		System.out.println("Root: " + p.getRoot());
		System.out.println("Name at [1]: " + p.getName(1));
		System.out.println("Parent: " + p.getParent());
	}

	public static void is() {
		System.out.println("Is absolute path: " + p.isAbsolute());
	}

}
