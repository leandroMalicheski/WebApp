package br.com.diabloapp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.diabloapp.bean.ItemCategory;
import br.com.diabloapp.dao.ICategoryDAO;
import br.com.diabloapp.enums.CategoryEnum;

public class CategoryDAO implements ICategoryDAO<ItemCategory> {

	@Override
	public List<ItemCategory> listCategories() {
		return generateCategories();
	}

	private List<ItemCategory> generateCategories() {
		List<ItemCategory> categories = new ArrayList<ItemCategory>();
		
		ItemCategory category = new ItemCategory();
		category.setId(CategoryEnum.HEAD.getId());
		category.setName(CategoryEnum.HEAD.getDescription());
		category.setImagePath("images/equipment/head/olharTzoKrir.PNG");

		ItemCategory category1 = new ItemCategory();
		category1.setId(CategoryEnum.SHOULDER.getId());
		category1.setName(CategoryEnum.SHOULDER.getDescription());
		category1.setImagePath("images/equipment/shoulder/corrupicao.PNG");

		ItemCategory category2 = new ItemCategory();
		category2.setId(CategoryEnum.TORSO.getId());
		category2.setName(CategoryEnum.TORSO.getDescription());
		category2.setImagePath("images/equipment/torso/capaDeCinzas.PNG");

		ItemCategory category3 = new ItemCategory();
		category3.setId(CategoryEnum.HAND.getId());
		category3.setName(CategoryEnum.HAND.getDescription());
		category3.setImagePath("images/equipment/hands/punhosDeMago.PNG");

		ItemCategory category4 = new ItemCategory();
		category4.setId(CategoryEnum.BELT.getId());
		category4.setName(CategoryEnum.BELT.getDescription());
		category4.setImagePath("images/equipment/belts/horaDasBruxas.PNG");

		ItemCategory category5 = new ItemCategory();
		category5.setId(CategoryEnum.RING.getId());
		category5.setName(CategoryEnum.RING.getDescription());
		category5.setImagePath("images/equipment/rings/litaniaDosDestemidos.PNG");

		ItemCategory category6 = new ItemCategory();
		category6.setId(CategoryEnum.BRACERS.getId());
		category6.setName("Bracers");
		category6.setImagePath("images/equipment/bracers/orgulhoDoMalhado.PNG");

		ItemCategory category7 = new ItemCategory();
		category7.setId(7);
		category7.setName("Legs");
		category7.setImagePath("images/equipment/legs/calcasMandigueirasDoSenhorYan.PNG");

		ItemCategory category8 = new ItemCategory();
		category8.setId(8);
		category8.setName("Amulets");
		category8.setImagePath("images/equipment/amulet/amuletoInfernigneo.PNG");

		ItemCategory category9 = new ItemCategory();
		category9.setId(9);
		category9.setName("Weapon");
		category9.setImagePath("images/equipment/weapons/in-geon.PNG");

		ItemCategory category10 = new ItemCategory();
		category10.setId(10);
		category10.setName("Boots");
		category10.setImagePath("images/equipment/boots/asBotasMaisRusticas.PNG");	
		
		categories.add(category);
		categories.add(category1);
		categories.add(category2);
		categories.add(category3);
		categories.add(category4);
		categories.add(category5);
		categories.add(category6);
		categories.add(category7);
		categories.add(category8);
		categories.add(category9);
		categories.add(category10);
		
		return categories;
	}
}
