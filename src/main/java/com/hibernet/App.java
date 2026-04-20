package com.hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //create object to insert data
        Student s1 = new Student();
//        s1.setSid(104);
//        s1.setS_name("Mann");
//        s1.setDomain("AI-ML");

        //load the configurstion files
        Configuration config = new Configuration();
        //locate the class
        config.addAnnotatedClass(com.hibernet.Student.class);
        //locate the config file
        config.configure("hibernate.cfg.xml");

        //start a session for config file
        SessionFactory factory = config.buildSessionFactory();
        //open the session
        Session session = factory.openSession();

        //open the transcation
        Transaction tx = session.beginTransaction();
        // save the data
//        session.persist(s1);
//        to fetch the data
//        Student s2 = session.find(Student.class,106);
        List<Student> list = session.createQuery("from Student", Student.class)
                .getResultList();

        for (Student s : list) {
            System.out.println( s.getS_name() + " " + s.getDomain());
        }

        Student s = list.get(0);
        s.setDomain("DevOps");


//        Student s2 = session.createQuery();
//        System.out.println(s2);

        //close the trancations and session and factory
        tx.commit();
        session.close();
        factory.close();

    }


}
