package com.agco.json.generate;

import com.agco.json.generate.integration.BKW02CustomerOrder;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.reinert.jjschema.v1.JsonSchemaFactory;
import com.github.reinert.jjschema.v1.JsonSchemaV4Factory;

public class JsonGenerateMain {

	public static void main(String[] args) {
		JsonSchemaFactory schemaFactory = new JsonSchemaV4Factory();
		schemaFactory.setAutoPutDollarSchema(true);
		JsonNode productSchema = schemaFactory.createSchema(BKW02CustomerOrder.class);
		System.out.println(productSchema);

	}

}
