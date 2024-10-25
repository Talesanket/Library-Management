package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Book;
import com.entity1.Member;
import com.service.DataBaseConnection;

public class DataBaseOperation {
	public static void insertBook(Book book) throws SQLException, ClassNotFoundException {
        String insertQuery = "INSERT INTO books (idbooks, title, author, quantity) VALUES (?, ?, ?, ?)";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
            pstmt.setInt(1, book.getBookId());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setInt(4, book.getQuantity());
            pstmt.executeUpdate();
            System.out.println("Book inserted successfully.");
        }
    }
	
	public static void insertMember(Member member) {
		String insertQuery="INSERT INTO members (memberId, name, email) VALUES (?, ?, ?)";
		try(Connection conn =DataBaseConnection.getConnection(); 
				PreparedStatement pstmt=conn.prepareStatement(insertQuery)){
			pstmt.setInt(1, member.getMemberId());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getEmail());
			pstmt.executeUpdate();
			System.out.println("Member insert Successfully.");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static List<Book> getAllBooks() throws SQLException, ClassNotFoundException {
        String selectQuery =  "SELECT * FROM books";
        List<Book> books = new ArrayList<>();
        try (Connection conn = DataBaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectQuery)) {
            while (rs.next()) {
                Book book = new Book();
                book.setBookId(rs.getInt("idbooks"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setQuantity(rs.getInt("quantity"));
                books.add(book);
            }
        }
        return books;
	}

	
	public static List<Member> getAllMembers() throws ClassNotFoundException, SQLException{
		String selectQuery="SELECT * FROM members";
		List<Member> members=new ArrayList<>();
		try(Connection conn=DataBaseConnection.getConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(selectQuery)){
			while(rs.next()) {
				
				Member member = new Member();
                member.setMemberId(rs.getInt("memberId"));
                member.setName(rs.getString("name"));
                member.setEmail(rs.getString("email"));
                members.add(member);
			}
		}
		return members;
	}

}
