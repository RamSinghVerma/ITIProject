
package cpiti;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Holidays {
@Id
@GeneratedValue   
private int day_id;
private String holiday_name;
@Temporal(TemporalType.DATE)

private Date holiday_date;
private String holiday_day;

    public int getDay_id() {
        return day_id;
    }

    public String getHoliday_name() {
        return holiday_name;
    }

    public Date getHoliday_date() {
        return holiday_date;
    }

    public String getHoliday_day() {
        return holiday_day;
    }

    public void setDay_id(int day_id) {
        this.day_id = day_id;
    }

    public void setHoliday_name(String holiday_name) {
        this.holiday_name = holiday_name;
    }

    public void setHoliday_date(Date holiday_date) {
        this.holiday_date = holiday_date;
    }

    public void setHoliday_day(String holiday_day) {
        this.holiday_day = holiday_day;
    }

}
