package com.agco.json.generate.helper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.reinert.jjschema.v1.JsonSchemaFactory;
import com.github.reinert.jjschema.v1.JsonSchemaV4Factory;


public class JsonSchemaHelper {
	
	@SuppressWarnings("rawtypes")
	public static Map<String, JsonNode> createSchema(List<Class> interfaceRepresentation) {
		if (interfaceRepresentation == null) {
			throw new RuntimeException("interfaceRepresentation is null");
		}

		Map<String, JsonNode> mapOfNodes = new HashMap<String, JsonNode>();
		
		JsonSchemaFactory schemaFactory = new JsonSchemaV4Factory();
		schemaFactory.setAutoPutDollarSchema(true);
		
		System.out.println("JSON Schema Generate ...");
		int count = 0;
		for (Class data : interfaceRepresentation) {
			JsonNode productSchema = schemaFactory.createSchema(data);
			mapOfNodes.put(data.getSimpleName(), productSchema);

			System.out.println("--> " + (++count) + ": " + data.getSimpleName());
			System.out.println(productSchema);
		}
		System.out.println("JSON Schema Generate - done!");

		return mapOfNodes;
	}	
	
	
	public static void writeFile(Map<String, JsonNode> mapOfJsonSchemas) throws IOException {
		System.out.println("JSON Schema write file ...");
		
		
		for (String interfaceName : mapOfJsonSchemas.keySet()) {
			
			File fileSchmeas = FileHelper.createFile(FileHelper.SCHEMA_FILES_PATH, interfaceName, "json");			
			
			FileUtils.write(fileSchmeas, (mapOfJsonSchemas.get(interfaceName)).toString(), Charset.defaultCharset());
			
			
		}
		
		System.out.println("JSON Schema write file - done!");
	}
}
