package lk.Ijse.Config;

import lk.Ijse.Entity.Laptop;
import lk.Ijse.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoeyConfiguration {
    private static FactoeyConfiguration factoeyConfiguration;
    private SessionFactory sessionFactory;
    public FactoeyConfiguration() {
        Configuration configuration =new Configuration().configure()
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class);
        sessionFactory=configuration.buildSessionFactory();
    }

    public static FactoeyConfiguration getInstance() {
        return(null== factoeyConfiguration)?factoeyConfiguration=new FactoeyConfiguration():factoeyConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
