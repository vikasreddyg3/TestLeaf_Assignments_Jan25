package week1_HS;

public class Library {
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		System.out.println(bookTitle);
		return bookTitle;		
	}
	
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		
		Library obj=new Library();
		obj.addBook("Animal Farm");
		obj.issueBook();
		
		

	}

}
