package com.agco.json.generate.helper;

import java.io.File;

public class FileHelper {
	
	public final static String JSON_FILES_PATH = "generated-jsons/";
	public final static String SCHEMA_FILES_PATH = "generated-schemas/";

	public static File createFile(String path, String name, String extension) {
		return new File(path + name + "." + extension);
	}
}
