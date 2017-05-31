package com.agco.json.generate.integration;

import com.agco.json.generate.entity.MetaData;
import com.agco.json.generate.entity.Error;
import com.github.reinert.jjschema.Attributes;

@Attributes(title = "BKW14 - Error", description = "Receive error messages for each queue")
public class BKW14ErrorFromBox {

	@Attributes(required = true)
	private Error data = new Error();

    private MetaData meta = new MetaData();

	public Error getData() {
		return data;
	}

	public void setData(Error data) {
		this.data = data;
	}

	public MetaData getMeta() {
		return meta;
	}

	public void setMeta(MetaData meta) {
		this.meta = meta;
	}    
}
