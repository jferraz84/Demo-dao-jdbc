package aplication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class ProgramaJDBC {

	public static void main(String[] args) {
		
		//Department obj = new Department(1, "Books");
		
		//Seller sl = new Seller(21,"Jorge", "jferraz@cpqd.com.br", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		
		System.out.println(seller);
		//System.out.println(obj);
		
	}

}
