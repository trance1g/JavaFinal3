
public class Library {
	
	private Book book;
	private String name;
		
	
	public Library() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Library(Library object2) {
		// TODO Auto-generated constructor stub
		title = object2.title;
		author = object2.author;
		publishDate = object2.publishDate;
	}
	
	public void set(String textTitle, String auth, String pub){
		title = textTitle;
		author = auth;
		publishDate = pub;
	}
	

	public Library(String textTitle, String auth, String pub){
		title = textTitle;
		publishDate = pub;
		author = auth;
		
	}
	
	public String toString(){
		String str = "Title: " + title 
						+ "\nAuthor: " + author
						+ "\nPublishDate: " + publishDate;
		
		
		
		return str;
	}

}
