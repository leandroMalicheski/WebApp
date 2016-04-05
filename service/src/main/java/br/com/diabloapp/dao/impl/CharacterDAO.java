package br.com.diabloapp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.diabloapp.bean.ActiveSkill;
import br.com.diabloapp.bean.Character;
import br.com.diabloapp.bean.CharacterClass;
import br.com.diabloapp.bean.Item;
import br.com.diabloapp.bean.KanaysCubeItem;
import br.com.diabloapp.bean.PassiveSkill;
import br.com.diabloapp.bean.Rune;
import br.com.diabloapp.dao.ICharacterDAO;
import br.com.diabloapp.enums.CategoryEnum;

public class CharacterDAO implements ICharacterDAO<Character> {

	Item weaponRight = new Item();
	Item boots = new Item();
	Item weaponLeft = new Item();
	Item ringRight = new Item();
	Item legs = new Item();
	Item ringLeft = new Item();
	Item bracers = new Item();
	Item belt = new Item();
	Item hand = new Item();
	Item amulet = new Item();
	Item torso = new Item();
	Item shoulder = new Item();
	Item head = new Item();
	
	@Override
	public List<Character> listCharacters() {
		return getCharacters();
	}

	private List<Character> getCharacters() {
		
		List<Character> characterList = new ArrayList<Character>();
		for (int i = 0; i < 2; i++) {
			Character character = new Character();
			character = generateItems(character);
			
			character.setKanaysCubeItems(generateKanaysItems());
			character.setId(0);
			character.setName("Buda");
			character.setActiveSkills(generateActiveSkill());
			character.setPassiveSkills(generatePassiveSkill());
			CharacterClass characterClass = new CharacterClass();
			characterClass.setName("Monk");
			characterClass.setImgPath("images/classes/MonkClass.PNG");
			character.setCharacterClass(characterClass);
			characterList.add(character);
		}
				
		return characterList; 
	}

	private List<PassiveSkill> generatePassiveSkill() {
		PassiveSkill passiveSkill = new PassiveSkill();
		passiveSkill.setName("Determinacao");
		passiveSkill.setImgPath("images/passiveSkills/Determinacao.PNG");
		passiveSkill.setDescription("O dano que você causa reduz o dano recebido do inimigo em 20% durante 4 segundos.");
		
		PassiveSkill passiveSkill1 = new PassiveSkill();
		passiveSkill1.setName("Pes Ligeiros");
		passiveSkill1.setImgPath("images/passiveSkills/PesLigeiros.PNG");
		passiveSkill1.setDescription("Aumenta a velocidade de movimento em 10%.");
		
		List<PassiveSkill> activeSkillList = new ArrayList<PassiveSkill>();
		activeSkillList.add(passiveSkill);
		activeSkillList.add(passiveSkill1);
		return activeSkillList;
	}

	private List<ActiveSkill> generateActiveSkill() {
		ActiveSkill activeSkill = new ActiveSkill();
		activeSkill.setName("Punhos Trovejantes");
		activeSkill.setImgPath("images/skills/PunhosTrovejantes.PNG");
		activeSkill.setDescription("Teleporta para o alvo e desfere uma série de socos rápidos que causam dano Elétrico equivalente a 200% do dano de arma.");
		
		Rune rune = new Rune();
		rune.setName("Relampago Encadeado");
		rune.setImgPath("images/skills/runas/relampagoEncadeado.png");
		rune.setDescription("Libera raios de poder sagrado a cada três golpes, causando dano Sagrado equivalente a 240% do dano de arma a até 3 inimigos adicionais.");
		activeSkill.setRune(rune);
		
		ActiveSkill activeSkill1 = new ActiveSkill();
		activeSkill1.setName("Rabo de Arraia");
		activeSkill1.setImgPath("images/skills/RaboDeArraia.PNG");
		activeSkill1.setDescription("Executa um chute mortal que causa 755% de dano de arma como Físico.");
		
		Rune rune1 = new Rune();
		rune1.setName("Relampago Encadeado");
		rune1.setImgPath("images/skills/runas/relampagoEncadeado.png");
		rune1.setDescription("Libera raios de poder sagrado a cada três golpes, causando dano Sagrado equivalente a 240% do dano de arma a até 3 inimigos adicionais.");
		activeSkill1.setRune(rune1);
		
		List<ActiveSkill> activeSkillList = new ArrayList<ActiveSkill>();
		activeSkillList.add(activeSkill);
		activeSkillList.add(activeSkill1);
		
		return activeSkillList;
	}

	private List<KanaysCubeItem> generateKanaysItems() {
		KanaysCubeItem legs = new KanaysCubeItem();
		legs.setId(0);
		legs.setImgPath("images/equipment/legs/calcasMandigueirasDoSenhorYan.PNG");
		legs.setName("Calcas Mandigueiras do Senhor Yan");
		legs.setPrimaryHability("Test");
		legs.setSecondaryHability("Test");
		legs.setClassification("Lendario");
		legs.setCategoryId(CategoryEnum.LEGS.getId());
		
		KanaysCubeItem weapon = new KanaysCubeItem();
		weapon.setId(0);
		weapon.setImgPath("images/equipment/weapons/laminaDeKyoshiro.PNG");
		weapon.setName("O Lamento do Hospedeiro");
		weapon.setPrimaryHability("Test");
		weapon.setSecondaryHability("Test");
		weapon.setClassification("Item de Lendario");
		weapon.setCategoryId(CategoryEnum.WEAPON.getId());
		
		KanaysCubeItem amulet = new KanaysCubeItem();
		amulet.setId(0);
		amulet.setImgPath("images/equipment/amulet/amuletoInfernigneo.PNG");
		amulet.setName("Amuleto Infernigneo");
		amulet.setPrimaryHability("Test");
		amulet.setSecondaryHability("Test");
		amulet.setClassification("Lendario");
		amulet.setCategoryId(CategoryEnum.AMULET.getId());
		
		List<KanaysCubeItem> characterKanaysSet = new ArrayList<KanaysCubeItem>();
		characterKanaysSet.add(amulet);
		characterKanaysSet.add(legs);
		characterKanaysSet.add(weapon);
		return characterKanaysSet;
	}

	private Character generateItems(Character character) {
		
		head.setId(0);
		head.setImgPath("images/equipment/head/olharTzoKrir.PNG");
		head.setName("Olhar de Tzo Krir");
		head.setPrimaryHability("Test");
		head.setSecondaryHability("Test");
		head.setClassification("Lendario");
		head.setCategoryId(CategoryEnum.HEAD.getId());
		
		shoulder.setId(0);
		shoulder.setImgPath("images/equipment/shoulder/corrupicao.PNG");
		shoulder.setName("Corrupcao");
		shoulder.setPrimaryHability("Test");
		shoulder.setSecondaryHability("Test");
		shoulder.setClassification("Lendario");
		shoulder.setCategoryId(CategoryEnum.SHOULDER.getId());
		
		torso.setId(0);
		torso.setImgPath("images/equipment/torso/capaDeCinzas.PNG");
		torso.setName("Capa de Cinzas");
		torso.setPrimaryHability("Test");
		torso.setSecondaryHability("Test");
		torso.setClassification("Lendario");
		torso.setCategoryId(CategoryEnum.TORSO.getId());
		
		amulet.setId(0);
		amulet.setImgPath("images/equipment/amulet/amuletoInfernigneo.PNG");
		amulet.setName("Amuleto Infernigneo");
		amulet.setPrimaryHability("Test");
		amulet.setSecondaryHability("Test");
		amulet.setClassification("Lendario");
		amulet.setCategoryId(CategoryEnum.AMULET.getId());
		
		hand.setId(0);
		hand.setImgPath("images/equipment/hands/punhosDeMago.PNG");
		hand.setName("Punhos De Mago");
		hand.setPrimaryHability("Test");
		hand.setSecondaryHability("Test");
		hand.setClassification("Lendario");
		hand.setCategoryId(CategoryEnum.HAND.getId());
	
		belt.setId(0);
		belt.setImgPath("images/equipment/belts/horaDasBruxas.PNG");
		belt.setName("Hora Das Bruxas");
		belt.setPrimaryHability("Test");
		belt.setSecondaryHability("Test");
		belt.setClassification("Lendario");
		belt.setCategoryId(CategoryEnum.BELT.getId());
	
		bracers.setId(0);
		bracers.setImgPath("images/equipment/bracers/orgulhoDoMalhado.PNG");
		bracers.setName("Orgulho do Malhado");
		bracers.setPrimaryHability("Test");
		bracers.setSecondaryHability("Test");
		bracers.setClassification("Lendario");
		bracers.setCategoryId(CategoryEnum.BRACERS.getId());
	
		ringLeft.setId(0);
		ringLeft.setImgPath("images/equipment/rings/litaniaDosDestemidos.PNG");
		ringLeft.setName("Litania Dos Destemidos");
		ringLeft.setPrimaryHability("Test");
		ringLeft.setSecondaryHability("Test");
		ringLeft.setClassification("Item de Set");
		ringLeft.setCategoryId(CategoryEnum.RING.getId());
		
		legs.setId(0);
		legs.setImgPath("images/equipment/legs/calcasMandigueirasDoSenhorYan.PNG");
		legs.setName("Calcas Mandigueiras do Senhor Yan");
		legs.setPrimaryHability("Test");
		legs.setSecondaryHability("Test");
		legs.setClassification("Lendario");
		legs.setCategoryId(CategoryEnum.LEGS.getId());
		
		ringRight.setId(0);
		ringRight.setImgPath("images/equipment/rings/oLamentoDoHospedeiro.PNG");
		ringRight.setName("O Lamento do Hospedeiro");
		ringRight.setPrimaryHability("Test");
		ringRight.setSecondaryHability("Test");
		ringRight.setClassification("Item de Lendario");
		ringRight.setCategoryId(CategoryEnum.RING.getId());
		
		weaponLeft.setId(0);
		weaponLeft.setImgPath("images/equipment/weapons/laminaDeKyoshiro.PNG");
		weaponLeft.setName("O Lamento do Hospedeiro");
		weaponLeft.setPrimaryHability("Test");
		weaponLeft.setSecondaryHability("Test");
		weaponLeft.setClassification("Item de Lendario");
		weaponLeft.setCategoryId(CategoryEnum.WEAPON.getId());
		
		boots.setId(0);
		boots.setImgPath("images/equipment/boots/asBotasMaisRusticas.PNG");
		boots.setName("As Botas Mais Rusticas");
		boots.setPrimaryHability("Test");
		boots.setSecondaryHability("Test");
		boots.setClassification("Item de Lendario");
		boots.setCategoryId(CategoryEnum.BOOTS.getId());
		
		
		weaponRight.setId(0);
		weaponRight.setImgPath("images/equipment/weapons/in-geon.PNG");
		weaponRight.setName("As Botas Mais Rusticas");
		weaponRight.setPrimaryHability("Test");
		weaponRight.setSecondaryHability("Test");
		weaponRight.setClassification("Item de Lendario");
		weaponRight.setCategoryId(CategoryEnum.WEAPON.getId());
		

		character.setAmulet(amulet);
		character.setBelt(belt);
		character.setBoots(boots);
		character.setBracers(bracers);
		character.setHand(hand);
		character.setHead(head);
		character.setLeftRing(ringLeft);
		character.setLeftWeapon(weaponLeft);
		character.setLegs(legs);
		character.setRightRing(ringRight);
		character.setRightWeapon(weaponRight);
		character.setShoulder(shoulder);
		character.setTorso(torso);
		return character;
	}

	@Override
	public Character getCharacterById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertCharacter(Character character) {
		// TODO Auto-generated method stub
		return false;
	}

}
