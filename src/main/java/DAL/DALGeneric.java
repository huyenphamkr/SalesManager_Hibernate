package DAL;
import Entities.Category;
import Utils.HibernateUtils;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
public class DALGeneric<T> {
    private Session session;
    private final Class<T> typeClass;
    public DALGeneric(Class<T> typeClass){
        session = HibernateUtils.getSessionFactory().openSession();
        this.typeClass = typeClass;
    }
    public T getData(int id) {
        T c = session.get(typeClass, id);
        return c;
    }
    public void Update(T c) {
        session.beginTransaction();  
        session.update(c);
        session.getTransaction().commit();       
    }
    
    
    public TypedQuery getQuery(String type) {
        return session.getNamedQuery(type); 
    }
    public List<T> LoadData(Enum enumClass) {
        List<T> listData;
        session.beginTransaction();
        listData = session.createQuery("FROM "+enumClass.name(), typeClass).list();
        session.getTransaction().commit();
        return listData;
    }
    public void Add(T c) {
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
    }
    
    public void Delete(int id) {
        T c = getData(id);
        session.beginTransaction();
        session.delete(c);
        session.getTransaction().commit();
    }
}
