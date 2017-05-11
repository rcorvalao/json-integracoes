package com.agco.json.generate.entity;

import java.util.Arrays;
import java.util.List;

import com.github.reinert.jjschema.Attributes;

public class PurchaseOrder {

	@Attributes(format = "date-time", required = true, description = "Local AGCO date when the extract was run.")
	private String extractionDateTime = "2016-11-23T10:45:00+03:00";
	@Attributes(maxLength = 50, required = true, description = "Unique purchase order ID; i.e. order from dealer to AGCO")
    private String orderId = "123456";
	@Attributes(maxLength = 10, required = false, description = "Unique purchase order ID at AGCO")
	private String orderAgco = "AOL-123456";
	@Attributes(maxLength = 8, required = true, description = "Dealer’s location account number. The number sent will be the AGCO code")
    private String dealerNumber = "1654549";
	@Attributes(format = "full-date", required = true, description = "PO date")
    private String orderDate = "2016-11-23";
	@Attributes(maxLength = 1, required = false, description = "Optional: e.g. Stock Order, VOR, Service")
    private String orderType = "STOCK_ORDER";
	
	@Attributes(maxLength = 255, required = false, description = "Optional: DMS specific filter to exclude purchase orders dedicated to non-forecastable demand, e.g. export business")
    private String filter1 = "";
	@Attributes(maxLength = 255, required = false, description = "Optional: DMS specific filter to exclude purchase orders dedicated to non-forecastable demand")
    private String filter3 = "";
	@Attributes(maxLength = 255, required = false, description = "Optional: DMS specific filter to exclude purchase orders dedicated to non-forecastable demand")
    private String filter2 = "";

	@Attributes(minItems = 1, uniqueItems = true)
    private List<PurchaseOrderItem> orders = Arrays.asList(new PurchaseOrderItem());

	public String getExtractionDateTime() {
		return extractionDateTime;
	}

	public void setExtractionDateTime(String extractionDateTime) {
		this.extractionDateTime = extractionDateTime;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderAgco() {
		return orderAgco;
	}

	public void setOrderAgco(String orderAgco) {
		this.orderAgco = orderAgco;
	}

	public String getDealerNumber() {
		return dealerNumber;
	}

	public void setDealerNumber(String dealerNumber) {
		this.dealerNumber = dealerNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getFilter1() {
		return filter1;
	}

	public void setFilter1(String filter1) {
		this.filter1 = filter1;
	}

	public String getFilter3() {
		return filter3;
	}

	public void setFilter3(String filter3) {
		this.filter3 = filter3;
	}

	public String getFilter2() {
		return filter2;
	}

	public void setFilter2(String filter2) {
		this.filter2 = filter2;
	}

	public List<PurchaseOrderItem> getOrders() {
		return orders;
	}

	public void setOrders(List<PurchaseOrderItem> orders) {
		this.orders = orders;
	}
    
}
