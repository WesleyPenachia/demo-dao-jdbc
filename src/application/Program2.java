package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("====TEST 1: Department insert ==========");
		Department department = new Department(null,"Foods");
		departmentDao.insert(department);
		System.out.println("Inserted! New id= " + department.getId());
		
		System.out.println("====TEST 2: Department update ==========");
		department = new Department(2,"Panelas");
		departmentDao.update(department);
		System.out.println("Updated! the id= " + department.getId());
		
		System.out.println("====TEST 3: Department Delete ==========");
		System.out.println("Insert id from delete ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Done! Completed ");	
		
		System.out.println("====TEST 4: Department FindById ==========");
		System.out.println("Insert id from Find ");
		id = sc.nextInt();
		department = departmentDao.findById(id);
		System.out.println(department);
		
		System.out.println("====TEST 5: Department FindAll ==========");
		List<Department>list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);	
		}
		sc.close();
	}

}
