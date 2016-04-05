package br.com.diabloapp.enums;

public enum CharacterClassEnum {
	
	CRUZADER(0),
	BARBARIA(1),
	DEMON_HUNTER(2),
	MONK(3),
	WITCH_DOCTOR(4),
	WIZARD(5);
	
	private int codigo;
	
	private CharacterClassEnum(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
}
