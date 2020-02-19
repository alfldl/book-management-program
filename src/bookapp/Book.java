package bookapp;

public class Book {

	private String title;
	private String writer;
	private int genre;
	boolean isAvailable;
	
	public Book (String title, String writer, int genre) {
		this.title = title;
		this.writer = writer;
		this.genre = genre;
		this.isAvailable = true;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
}
