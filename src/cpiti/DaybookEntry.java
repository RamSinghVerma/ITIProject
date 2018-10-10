package cpiti;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DaybookEntry implements Serializable  {
@Id
private int voucherid; //voucherId
private String voucherno;
private BigDecimal voucheramount; //voucherAmount
private String voucherexpence;// voucherExpence
@Temporal(TemporalType.DATE)
private java.util.Date voucherdate;//voucherDate

    public DaybookEntry(int voucherid,String voucherno, BigDecimal voucheramount, String voucherexpence, Date voucherdate) {
        this.voucherid = voucherid;
         this.voucherno = voucherno;
        this.voucheramount = voucheramount;
        this.voucherexpence = voucherexpence;
        this.voucherdate = voucherdate;
    }

    public DaybookEntry() {
    }

    public int getVoucherid() {
        return voucherid;
    }

    public void setVoucherid(int voucherid) {
        this.voucherid = voucherid;
    }

    public BigDecimal getVoucheramount() {
        return voucheramount;
    }

    public void setVoucheramount(BigDecimal voucheramount) {
        this.voucheramount = voucheramount;
    }

    public String getVoucherexpence() {
        return voucherexpence;
    }

    public void setVoucherexpence(String voucherexpence) {
        this.voucherexpence = voucherexpence;
    }

    public Date getVoucherdate() {
        return voucherdate;
    }

    public void setVoucherdate(Date voucherdate) {
        this.voucherdate = voucherdate;
    }

    public String getVoucherno() {
        return voucherno;
    }

    public void setVoucherno(String voucherno) {
        this.voucherno = voucherno;
    }


}
