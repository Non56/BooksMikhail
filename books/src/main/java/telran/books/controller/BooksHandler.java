package telran.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.books.entity.Book;
import telran.books.interfaces.IBookConstant;
import telran.books.interfaces.IBooks;

@RestController
@CrossOrigin
public class BooksHandler {
	@Autowired
	IBooks books;
	
	@PostMapping(IBookConstant.BOOK)
	public boolean addBook(@RequestBody Book book) {
		return books.addBook(book);
	}
}
