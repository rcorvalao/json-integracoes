package com.agco.json.generate;

import com.agco.json.generate.integration.BKW03PurchaseOrder;
import com.agco.json.generate.integration.BKW02CustomerOrder;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.reinert.jjschema.v1.JsonSchemaFactory;
import com.github.reinert.jjschema.v1.JsonSchemaV4Factory;
import com.google.gson.Gson;

public class JsonGenerateMain {

	public static void main(String[] args) {
		generateSchema();
		
		System.out.println("====//====");
		
		generateJson();

	}
	
	private static void generateJson() {
		Gson gson = new Gson();
		
		String jsonBkw02 = gson.toJson(new BKW02CustomerOrder());
		System.out.println(jsonBkw02);
		String jsonBkw03 = gson.toJson(new BKW03PurchaseOrder());
		System.out.println(jsonBkw03);
		
		
	}

	private static void generateSchema() {
		JsonSchemaFactory schemaFactory = new JsonSchemaV4Factory();
		schemaFactory.setAutoPutDollarSchema(true);
		
		JsonNode productSchemaBK02 = schemaFactory.createSchema(BKW02CustomerOrder.class);
		System.out.println(productSchemaBK02);
		
		JsonNode productSchemaBK03 = schemaFactory.createSchema(BKW03PurchaseOrder.class);
		System.out.println(productSchemaBK03);		
	}

}
