package com.agco.json.generate;

import java.util.ArrayList;
import java.util.List;
import com.agco.json.generate.helper.JsonSchemaHelper;
import com.agco.json.generate.integration.BKW02CustomerOrder;
import com.agco.json.generate.integration.BKW03PurchaseOrder;
import com.agco.json.generate.integration.BKW08Muo;
import com.agco.json.generate.integration.BKW13OrderRecommendation;
import com.google.gson.Gson;

public class JsonGenerateMain {

	public static void main(String[] args) {
		generateSchema();
//		generateJson();
	}

	private static void generateJson() {
		Gson gson = new Gson();

		String jsonBkw02 = gson.toJson(new BKW02CustomerOrder());
		System.out.println(jsonBkw02);
		String jsonBkw03 = gson.toJson(new BKW03PurchaseOrder());
		System.out.println(jsonBkw03);

	}

	private static void generateSchema() {

		@SuppressWarnings("rawtypes")
		List<Class> listOfClass = new ArrayList<Class>();
		listOfClass.add(BKW02CustomerOrder.class);
		listOfClass.add(BKW03PurchaseOrder.class);
		listOfClass.add(BKW13OrderRecommendation.class);
		listOfClass.add(BKW08Muo.class);

		try {
			JsonSchemaHelper.createSchema(listOfClass);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
