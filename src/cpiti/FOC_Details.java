
package cpiti;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FOC_Details  implements Serializable{
    @Id
    private String foc_no;
    private String foc_trainee_session_id;
    private String foc_trade_id;
    private int foc_trade_semester;
    private java.math.BigDecimal foc_amount;
    private String foc_remarks;
 
    private int foc_total_semester;
    private String semList;
    private String createdBy;
    @Temporal(TemporalType.DATE)
    private Date createdOn;
    
    public String getFoc_no() {
        return foc_no;
    }

    public String getFee_remarks() {
        return foc_remarks;
    }

    
    public void setFoc_no(String foc_no) {
        this.foc_no = foc_no;
    }

    public String getFoc_trainee_session_id() {
        return foc_trainee_session_id;
    }

    public void setFoc_trainee_session_id(String foc_trainee_session_id) {
        this.foc_trainee_session_id = foc_trainee_session_id;
    }

    public String getFoc_trade_id() {
        return foc_trade_id;
    }

    public void setFoc_trade_id(String foc_trade_id) {
        this.foc_trade_id = foc_trade_id;
    }

    public int getFoc_trade_semester() {
        return foc_trade_semester;
    }

    public void setFoc_trade_semester(int foc_trade_semester) {
        this.foc_trade_semester = foc_trade_semester;
    }

    public java.math.BigDecimal getFee_amount() {
        return foc_amount;
    }

    public void setFee_amount(java.math.BigDecimal foc_amount) {
        this.foc_amount = foc_amount;
    }

    public void setFee_remarks(String foc_remarks) {
        this.foc_remarks = foc_remarks;
    }

    public int getFee_total_semester() {
        return foc_total_semester;
    }

    public void setFee_total_semester(int foc_total_semester) {
        this.foc_total_semester = foc_total_semester;
    }

    public String getSemList() {
        return semList;
    }

    public void setSemList(String semList) {
        this.semList = semList;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
 
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
  
    
    
    
    
    
}
