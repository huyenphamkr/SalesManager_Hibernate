/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import com.google.protobuf.MapEntry;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;

/**
 *
 * @author ad
 */
public class HibernateUtils {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory(){
        ServiceRegistry serviceRegistry = (ServiceRegistry) new StandardServiceRegistryBuilder()
                .configure()
                .build();
        Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
        return (SessionFactory) metadata.getSessionFactoryBuilder().build();
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
    public static void close(){
        getSessionFactory().close();
    }
}
