package inheritance_mapping.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.assignment.model.Book;
import com.springboot.assignment.model.User;

@RestController
public class Inheritance_Controller {

	@RequestMapping(value="/addAllSample", method = RequestMethod.POST)
	public ResponseEntity<User> addAllSample(@RequestBody Product prod) {
//		book.getManus().forEach((manu) -> {
//			manu.setBook(book);
//		});
		prod.getCart().setUsers(prod);
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
		
		
//		return new ResponseEntity<User>(userCreated, HttpStatus.CREATED);
	}	
}
