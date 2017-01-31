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

    public void getDataForSQL(String time, String browserData, String ipClient){

        Essence essence = new Essence();
        essence.setTime(time);
        essence.setBrowser(browserData);
        essence.setIP(ipClient);
        //Записали в БД
        Connect service = new Connect();
        service.add(essence);
    }
}
