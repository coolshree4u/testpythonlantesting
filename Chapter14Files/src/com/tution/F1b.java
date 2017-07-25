package com.tution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class F1b {

	public static void main(String[] args) {

		Path p = Paths.get(args[0]);
		System.out.println(Files.exists(p));

		try {
			Files.createFile(p);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
