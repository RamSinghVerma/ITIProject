
package cpiti;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FeeType implements Serializable {
@Id

private String feetype_id;
private String feetype_receipt_no;
private String feetype;
private double feetype_amount;

    public String getFeetype_receipt_no() {
        return feetype_receipt_no;
    }

    public String getFeetype() {
        return feetype;
    }

    public double getFeetype_amount() {
        return feetype_amount;
    }

    public void setFeetype_receipt_no(String feetype_receipt_no) {
        this.feetype_receipt_no = feetype_receipt_no;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    public void setFeetype_amount(double feetype_amount) {
        this.feetype_amount = feetype_amount;
    }

    public String getFeetype_id() {
        return feetype_id;
    }

    public void setFeetype_id(String feetype_id) {
        this.feetype_id = feetype_id;
    }



}
