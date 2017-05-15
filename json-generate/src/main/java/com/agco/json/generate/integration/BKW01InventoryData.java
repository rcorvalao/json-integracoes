package com.agco.json.generate.integration;

import com.agco.json.generate.entity.InventoryData;
import com.agco.json.generate.entity.MetaData;
import com.github.reinert.jjschema.Attributes;

@Attributes(title = "BKW01 - InventoryData", description = "Send inventory position received from dealers into VMI system to Barkawi")
public class BKW01InventoryData {
	
	
	@Attributes(required = true)
	private InventoryData data = new InventoryData();
	
	private MetaData meta = new MetaData();
	

	public InventoryData getData() {
		return data;
	}

	public void setData(InventoryData data) {
		this.data = data;
	}

	public MetaData getMeta() {
		return meta;
	}

	public void setMeta(MetaData meta) {
		this.meta = meta;
	}
	
	

}
