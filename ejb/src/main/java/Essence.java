import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by aliki on 31.01.2017.
 */

@Entity
@Table(name = "OpeningPage")
public class Essence implements Serializable {
    @Id
    @Column(name="id")
    protected long id;

    @Column(name="Time")
    protected String time;

    @Column(name="BrowserData")
    protected String browser;

    @Column(name="IPClient")
    protected String ip;

    public Essence(){
    }

    public Essence(int id, String time, String browser, String ip) {
        this.id = id;
        this.time = time;
        this.browser = browser;
        this.ip = ip;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setBrowser(String browser){
        this.browser = browser;
    }

    public void setIP(String ip) {
        this.ip = ip;
    }


}
