package com.agco.json.generate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.agco.json.generate.helper.JsonHelper;
import com.agco.json.generate.helper.JsonSchemaHelper;
import com.agco.json.generate.integration.BKW01InventoryData;
import com.agco.json.generate.integration.BKW02CustomerOrder;
import com.agco.json.generate.integration.BKW03PurchaseOrder;
import com.agco.json.generate.integration.BKW04Items;
import com.agco.json.generate.integration.BKW05Franchise;
import com.agco.json.generate.integration.BKW06PriceList;
import com.agco.json.generate.integration.BKW07SuperSession;
import com.agco.json.generate.integration.BKW08Muo;
import com.agco.json.generate.integration.BKW13OrderRecommendation;
import com.agco.json.generate.integration.BKW14Error;
import com.agco.json.generate.integration.BKW14ErrorFromBox;
import com.fasterxml.jackson.databind.JsonNode;

public class JsonGenerateMain {

	public static void main(String[] args) throws IOException {
		
		
		generateSchema();
		
		generateJson();
		
	}

	private static void generateJson() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("BKW01InventoryData", new BKW01InventoryData());
		map.put("BKW02CustomerOrder", new BKW02CustomerOrder());
		map.put("BKW03PurchaseOrder", new BKW03PurchaseOrder());
		map.put("BKW04Items", new BKW04Items());
		map.put("BKW05Franchise", new BKW05Franchise());
		map.put("BKW06PriceList", new BKW06PriceList());
		map.put("BKW07SuperSession"	, new BKW07SuperSession());
		map.put("BKW08Muo", new BKW08Muo());
		map.put("BKW13OrderRecommendation", new BKW13OrderRecommendation());
		map.put("BKW14ErrorFromBox", new BKW14ErrorFromBox());
		map.put("BKW14Error", new BKW14Error());
				
		try {
			JsonHelper.createFile(map);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	private static void generateSchema() throws IOException {
		@SuppressWarnings("rawtypes")
		List<Class> listOfClass = new ArrayList<Class>();
		
		listOfClass.add(BKW01InventoryData.class);
		listOfClass.add(BKW02CustomerOrder.class);
		listOfClass.add(BKW03PurchaseOrder.class);
		listOfClass.add(BKW04Items.class);
		listOfClass.add(BKW05Franchise.class);
		listOfClass.add(BKW06PriceList.class);		
		listOfClass.add(BKW07SuperSession.class);
		listOfClass.add(BKW08Muo.class);
		listOfClass.add(BKW13OrderRecommendation.class);
		listOfClass.add(BKW14ErrorFromBox.class);
		listOfClass.add(BKW14Error.class);

		Map<String, JsonNode> mapOfJsonSchemas = JsonSchemaHelper.createSchema(listOfClass);
		
		JsonSchemaHelper.writeFile(mapOfJsonSchemas);
		
	}

}
