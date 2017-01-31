import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by aliki on 31.01.2017.
 */
public class Connect {
    public EntityManager em = Persistence.createEntityManagerFactory("Page").createEntityManager();

    public void add(Essence user){
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }
}
