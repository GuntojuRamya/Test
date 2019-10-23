package org.jsp.app.Utility;
import java.util.Scanner;

import org.jsp.app.dao.BookDAOImpl;
public class MainClass
{
	public static void main(String[] args)
	{
	BookDAOImpl bookDAOImpl=new BookDAOImpl();
	bookDAOImpl.addBookInfo();
	System.out.println("enter 1 for searching book using book author");
	System.out.println("enter 2 for searching book using book name");
	System.out.println("enter 3 for searching book using book type");
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your choice");
	int n=scanner.nextInt();
	switch (n)
	{
	case 1:		System.out.println("Enter Book's Author");
				String bookAuthor = scanner.next();
				bookDAOImpl.searchByAuthor(bookAuthor);
				break;
	case 2:		System.out.println("Enter Book's Name");
				String bookName= scanner.next();
				bookDAOImpl.searchByName(bookName);
				break;
	case 3:	 	System.out.println("Enter Book Type");
				String bookType=scanner.next();
				bookDAOImpl.searchByType(bookType);
				break;
	}
	scanner.close();
}
}
