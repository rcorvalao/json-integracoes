package com.agco.json.generate.helper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.reinert.jjschema.v1.JsonSchemaFactory;
import com.github.reinert.jjschema.v1.JsonSchemaV4Factory;
import com.google.gson.Gson;

public class JsonSchemaHelper {

	@SuppressWarnings("rawtypes")
	public static List<JsonNode> createSchema(List<Class> interfaceRepresentation) throws Exception {
		if (interfaceRepresentation == null) {
			throw new Exception("interfaceRepresentation is null");
		}

		List<JsonNode> listOfNodes = new ArrayList<JsonNode>();
		JsonSchemaFactory schemaFactory = new JsonSchemaV4Factory();

		schemaFactory.setAutoPutDollarSchema(true);
		
		System.out.println("JSON Schema Generate ...");
		int count = 0;
		for (Class data : interfaceRepresentation) {
			JsonNode productSchema = schemaFactory.createSchema(data);
			listOfNodes.add(productSchema);

			System.out.println("--> " + (++count));
			System.out.println(productSchema);
		}
		System.out.println("JSON Schema Generate - done!");

		return listOfNodes;
	}
	
	
	
	public static List<String> createJson(List<Object> objJsons) {
		Gson gson = new Gson();
		
		List<String> jsonStrs = new LinkedList<String>();
		
		System.out.println("JSON Generate ...");
		int count = 0;
		for (Object obj : objJsons) {
			String jsonStr = gson.toJson(obj);
			jsonStrs.add(jsonStr);
			
			System.out.println("--> " + (++count));
			System.out.println(jsonStr);			
		}
		System.out.println("JSON Generate - done!");
		
		return jsonStrs;
	}
	
}
