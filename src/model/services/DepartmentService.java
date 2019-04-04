package model.services;

import java.util.List;

import model.dao.DepartmentDao;
import model.dao.DaoFactory;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll(){
		return dao.findAll();
	}
	
	public void saveOrUpdate(Department obj) {
		if(obj.getId() == null) { // inserindo novo departmento
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
}
