package com.agco.json.generate.integration;

import com.agco.json.generate.entity.MetaData;
import com.agco.json.generate.entity.Muo;
import com.github.reinert.jjschema.Attributes;

@Attributes(title = "BKW08 - MUO", description = "Send machine which part is used from AGCO to Barkawi")
public class BKW08Muo {

	@Attributes(required = true)
	private Muo data;

	private MetaData meta;

	public BKW08Muo() {
		this.setData(new Muo());
		this.setMeta(new MetaData());
	}

	public Muo getData() {
		return data;
	}

	public void setData(Muo data) {
		this.data = data;
	}

	public MetaData getMeta() {
		return meta;
	}

	public void setMeta(MetaData meta) {
		this.meta = meta;
	}
}
