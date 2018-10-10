package cpiti;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class ACategory implements Serializable{
    @Id
    @GeneratedValue
    private int acategry_id;
    private String acategory_name;

    public int getAcategry_id() {
        return acategry_id;
    }

    public String getAcategory_name() {
        return acategory_name;
    }

    public void setAcategry_id(int acategry_id) {
        this.acategry_id = acategry_id;
    }

    public void setAcategory_name(String acategory_name) {
        this.acategory_name = acategory_name;
    }
    
    
}