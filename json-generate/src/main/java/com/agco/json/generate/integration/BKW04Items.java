package com.agco.json.generate.integration;

import com.agco.json.generate.entity.Items;
import com.agco.json.generate.entity.MetaData;
import com.github.reinert.jjschema.Attributes;

@Attributes(title = "BKW04 - Items", description = "Send parts data from AGCO to Barkawi")
public class BKW04Items {
	
	@Attributes(required = true)
	private Items data = new Items();
	
	private MetaData meta = new MetaData();
	

	public Items getData() {
		return data;
	}

	public void setData(Items data) {
		this.data = data;
	}

	public MetaData getMeta() {
		return meta;
	}

	public void setMeta(MetaData meta) {
		this.meta = meta;
	}

}
