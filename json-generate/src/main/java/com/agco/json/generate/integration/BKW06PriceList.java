package com.agco.json.generate.integration;

import com.agco.json.generate.entity.MetaData;
import com.agco.json.generate.entity.PriceList;
import com.github.reinert.jjschema.Attributes;

@Attributes(title = "BKW06 - PriceList", description = "Send public price list from AGCO to Barkawi")
public class BKW06PriceList {

	@Attributes(required = true)
	private PriceList data;
	private MetaData meta;

	public PriceList getData() {
		return data;
	}

	public void setData(PriceList data) {
		this.data = data;
	}

	public MetaData getMeta() {
		return meta;
	}

	public void setMeta(MetaData meta) {
		this.meta = meta;
	}

}
