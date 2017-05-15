package com.agco.json.generate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.agco.json.generate.helper.JsonSchemaHelper;
import com.agco.json.generate.integration.BKW01InventoryData;
import com.agco.json.generate.integration.BKW02CustomerOrder;
import com.agco.json.generate.integration.BKW03PurchaseOrder;
import com.agco.json.generate.integration.BKW04Items;
import com.agco.json.generate.integration.BKW05Franchise;
import com.agco.json.generate.integration.BKW06PriceList;
import com.agco.json.generate.integration.BKW08Muo;
import com.agco.json.generate.integration.BKW13OrderRecommendation;
import com.google.gson.Gson;

public class JsonGenerateMain {

	public static void main(String[] args) {
		generateSchema();
		generateJson();
	}

	private static void generateJson() {
		Gson gson = new Gson();

		String jsonBkw02 = gson.toJson(new BKW02CustomerOrder());
		System.out.println(jsonBkw02);
		String jsonBkw03 = gson.toJson(new BKW03PurchaseOrder());
		System.out.println(jsonBkw03);
		
		
		
		List<Object> objJsons = new LinkedList<Object>();
		
		objJsons.add(new BKW01InventoryData());
		objJsons.add(new BKW02CustomerOrder());
		objJsons.add(new BKW03PurchaseOrder());
		
		objJsons.add(new BKW04Items());
		objJsons.add(new BKW05Franchise());
		objJsons.add(new BKW06PriceList());
		
		objJsnos.add(new BKW07SuperSession());
		objJsons.add(new BKW08Muo());
		objJsons.add(new BKW13OrderRecommendation());
		
		JsonSchemaHelper.createJson(objJsons);

	}

	private static void generateSchema() {
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

		try {
			JsonSchemaHelper.createSchema(listOfClass);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
