package br.com.diabloapp.bean;

public class Item {
	
	long id;
	String name;
	String classification;
	String primaryHability;
	String secondaryHability;
	String imgPath;
	int categoryId;
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getPrimaryHability() {
		return primaryHability;
	}
	public void setPrimaryHability(String primaryHability) {
		this.primaryHability = primaryHability;
	}
	public String getSecondaryHability() {
		return secondaryHability;
	}
	public void setSecondaryHability(String secondaryHability) {
		this.secondaryHability = secondaryHability;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}	
}
