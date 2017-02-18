package com.bharathi.java.main;

import com.bharathi.java.io.FileExample;
import com.bharathi.java.io.PathExample;

public final class AppMain {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		FileExample.create();
		FileExample.can();
		FileExample.get();
		FileExample.prop();
		FileExample.is();
		FileExample.rename();
		FileExample.delete();
		
		PathExample.get();
		PathExample.is();
	}

}
