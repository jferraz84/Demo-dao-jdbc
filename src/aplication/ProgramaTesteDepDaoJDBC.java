package aplication;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class ProgramaTesteDepDaoJDBC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== Teste n° 1: Department Insert ====");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserido! Novo id = " + newDepartment.getId());
		
		System.out.println("===============================================");
		System.out.println("==== Teste n° 2: Department Update ====");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("===============================================");
		System.out.println("=== Teste n° 3: Department findById ===");
		Department  dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("===============================================");
		System.out.println("==== Teste n° 4: seller Delete ====");
		System.out.print("Digite um id para ser Deletado: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete executado !");
		
		System.out.println("===============================================");
		System.out.println("=== Teste n° 5: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		
		sc.close();

	}

}
