package inheritance_mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import inheritance_mapping.model.Apparal;
import inheritance_mapping.model.Book;
import inheritance_mapping.model.Product;
import inheritance_mapping.repository.ApparalRepository;
import inheritance_mapping.repository.BookRepository;
import inheritance_mapping.repository.ProductRepository;

@RestController
public class Inheritance_Controller {
	
	@Autowired
	ProductRepository prodRepository;
	
	@Autowired
	ApparalRepository apparalRepository;
	
	@Autowired
	BookRepository bookRepository;

	@RequestMapping(value="/addAllSample", method = RequestMethod.POST)
	public ResponseEntity<Product> addAllSample(@RequestBody Product prod) {
//		book.getManus().forEach((manu) -> {
//			manu.setBook(book);
//		});
//		prod.getCart().setUsers(prod);
//		user.getCart().getProduct().forEach((prod) -> {
//			prod.setCart(user.getCart());
//		});
//		User userCreated = shoppingRepo.save(user);
//		for(Product prod: user.getCart().getProduct()) {
//			System.out.println(prod.getProdName());
//		}
//		Book book = new Book();
//		book.setAuthor("jojo");
//		book.setPublications("Ernst and Young");
		
//		Product prod = new Product();
		
		
//		productRepo.save(book);
		
//		User userCreated = shoppingRepo.save(user);
		

// commented for experiment		
//		Product prodCreated = prodRepository.save(prod);
//		
//		Apparal apparal = new Apparal();
//		apparal.setBrand("jojo");
//		apparal.setDesign("bell bottom");
//		apparal.setPrice(34);
//		apparal.setProdName("jeans");
//		apparal.setType("best");
//		
//		apparalRepository.save(apparal);
		
		if((prod instanceof Product && !(prod instanceof Book) && !(prod instanceof Apparal))) {
			Product pr = (Product)prod;
			prodRepository.save(pr);
		} else if (prod instanceof Product && (prod instanceof Book) && !(prod instanceof Apparal)) {
			Book book = (Book) prod;
			bookRepository.save(book);
		} else if (prod instanceof Product && !(prod instanceof Book) && prod instanceof Apparal) {
			Apparal apparal = (Apparal) prod;
			apparalRepository.save(apparal);
		}
		
//		else (prod instanceof Product && !(prod instanceof Book) && prod instanceof Apparal) {
//			Apparal apparal = (Apparal) prod;
//			apparalRepository.save(apparal);
//		}
		
		return new ResponseEntity<Product>(prod, HttpStatus.CREATED);
//		return new ResponseEntity<User>(userCreated, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/addAllSample", method = RequestMethod.GET)
	public ResponseEntity<Object> getAllSample(@RequestParam("id") int prodId) {
			Product prod = prodRepository.getOne((long) prodId);
			
			if((prod instanceof Product && !(prod instanceof Book) && !(prod instanceof Apparal))) {
				Product pr = (Product)prod;
//				prodRepository.save(pr);
				return new ResponseEntity<Object>(pr, HttpStatus.CREATED);
			} else if (prod instanceof Product && (prod instanceof Book) && !(prod instanceof Apparal)) {
				Book book = (Book) prod;
				return new ResponseEntity<Object>(book, HttpStatus.CREATED);
//				bookRepository.save(book);
			} else if (prod instanceof Product && !(prod instanceof Book) && prod instanceof Apparal) {
				Apparal apparal = (Apparal) prod;
				return new ResponseEntity<Object>(apparal, HttpStatus.CREATED);
//				apparalRepository.save(apparal);
			}
			return null;
//			return null;
	}
}
