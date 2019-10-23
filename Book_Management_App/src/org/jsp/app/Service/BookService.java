package org.jsp.app.Service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookService
{
	public static boolean validateBookName(String bookName)
	{
		Pattern p1=Pattern.compile("[A-Za-z]+");
		Matcher m1=p1.matcher(bookName);
		return m1.matches();
	}
	public static boolean validateBookAuthor(String bookAuthor)
	{
		Pattern p2=Pattern.compile("[A-Za-z]+");
		Matcher m2=p2.matcher(bookAuthor);
		return m2.matches();
	}
	public static boolean validateBookType(String bookType)
	{
		Pattern p3=Pattern.compile("[A-Za-z]+");
		Matcher m3=p3.matcher(bookType);
		return m3.matches();
	}
}
