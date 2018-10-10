
package cpiti;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Salary {
@Id
@GeneratedValue
private long salary_id;
private String salary_instructor_uid;
private double instructor_salary;
private String payment_mode;
private Date payment_date;

    public String getSalary_instructor_uid() {
        return salary_instructor_uid;
    }

    public double getInstructor_salary() {
        return instructor_salary;
    }

    public String getPayment_mode() {
        return payment_mode;
    }

    public void setSalary_instructor_uid(String salary_instructor_uid) {
        this.salary_instructor_uid = salary_instructor_uid;
    }

    public void setInstructor_salary(double instructor_salary) {
        this.instructor_salary = instructor_salary;
    }

    public void setPayment_mode(String payment_mode) {
        this.payment_mode = payment_mode;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public long getSalary_id() {
        return salary_id;
    }

    public void setSalary_id(long salary_id) {
        this.salary_id = salary_id;
    }

}
