package com.jpm.pizza.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.boot.SpringApplication;

import com.jpm.pizza.springboot.SpringBoot2SecuredJpaRest006Application;

@Entity
@Table(name="MASTERITEMS")

public class Items {

	
	@Id
	@SequenceGenerator(name="ITEM_GEN",sequenceName="item_rest_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEM_GEN")
	@Column(name="ITEMID")
	private Long itemId;
	
	//@NotNull(message="PizzaItem Name is Null!")
	//@Size(min=3,max=30,message="Pizza ItemName should be min 3 and max 30 charecter only")
	@Column(name="ITEMNAME")
	private String itemName;
	//@NotNull(message="PizzaItemDescr Name is Null!")
	//@Size(min=10,max=30,message="Pizza ItemDescr should be min 10 and max 30 charecter only")
	@Column(name="ITEMDESCR")
	private String itemDescr;
	//@NotNull(message="PizzaItemStatus is Null!")
	//@Size(min=10,max=30,message="PizzaItemStatus should be min 10 and max 30 charecter only")
	@Column(name="ITEMSTATUS")
	private String itemStatus;
	//@Min(value=3, message="PizzaItemPrice should be min 3 digits")
	//@Max(value=4, message="PizzaItemPrice should be max 8 digits")
	@Column(name="ITEMPRICE")
	private Integer itemPrice;
	@Column(name="ITEMIMAGE")//ITEM_IMAGE
	private String itemImage;
	

	public Items() {
		super();
	}
	
	public Items(String itemName,String itemDescr,String itemStatus,Integer itemPrice,String itemImage) {
		super();
		//this.itemId = itemId;
		this.itemName = itemName;
		this.itemDescr = itemDescr;
		this.itemStatus = itemStatus;
		this.itemPrice = itemPrice;
		this.itemImage = itemImage;
	}


	public Long getItemId() {
		return itemId;
	}


	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemDescr() {
		return itemDescr;
	}


	public void setItemDescr(String itemDescr) {
		this.itemDescr = itemDescr;
	}


	public String getItemStatus() {
		return itemStatus;
	}


	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}


	public Integer getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}


	public String getItemImage() {
		return itemImage;
	}


	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}


	@Override
	public String toString() {
		return "ItemsService [itemId=" + itemId + ", itemName=" + itemName + ", itemDescr=" + itemDescr + ", itemStatus="
				+ itemStatus + ", itemPrice=" + itemPrice + ", itemImage=" + itemImage + "]";
	}	
	
	
	
}
