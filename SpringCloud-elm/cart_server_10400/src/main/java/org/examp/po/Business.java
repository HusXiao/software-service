package org.examp.po;

import java.util.List;

public class Business {
	private Integer businessId;
	private String businessName;
	private String businessAddress;
	private String businessExplain;
	private String businessImg;
	private Integer orderTypeId;
	private Double startPrice = 0.00;
	private Double deliveryPrice;
	private String remarks;

	private List<Food> foodList;

	public Integer getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getBusinessExplain() {
		return businessExplain;
	}

	public void setBusinessExplain(String businessExplain) {
		this.businessExplain = businessExplain;
	}

	public String getBusinessImg() {
		return businessImg;
	}

	public void setBusinessImg(String businessImg) {
		this.businessImg = businessImg;
	}

	public Integer getOrderTypeId() {
		return orderTypeId;
	}

	public void setOrderTypeId(Integer orderTypeId) {
		this.orderTypeId = orderTypeId;
	}

	public double getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(Double startPrice) {
		this.startPrice = startPrice;
	}

	public double getDeliveryPrice() {
		return deliveryPrice;
	}

	public void setDeliveryPrice(Double deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setFoodList(List<org.examp.po.Food> foodList) {
        this.foodList = foodList;
    }

	public Business() {
    }

    public Business(Integer businessId, String businessName, String businessAddress, String businessExplain, String businessImg, Integer orderTypeId, Double startPrice, Double deliveryPrice, String remarks, List<Food> foodList) {
        this.businessId = businessId;
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.businessExplain = businessExplain;
        this.businessImg = businessImg;
        this.orderTypeId = orderTypeId;
        this.startPrice = startPrice;
        this.deliveryPrice = deliveryPrice;
        this.remarks = remarks;
        this.foodList = foodList;
    }

    public List<Food> getFoodList() {
    	  return foodList;
    	 }
}
