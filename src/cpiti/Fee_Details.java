
package cpiti;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Fee_Details  implements Serializable{
    
    private String fee_receipt_no;
    private String fee_trainee_session_id;
    private String fee_trade_id;
    private int fee_trade_semester;
    private String payment_mode;
    private String fee_bank_id;
    private String fee_bank_branch;
    private String fee_cheque_no;
    private Date fee_cheque_date;
    private double fee_amount;
    private float fee_disc;
    private double balance;
    private String fee_remarks;
    private int fee_total_semester;
    private String semList;
    private String createdBy;
    private boolean isPaid;
    @Id
    public String getFee_receipt_no() {
        return fee_receipt_no;
    }
@Column(columnDefinition="boolean default false")
@Transient
    public boolean isIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public String getFee_trainee_session_id() {
        return fee_trainee_session_id;
    }

    public String getFee_trade_id() {
        return fee_trade_id;
    }

    public void setFee_receipt_no(String fee_receipt_no) {
        this.fee_receipt_no = fee_receipt_no;
    }

    public void setFee_trainee_session_id(String fee_trainee_session_id) {
        this.fee_trainee_session_id = fee_trainee_session_id;
    }

    public void setFee_trade_id(String fee_trade_id) {
        this.fee_trade_id = fee_trade_id;
    }

    public void setFee_trade_semester(int fee_trade_semester) {
        this.fee_trade_semester = fee_trade_semester;
    }

    public void setPayment_mode(String payment_mode) {
        this.payment_mode = payment_mode;
    }

    public void setFee_bank_id(String fee_bank_id) {
        this.fee_bank_id = fee_bank_id;
    }

    public void setFee_bank_branch(String fee_bank_branch) {
        this.fee_bank_branch = fee_bank_branch;
    }

    public void setFee_cheque_no(String fee_cheque_no) {
        this.fee_cheque_no = fee_cheque_no;
    }
 
    public void setFee_cheque_date(Date fee_cheque_date) {
        this.fee_cheque_date = fee_cheque_date;
    }

    public void setFee_amount(double fee_amount) {
        this.fee_amount = fee_amount;
    }

    public void setFee_disc(float fee_disc) {
        this.fee_disc = fee_disc;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getFee_trade_semester() {
        return fee_trade_semester;
    }

    public String getPayment_mode() {
        return payment_mode;
    }

    public String getFee_bank_id() {
        return fee_bank_id;
    }

    public String getFee_bank_branch() {
        return fee_bank_branch;
    }

    public String getFee_cheque_no() {
        return fee_cheque_no;
    }
    @Temporal(TemporalType.DATE)
    public Date getFee_cheque_date() {
        return fee_cheque_date;
    }

    public double getFee_amount() {
        return fee_amount;
    }

    public float getFee_disc() {
        return fee_disc;
    }

    public double getBalance() {
        return balance;
    }

    public String getFee_remarks() {
        return fee_remarks;
    }

    public void setFee_remarks(String fee_remarks) {
        this.fee_remarks = fee_remarks;
    }

    public int getFee_total_semester() {
        return fee_total_semester;
    }

    public void setFee_total_semester(int fee_total_semester) {
        this.fee_total_semester = fee_total_semester;
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
  
    
    
    
    
    
}
