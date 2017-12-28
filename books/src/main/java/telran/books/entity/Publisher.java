package telran.books.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Publisher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@JsonIgnore
	String publisherName;
	@OneToMany(mappedBy = "publisher")
	Set <Book> books;
	public Publisher() {
		super();
	}
	
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Publisher(String publisherName) {
		super();
		this.publisherName = publisherName;
		books = new HashSet<>();
	}

	@Override
	public String toString() {
		return "Publisher [publisherName=" + publisherName + "]";
	}
	
	
	
}
