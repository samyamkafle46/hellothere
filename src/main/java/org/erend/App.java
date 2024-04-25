package org.erend;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.pojo.Models.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Configuration conf = new Configuration();
            SessionFactory factory = conf.buildSessionFactory();
            Session session = factory.openSession();

            Transaction transaction = session.beginTransaction();
            User user = new User("takeo1", "admin", true, true,"admin@takeo.com");
            Integer id = (Integer)session.save(user);
            System.out.println(id);
            transaction.commit();
            // close our connections
            session.close();
            factory.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
