package br.com.diabloapp.dao;

import java.util.List;

public interface ICharacterDAO<T> {

	public List<T> listCharacters();
	public T getCharacterById();
	public boolean insertCharacter(T character);
}
