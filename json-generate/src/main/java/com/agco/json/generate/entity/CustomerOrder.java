package com.agco.json.generate.entity;

import java.util.List;

import com.github.reinert.jjschema.Attributes;


public class CustomerOrder {

	@Attributes(format = "date-time", required = true, description = "Local AGCO date when the extract was run.")
	private String extractionDateTime; //DateTime 2016-11-23T10:45:00+03:00 - 2016-11-23

	@Attributes(maxLength = 50, required = true, description = "Unique Customer Order Number.")
	private String orderId;

	@Attributes(maxLength = 50, required = true, description = "Unique Customer ID. Can be used to filter non-plannable demand or to create reports for specific customers.")
	private String customerId;

	@Attributes(maxLength = 100, required = false, description = "Customer Name.")
	private String customerName;

	@Attributes(maxLength = 8, required = true, description = "Dealer’s location account number. The number sent will be the AGCO code")
	private String dealerNumber = "1654549";

	@Attributes(format = "full-date", required = true, description = "Date of order receipt / order entry into system (if possible line level data).")
	private String orderDate; //Date YYYY-MM-DD

	@Attributes(maxLength = 1, required = true, description = "Optional: Type of order, e.g. sale, workshop, transfer, return, etc.; used for filtering non-forecastable demand, e.g. adjustments")
	private String orderType;
	
	@Attributes(maxLength = 20, required = false, description = "Type of requested delivery, e.g.  Regular, Expedite")
	private String deliveryType;

	@Attributes(maxLength = 100, required = false, description = "Dealer Specific field.")
	private String dealerFilter1;

	@Attributes(maxLength = 100, required = false, description = "Dealer Specific field.")
	private String dealerFilter2;

	@Attributes(maxLength = 100, required = false, description = "Dealer Specific field.")
	private String dealerFilter3;


	@Attributes(minItems = 1, uniqueItems = true)
	private List<CustomerOrderItem> orders;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDealerNumber() {
		return dealerNumber;
	}

	public void setDealerNumber(String dealerNumber) {
		this.dealerNumber = dealerNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getDealerFilter2() {
		return dealerFilter2;
	}

	public void setDealerFilter2(String dealerFilter2) {
		this.dealerFilter2 = dealerFilter2;
	}

	public String getDealerFilter1() {
		return dealerFilter1;
	}

	public void setDealerFilter1(String dealerFilter1) {
		this.dealerFilter1 = dealerFilter1;
	}

	public String getDealerFilter3() {
		return dealerFilter3;
	}

	public void setDealerFilter3(String dealerFilter3) {
		this.dealerFilter3 = dealerFilter3;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<CustomerOrderItem> getOrders() {
		return orders;
	}

	public void setOrders(List<CustomerOrderItem> orders) {
		this.orders = orders;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getExtractionDateTime() {
		return extractionDateTime;
	}

	public void setExtractionDateTime(String extractionDateTime) {
		this.extractionDateTime = extractionDateTime;
	}

	

}
