package br.com.diabloapp.enums;

public enum CategoryEnum {
	HEAD(0,"Head"), 
	SHOULDER(1,"Shoulder"), 
	TORSO(2,"Torso"), 
	HAND(3,"Hand"), 
	BELT(4,"Belt"), 
	RING(5,"Ring"), 
	BRACERS(6,"Brancers"), 
	LEGS(7,"Legs"), 
	AMULET(8,"Amulets"), 
	WEAPON(9,"Weapon"), 
	BOOTS(10,"Boots");
	
	private int id;

	private String description;
	
	private CategoryEnum(int id, String description){
		this.id = id;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
}
