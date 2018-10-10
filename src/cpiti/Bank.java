
package cpiti;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
 @Id
 private String bank_id;
 private String bank_name;
 private String bank_branch;
 private String bank_ifsc;

    public String getBank_id() {
        return bank_id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public String getBank_branch() {
        return bank_branch;
    }

    public String getBank_ifsc() {
        return bank_ifsc;
    }

    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public void setBank_branch(String bank_branch) {
        this.bank_branch = bank_branch;
    }

    public void setBank_ifsc(String bank_ifsc) {
        this.bank_ifsc = bank_ifsc;
    }
 
}
