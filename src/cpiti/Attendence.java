
package cpiti;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Attendence {
@Id
@GeneratedValue
private int attendence_id;
private String attendence_instructor_uid;
private boolean attendence_status;
@Temporal(TemporalType.DATE)
private Date attendence_date;

    public String getAttendence_instructor_uid() {
        return attendence_instructor_uid;
    }

 
    public void setAttendence_instructor_uid(String attendence_instructor_uid) {
        this.attendence_instructor_uid = attendence_instructor_uid;
    }

   
    public int getAttendence_id() {
        return attendence_id;
    }

    public boolean isAttendence_status() {
        return attendence_status;
    }

    public void setAttendence_id(int attendence_id) {
        this.attendence_id = attendence_id;
    }

    public void setAttendence_status(boolean attendence_status) {
        this.attendence_status = attendence_status;
    }

    public Date getAttendence_date() {
        return attendence_date;
    }

    public void setAttendence_date(Date attendence_date) {
        this.attendence_date = attendence_date;
    }


}
