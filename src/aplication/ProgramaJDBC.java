package aplication;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class ProgramaJDBC {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller sl = new Seller(21,"Jorge", "jferraz@cpqd.com.br", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(sl);
		//System.out.println(obj);
		
	}

}
