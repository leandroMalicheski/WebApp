(function() {
	var app = angular.module("controllesModule", [])
	
	app.controller('PanelController', function() {
		this.tab = 0;
		this.selectTab = function(setTab) {
			this.tab = setTab;
		}
		this.isSelected = function(checkTab) {
			return this.tab === checkTab;
		}
	});
	
	
	
	app.controller('CreatePageCtrl', function() {
		this.classList = classList;
		this.character = {};
		this.shoulderList = itemList;
		this.characters = characters;
		this.showModal = false;
	   		
		this.addCharacter = function () {
			characters.push(this.character)
		}

	});
	
	app.controller('CharacterCtrl', function() {
		this.classList = classList;	
	});
	
	app.controller('CategoryController', function($http, $scope) {
		$scope.categories = {};
		this.getItemCategoryList = function () {
			var _headers = {headers : {'Content-Type' : 'application/x-www-form-urlencoded; charset=UTF-8'}};
			$http.get("http://localhost:8080/category/list", _headers).success(function(data) {
				console.log(data);
				$scope.categories = data;
			}); 
		}
	})
	
	app.controller('CharacterController', function($http, $scope) {
		$scope.characters = {};

		this.getCharacterList = function () {
			var _headers = {headers : {'Content-Type' : 'application/x-www-form-urlencoded; charset=UTF-8'}};
			$http.get("http://localhost:8080/character/list", _headers).success(function(data) {
				console.log(data);
				$scope.characters = data;
			}); 
		}
	});
	
	app.controller('ItemsListCtrl', function() {
		this.itemList = itemList;
		
	});
	
	var itemList = [
	                {id: 1, name: 'Olhar de Tzo Krin', 
	                	image: 'images/equipment/head/olharTzoKrir.PNG', 
	                	subcat:'Pedra dos Espiritos Lendaria',
	                	primaria:'Aumenta em 125–150% o dano de Onda de Luz (Apenas para o Monge)',
	                	secundaria:'Onda de Luz agora é lançada no inimigo.'
	                },
	                {id: 1, name: 'Head', image: 'images/equipment/head/olharTzoKrir.PNG'}]
	
	var classList = [
	                 {id: 1, name: 'Barbarian'},
	                 {id: 2, name: 'Cruzader'},
	                 {id: 3, name: 'Demon Hunter'},
	                 {id: 4, name: 'Monk'},
	                 {id: 5, name: 'Witch Doctor'},	
	                 {id: 6, name: 'Wizard'},
	                 ]
	
	var characters = [
	      			{
	      				id : 1,
	      				name : 'Buda',
	      				vocation : 'Monk',
	      				image : 'images/classes/MonkClass.PNG',
	      				equipment : {
	      					head : 'images/equipment/head/olharTzoKrir.PNG',
	      					shoulder : 'images/equipment/shoulder/corrupicao.PNG',
	      					torso : 'images/equipment/torso/capaDeCinzas.PNG',
	      					amulet : 'images/equipment/amulet/amuletoInfernigneo.PNG',
	      					hand : 'images/equipment/hands/punhosDeMago.PNG',
	      					belt : 'images/equipment/belts/horaDasBruxas.PNG',
	      					bracers : 'images/equipment/bracers/orgulhoDoMalhado.PNG',
	      					ringleft : 'images/equipment/rings/litaniaDosDestemidos.PNG',
	      					legs : 'images/equipment/legs/calcasMandigueirasDoSenhorYan.PNG',
	      					ringright : 'images/equipment/rings/oLamentoDoHospedeiro.PNG',
	      					weaponleft : 'images/equipment/weapons/laminaDeKyoshiro.PNG',
	      					boots : 'images/equipment/boots/asBotasMaisRusticas.PNG',
	      					weaponright : 'images/equipment/weapons/in-geon.PNG',
	      					kanayArmor : 'images/equipment/torso/capaDeCinzas.PNG',
	      					kanayWeapon : 'images/equipment/weapons/in-geon.PNG',
	      					kanayJewelry : 'images/equipment/rings/litaniaDosDestemidos.PNG',
	      				},
	      				skills : [
	      						{
	      							name : 'Punhos Trovejantes',
	      							image : 'images/skills/PunhosTrovejantes.PNG',
	      							description : 'Teleporta para o alvo e desfere uma série de socos rápidos que causam dano Elétrico equivalente a 200% do dano de arma.',
	      							runa : {
	      								name : 'Relampago Encadeado',
	      								image : 'images/skills/runas/relampagoEncadeado.png',
	      								description : 'Libera raios de poder sagrado a cada três golpes, causando dano Sagrado equivalente a 240% do dano de arma a até 3 inimigos adicionais.'
	      							}
	      						},
	      						{
	      							name : 'Rabo de Arraia',
	      							image : 'images/skills/RaboDeArraia.PNG',
	      							description : 'Executa um chute mortal que causa 755% de dano de arma como Físico.'
	      						} ],
	      				passiveSkills : [
	      						{
	      							name : 'Determinacao',
	      							image : 'images/passiveSkills/Determinacao.PNG',
	      							description : 'O dano que você causa reduz o dano recebido do inimigo em 20% durante 4 segundos.'
	      						},
	      						{
	      							name : 'Pes Ligeiros',
	      							image : 'images/passiveSkills/PesLigeiros.PNG',
	      							description : 'Aumenta a velocidade de movimento em 10%.'
	      						} ]
	      			},
	      			{
	      				id : 2,
	      				name : 'Mountain',
	      				vocation : 'Cruzader',
	      				image : 'images/classes/CrusaderClass.PNG',
	      				equipment : {
	      					head : 'images/equipment/head/emptyCruzader.PNG',
	      					shoulder : 'images/equipment/shoulder/empty.PNG',
	      					torso : 'images/equipment/torso/emptyCruzader.PNG',
	      					amulet : 'images/equipment/amulet/empty.PNG',
	      					hand : 'images/equipment/hands/empty.PNG',
	      					belt : 'images/equipment/belts/emptyCruzader.PNG',
	      					bracers : 'images/equipment/bracers/empty.PNG',
	      					ringleft : 'images/equipment/rings/emptyLeft.PNG',
	      					legs : 'images/equipment/legs/emptyCruzader.PNG',
	      					ringright : 'images/equipment/rings/emptyRight.PNG',
	      					weaponleft : 'images/equipment/weapons/empty.PNG',
	      					boots : 'images/equipment/boots/empty.PNG',
	      					weaponright : 'images/equipment/shield/empty.PNG'
	      				},
	      				skills : [
	      						{
	      							name : 'Punhos Trovejantes',
	      							image : 'images/skills/PunhosTrovejantes.PNG',
	      							description : 'Teleporta para o alvo e desfere uma série de socos rápidos que causam dano Elétrico equivalente a 200% do dano de arma.'
	      						},
	      						{
	      							name : 'Rabo de Arraia',
	      							image : 'images/skills/RaboDeArraia.PNG',
	      							description : 'Executa um chute mortal que causa 755% de dano de arma como Físico.'
	      						} ],
	      				passiveSkills : [
	      						{
	      							name : 'Determinacao',
	      							image : 'images/passiveSkills/Determinacao.PNG',
	      							description : 'O dano que você causa reduz o dano recebido do inimigo em 20% durante 4 segundos.'
	      						},
	      						{
	      							name : 'Pes Ligeiros',
	      							image : 'images/passiveSkills/PesLigeiros.PNG',
	      							description : 'Aumenta a velocidade de movimento em 10%.'
	      						} ]
	      			}, 
	      			];
})();