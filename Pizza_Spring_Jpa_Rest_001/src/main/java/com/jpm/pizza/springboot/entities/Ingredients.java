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

@Entity
@Table(name="masteringredient")
public class Ingredients {

	@Id
	@SequenceGenerator(name="INGRE_GEN",sequenceName="ingredient_rest_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INGRE_GEN")
	@Column(name="INGRIDEIENTID")
	private Long ingredeientId;
	//@NotNull(message="IngreientItem Name is Null!")
	//@Size(min=3,max=30,message="IngredeientName should be min 3 and max 30 charecter only")
	@Column(name="INGRIDEIENTNAME")
	private String ingredeientName;
	//@NotNull(message="IngreientDesc Name is Null!")
	//@Size(min=3,max=30,message="IngreientDesc should be min 3 and max 30 charecter only")
	@Column(name="INGRIDEIENTDESCR")
	private String ingredeientDescr;
	//@Min(value=3, message="IngredientPrice should be min 3 digits")
	//@Max(value=4, message="IngredientPrice should be max 8 digits")
	@Column(name="INGRIDEIENTPRICE")
	private Float ingredientPrice;
	@Column(name="INGRIDEIENTIMAGE")
	private String ingredientImage;
	
	
	public Ingredients() {
		super();
	}


	public Ingredients(String ingredeientName, String ingredeientDescr, Float ingredientPrice,
			String ingredientImage) {
		super();
		//this.ingredeientId = ingredeientId;
		this.ingredeientName = ingredeientName;
		this.ingredeientDescr = ingredeientDescr;
		this.ingredientPrice = ingredientPrice;
		this.ingredientImage = ingredientImage;
	}


	public Long getIngredeientId() {
		return ingredeientId;
	}


	public void setIngredeientId(Long ingredeientId) {
		this.ingredeientId = ingredeientId;
	}


	public String getIngredeientName() {
		return ingredeientName;
	}


	public void setIngredeientName(String ingredeientName) {
		this.ingredeientName = ingredeientName;
	}


	public String getIngredeientDescr() {
		return ingredeientDescr;
	}


	public void setIngredeientDescr(String ingredeientDescr) {
		this.ingredeientDescr = ingredeientDescr;
	}


	public Float getIngredientPrice() {
		return ingredientPrice;
	}


	public void setIngredientPrice(Float ingredientPrice) {
		this.ingredientPrice = ingredientPrice;
	}


	public String getIngredientImage() {
		return ingredientImage;
	}


	public void setIngredientImage(String ingredientImage) {
		this.ingredientImage = ingredientImage;
	}


	@Override
	public String toString() {
		return "IngredientsService [ingredeientId=" + ingredeientId + ", ingredeientName=" + ingredeientName
				+ ", ingredeientDescr=" + ingredeientDescr + ", ingredientPrice=" + ingredientPrice
				+ ", ingredientImage=" + ingredientImage + "]";
	}
	
	
	
	
}
