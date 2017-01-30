import org.hibernate.Session;

import javax.ejb.Stateless;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aliki on 27.01.2017.
 */

@Stateless
public class Main implements MainLocal{

    public String getTime (){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public void getDataForSQL(String browserData, String ipClient){
        System.out.println("Maven + Hibernate + MySQL");
        Session session = ConnectSQL.getSessionFactory().openSession();
        session.beginTransaction();

        System.out.println("Browser: " + browserData);
        System.out.println("IP: " + ipClient);

        session.getTransaction().commit();
    }
}
