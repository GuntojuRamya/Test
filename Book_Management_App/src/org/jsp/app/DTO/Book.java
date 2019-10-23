package org.jsp.app.DTO;

public class Book
{
	private String bookName;
	private String bookType;
	private String bookAuthor;
	public Book(String bookName, String bookType,String bookAuthor) 
	{
		super();
		this.bookName = bookName;
		this.bookType= bookType;
		this.bookAuthor=bookAuthor;
	}
	
	public String getBookName() 
	{
		return bookName;
	}

	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}

	public String getBookType() 
	{
		return bookType;
	}

	public void setBookType(String bookType) 
	{
		this.bookType = bookType;
	}

	public String getBookAuthor()
	{
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor)
	{
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() 
	{
		return "Book [bookName=" + bookName + ", bookType=" + bookType + ", bookAuthor=" + bookAuthor + "]";
	}
}

