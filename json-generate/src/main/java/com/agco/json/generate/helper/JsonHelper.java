package com.agco.json.generate.helper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonHelper {

	@SuppressWarnings("rawtypes")
	public static void createFile(HashMap<String, Object> map) throws Exception {

		if (map.isEmpty())
			throw new Exception("Empty map");

		Iterator json_objects = map.entrySet().iterator();

		while (json_objects.hasNext()) {

			Map.Entry currentMap = (Map.Entry) json_objects.next();
			File newFile = FileHelper.createFile(FileHelper.JSON_FILES_PATH, currentMap.getKey().toString(), "json");
			JsonHelper.writeObjectIntoFile(currentMap.getValue(), newFile);
		}

		System.out.println("Check created files here: " + FileHelper.JSON_FILES_PATH);
	}

	public static void writeObjectIntoFile(Object object, File file)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		mapper.writeValue(file, object);
	}
}
