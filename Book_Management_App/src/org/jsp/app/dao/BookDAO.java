package org.jsp.app.dao;
import java.util.ArrayList;
import org.jsp.app.DTO.Book;
public interface BookDAO
{
	ArrayList<Book> addBookInfo();
	public  void searchByName(String bookName);
    public	void searchByType(String bookType);
	public  void searchByAuthor(String bookAuthor);
}
