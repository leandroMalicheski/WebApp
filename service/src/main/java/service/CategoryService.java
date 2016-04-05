package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.diabloapp.bean.ItemCategory;
import br.com.diabloapp.dao.impl.CategoryDAO;

@RestController
public class CategoryService {

	@CrossOrigin(origins = "http://localhost:8085")
	@RequestMapping(value = "/category/list", method = RequestMethod.GET)
	public List<ItemCategory> list() {
		CategoryDAO categoryDAO = new CategoryDAO();
		return (ArrayList<ItemCategory>) categoryDAO.listCategories();
	}
}
