package com.agco.json.generate.integration;

import com.agco.json.generate.entity.MetaData;
import com.agco.json.generate.entity.PurchaseOrder;
import com.github.reinert.jjschema.Attributes;


@Attributes(title = "BKW03 - PurchaseOrder", description = "Send purchase order received from dealers into VMI system to Barkawi")
public class BKW03PurchaseOrder {
	
	@Attributes(required = true)
	private PurchaseOrder data = new PurchaseOrder();

    private MetaData meta = new MetaData();

	public PurchaseOrder getData() {
		return data;
	}

	public void setData(PurchaseOrder data) {
		this.data = data;
	}

	public MetaData getMeta() {
		return meta;
	}

	public void setMeta(MetaData meta) {
		this.meta = meta;
	}

}
