package com.javatpoint;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Test {
public static void main(String[] args) {
	Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	
	Transaction t=session.beginTransaction();
	
	user e1=new user();
	
	e1=(user)session.get(user.class, 854676);
	System.out.println(e1);
	e1.seteMail("d@gmail.com");
	System.out.println(e1);

	session.persist(e1);
	

	
	t.commit();
	session.close();
	System.out.println("successfully saved");
}
}
