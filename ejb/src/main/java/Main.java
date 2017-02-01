import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aliki on 27.01.2017.
 */

@Stateless
public class Main implements MainLocal{

    @PersistenceContext(unitName = "Page")
    private EntityManager em;

    public String getTime (){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public void getDataForSQL(String time, String browserData, String ipClient){
        Essence essence = new Essence();
        essence.setTime("09:00:00");
        essence.setBrowser(browserData);
        essence.setIP(ipClient);

        em.persist(essence);
    }
}
