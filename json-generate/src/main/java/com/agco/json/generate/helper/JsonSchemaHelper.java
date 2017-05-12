package com.agco.json.generate.helper;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.reinert.jjschema.v1.JsonSchemaFactory;
import com.github.reinert.jjschema.v1.JsonSchemaV4Factory;

public class JsonSchemaHelper {
	
	@SuppressWarnings("rawtypes")
	public static List<JsonNode> createSchema(List<Class> interfaceRepresentation) throws Exception {
		
		if(interfaceRepresentation == null)
			throw new Exception("interfaceRepresentation is null");
		
		List<JsonNode> listOfNodes = new ArrayList<JsonNode>();
		JsonSchemaFactory schemaFactory = new JsonSchemaV4Factory();
		
		schemaFactory.setAutoPutDollarSchema(true);
		
		for (Class data : interfaceRepresentation) {
			
			JsonNode productSchema = schemaFactory.createSchema(data);		
			listOfNodes.add(productSchema);
			System.out.println(productSchema);
		}		
		
		return listOfNodes;
	}
}
