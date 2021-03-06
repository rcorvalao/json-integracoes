package com.agco.json.generate.integration;

import java.util.ArrayList;
import java.util.List;

import com.agco.json.generate.entity.Franchise;
import com.agco.json.generate.entity.FranchiseItem;
import com.agco.json.generate.entity.MetaData;
import com.github.reinert.jjschema.Attributes;

@Attributes(title = "BKW05 - Franchise", description = "Send items franchise from AGCO to Barkawi")
public class BKW05Franchise {

	@Attributes(required = true)
	private Franchise data;
	private MetaData meta;

	public BKW05Franchise() {
		
		List<FranchiseItem> franchiseItem = new ArrayList<FranchiseItem>();
		franchiseItem.add(new FranchiseItem());
		
		Franchise franchise = new Franchise();
		franchise.setFranchises(franchiseItem);
		
		this.setData(franchise);
		this.setMeta(new MetaData());
	}

	public Franchise getData() {
		return data;
	}

	public void setData(Franchise data) {
		this.data = data;
	}

	public MetaData getMeta() {
		return meta;
	}

	public void setMeta(MetaData meta) {
		this.meta = meta;
	}

}
