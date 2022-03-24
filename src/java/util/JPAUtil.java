package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
        private static final EntityManagerFactory emf;
    static{
        try{
            emf=Persistence.createEntityManagerFactory("WebJPAPU");
        } catch (Throwable ex) {
            System.err.println("Error al crear SessionFactoty."+ ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static EntityManagerFactory getEntityManagerFactory(){
        return emf;
    }
}

