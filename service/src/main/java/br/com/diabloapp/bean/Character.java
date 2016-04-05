package br.com.diabloapp.bean;

import java.util.List;

public class Character {

	long id;
	String name;
	CharacterClass characterClass;
	Item head;
	Item shoulder;
	Item torso;
	Item amulet;
	Item hand;
	Item belt;
	Item bracers;
	Item rightRing;
	Item leftRing;
	Item legs;
	Item rightWeapon;
	Item leftWeapon;
	Item boots;
	
	List<ActiveSkill> activeSkills;
	List<PassiveSkill> passiveSkills;
	List<KanaysCubeItem> kanaysCubeItems;
	
	public Item getHead() {
		return head;
	}
	public void setHead(Item head) {
		this.head = head;
	}
	public Item getShoulder() {
		return shoulder;
	}
	public void setShoulder(Item shoulder) {
		this.shoulder = shoulder;
	}
	public Item getTorso() {
		return torso;
	}
	public void setTorso(Item torso) {
		this.torso = torso;
	}
	public Item getAmulet() {
		return amulet;
	}
	public void setAmulet(Item amulet) {
		this.amulet = amulet;
	}
	public Item getHand() {
		return hand;
	}
	public void setHand(Item hand) {
		this.hand = hand;
	}
	public Item getBelt() {
		return belt;
	}
	public void setBelt(Item belt) {
		this.belt = belt;
	}
	public Item getBracers() {
		return bracers;
	}
	public void setBracers(Item bracers) {
		this.bracers = bracers;
	}
	public Item getRightRing() {
		return rightRing;
	}
	public void setRightRing(Item rightRing) {
		this.rightRing = rightRing;
	}
	public Item getLeftRing() {
		return leftRing;
	}
	public void setLeftRing(Item leftRing) {
		this.leftRing = leftRing;
	}
	public Item getLegs() {
		return legs;
	}
	public void setLegs(Item legs) {
		this.legs = legs;
	}
	public Item getRightWeapon() {
		return rightWeapon;
	}
	public void setRightWeapon(Item rightWeapon) {
		this.rightWeapon = rightWeapon;
	}
	public Item getLeftWeapon() {
		return leftWeapon;
	}
	public void setLeftWeapon(Item leftWeapon) {
		this.leftWeapon = leftWeapon;
	}
	public Item getBoots() {
		return boots;
	}
	public void setBoots(Item boots) {
		this.boots = boots;
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
	public CharacterClass getCharacterClass() {
		return characterClass;
	}
	public void setCharacterClass(CharacterClass characterClass) {
		this.characterClass = characterClass;
	}
	
	public List<ActiveSkill> getActiveSkills() {
		return activeSkills;
	}
	public void setActiveSkills(List<ActiveSkill> activeSkills) {
		this.activeSkills = activeSkills;
	}
	public List<PassiveSkill> getPassiveSkills() {
		return passiveSkills;
	}
	public void setPassiveSkills(List<PassiveSkill> passiveSkills) {
		this.passiveSkills = passiveSkills;
	}
	public List<KanaysCubeItem> getKanaysCubeItems() {
		return kanaysCubeItems;
	}
	public void setKanaysCubeItems(List<KanaysCubeItem> kanaysCubeItems) {
		this.kanaysCubeItems = kanaysCubeItems;
	}
	
}
