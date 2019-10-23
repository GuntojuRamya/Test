package org.jsp.app.dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.jsp.app.DTO.Book;
import org.jsp.app.Service.BookService;
public class BookDAOImpl implements BookDAO
{
	Scanner scanner=new Scanner(System.in);
	ArrayList<Book> list=new ArrayList<>();
	@Override
	public ArrayList<Book> addBookInfo()
	{
		System.out.println("enter book name");
		String bookName=scanner.next();
		System.out.println("enter bookauthor");
		String bookAuthor=scanner.next();
		System.out.println("enter booktype");
		String bookType=scanner.next();
	
		if((BookService.validateBookName(bookName))&&(BookService.validateBookAuthor(bookAuthor))&&(BookService.validateBookType(bookType)))
		{
			Book book=new Book(bookName, bookType, bookAuthor);
			list.add(book);
		}
			System.out.println(list);
			return list;
		}
	public void searchByName(String bookName)
	{
		Iterator iterator=list.iterator();
			while(iterator.hasNext())
			{
				Book book=(Book)iterator.next();
				if(book.getBookName().equals(bookName))
				{
					System.out.println(book);
				}
				else
				{
					System.out.println("book not found");
				}
			}
	}
	public void searchByAuthor(String bookAuthor)
	{
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			Book book=(Book)iterator.next();
				if(book.getBookAuthor().equals(bookAuthor))
				{
					System.out.println(book);
				}
				else
				{
					System.out.println("notequals");
				}
		}
	}
	public void searchByType(String bookType)
	{
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			Book book3=(Book)iterator.next();
				if(book3.getBookType().equals(bookType))
				{
					System.out.println(book3);
				}
				else
				{
					System.out.println("notequals");
				}
		}
	}
}
	