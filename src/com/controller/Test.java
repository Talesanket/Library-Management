package com.controller;

import java.util.List;

import java.sql.SQLException;

import com.dao.DataBaseOperation;
import com.entity.Book;
import com.entity1.Member;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            // Insert a new book
	            Book newBook = new Book(7, "C++ Programming", "Author Name", 300);
	            DataBaseOperation.insertBook(newBook);

	            // Insert a new member
	            Member newMember = new Member(4, "Rohn Ray", "rohn.doe@example.com");
	            DataBaseOperation.insertMember(newMember);

	            // Fetch all books
	            List<Book> books = DataBaseOperation.getAllBooks();
	            for (Book book : books) {
	                System.out.println(book);
	            }

	            // Fetch all members
	            List<Member> members = DataBaseOperation.getAllMembers();
	            for (Member member : members) {
	                System.out.println(member);
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	}

}
