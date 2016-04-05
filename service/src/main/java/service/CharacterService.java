package service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.diabloapp.bean.Character;
import br.com.diabloapp.dao.impl.CharacterDAO;

@RestController
public class CharacterService {

	@CrossOrigin(origins = "http://localhost:8085")
	@RequestMapping(value = "/character/list", method = RequestMethod.GET)
	public List<Character> list(){
		CharacterDAO characterDAO = new CharacterDAO();
		return characterDAO.listCharacters();
		
	}
	
}
