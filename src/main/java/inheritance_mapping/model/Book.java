package inheritance_mapping.model;

import javax.persistence.Column;

public class Book extends Product{
	@Column(name="genre")
	private String genre;
	@Column(name="author")
	private String author;
	@Column(name="publications")
	private String publications;
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublications() {
		return publications;
	}
	public void setPublications(String publications) {
		this.publications = publications;
	}
	
}
