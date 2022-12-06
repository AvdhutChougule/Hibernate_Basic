package com.jsp.book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookDriver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("avdhut");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Book book=new Book();
		book.setId(1);
		book.setName("Java");
		book.setAuthor("Niraj");
		
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();
		System.out.println("All Good");
	}

	
}
