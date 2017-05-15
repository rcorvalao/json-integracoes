package com.agco.json.generate.helper;

import java.io.File;

public class FileHelper {

	public static File createFile(String path, String name, String extension) {
		return new File(path + name + "." + extension);
	}
}
