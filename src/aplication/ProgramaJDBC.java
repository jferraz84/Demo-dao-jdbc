package aplication;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class ProgramaJDBC {

	public static void main(String[] args) {
		
		//Department obj = new Department(1, "Books");
		
		//Seller sl = new Seller(21,"Jorge", "jferraz@cpqd.com.br", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Teste n° 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("===============================================");
		
		System.out.println("==== Teste n° 2: seller findByDapartmentId ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
			System.out.println("------------------------");
		}
	
		System.out.println("===============================================");
		
		System.out.println("==== Teste n° 3: seller findAll ====");
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
			System.out.println("------------------------");
			
		}
		
		System.out.println("===============================================");
		System.out.println("==== Teste n° 4: seller insert ====");
		Seller newSeller = new Seller(null , "Jorge", "jferraz@cpqd.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido! Novo id = " + newSeller.getId());
		
	}

}
