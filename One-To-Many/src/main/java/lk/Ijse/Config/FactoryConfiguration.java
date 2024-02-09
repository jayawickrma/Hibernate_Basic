package lk.Ijse.Config;

import lk.Ijse.Entity.Laptop;
import lk.Ijse.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoeyConfiguration;
    private SessionFactory sessionFactory;
    private FactoryConfiguration() {
        Configuration configuration =new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        sessionFactory=configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {
        return(null== factoeyConfiguration)?factoeyConfiguration=new FactoryConfiguration():factoeyConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
