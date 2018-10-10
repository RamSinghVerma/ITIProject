
package cpiti;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Trainee implements Serializable{

@Id
private String trainee_id;
private String trainee_session_id;
private String trainee_session;
private String trainee_name;
private String trainee_father_name;
private String trainee_mother_name;
@Temporal(TemporalType.DATE)
private Date trainee_date_of_birth;
private String trainee_gender;
private String trainee_nationality;
private String trainee_mobile_no;
private String trainee_email;
private String trainee_aadhar_no;
private String trainee_address;
private String trainee_qualification;
private String trainee_category;
private String trainee_horizontal_category;
private String trainee_addmission_category;    
private String trainee_minority_category;
private String trainee_state_reg_no;
private String trainee_app_form_no;
@Temporal(TemporalType.DATE)
private Date trainee_admission_date;
private String trainee_trade_name;
private String trainee_type;
private int trainee_trade_shift;
private int trainee_trade_unit;
private String trainee_mode;
private String trainee_remarks;
@Lob
private byte[] trainee_photo;

    public void setTrainee_session_id(String trainee_session_id) {
        this.trainee_session_id = trainee_session_id;
    }

    public void setTrainee_name(String trainee_name) {
        this.trainee_name = trainee_name;
    }

    public void setTrainee_father_name(String trainee_father_name) {
        this.trainee_father_name = trainee_father_name;
    }

    public void setTrainee_mother_name(String trainee_mother_name) {
        this.trainee_mother_name = trainee_mother_name;
    }
    

    public void setTrainee_date_of_birth(Date trainee_date_of_birth) {
        this.trainee_date_of_birth = trainee_date_of_birth;
    }

    public void setTrainee_gender(String trainee_gender) {
        this.trainee_gender = trainee_gender;
    }

    public void setTrainee_nationality(String trainee_nationality) {
        this.trainee_nationality = trainee_nationality;
    }

    public void setTrainee_mobile_no(String trainee_mobile_no) {
        this.trainee_mobile_no = trainee_mobile_no;
    }

    public void setTrainee_email(String trainee_email) {
        this.trainee_email = trainee_email;
    }

    public void setTrainee_aadhar_no(String trainee_aadhar_no) {
        this.trainee_aadhar_no = trainee_aadhar_no;
    }

    public void setTrainee_address(String trainee_address) {
        this.trainee_address = trainee_address;
    }

    public void setTrainee_qualification(String trainee_qualification) {
        this.trainee_qualification = trainee_qualification;
    }

    public void setTrainee_category(String trainee_category) {
        this.trainee_category = trainee_category;
    }

    public void setTrainee_horizontal_category(String trainee_horizontal_category) {
        this.trainee_horizontal_category = trainee_horizontal_category;
    }

    public void setTrainee_addmission_category(String trainee_addmission_category) {
        this.trainee_addmission_category = trainee_addmission_category;
    }

    public void setTrainee_minority_category(String trainee_minority_category) {
        this.trainee_minority_category = trainee_minority_category;
    }

    public void setTrainee_state_reg_no(String trainee_state_reg_no) {
        this.trainee_state_reg_no = trainee_state_reg_no;
    }

    public void setTrainee_app_form_no(String trainee_app_form_no) {
        this.trainee_app_form_no = trainee_app_form_no;
    }

    public void setTrainee_admission_date(Date trainee_admission_date) {
        this.trainee_admission_date = trainee_admission_date;
    }

    public void setTrainee_trade_name(String trainee_trade_name) {
        this.trainee_trade_name = trainee_trade_name;
    }

    public void setTrainee_type(String trainee_type) {
        this.trainee_type = trainee_type;
    }

    public void setTrainee_trade_shift(int trainee_trade_shift) {
        this.trainee_trade_shift = trainee_trade_shift;
    }

    public void setTrainee_trade_unit(int trainee_trade_unit) {
        this.trainee_trade_unit = trainee_trade_unit;
    }

    public void setTrainee_mode(String trainee_mode) {
        this.trainee_mode = trainee_mode;
    }

    public void setTrainee_remarks(String trainee_remarks) {
        this.trainee_remarks = trainee_remarks;
    }


    public String getTrainee_session_id() {
        return trainee_session_id;
    }

    public String getTrainee_name() {
        return trainee_name;
    }

    public String getTrainee_father_name() {
        return trainee_father_name;
    }

    public String getTrainee_mother_name() {
        return trainee_mother_name;
    }
    public Date getTrainee_date_of_birth() {
        return trainee_date_of_birth;
    }

    public String getTrainee_gender() {
        return trainee_gender;
    }

    public String getTrainee_nationality() {
        return trainee_nationality;
    }

    public String getTrainee_mobile_no() {
        return trainee_mobile_no;
    }

    public String getTrainee_email() {
        return trainee_email;
    }

    public String getTrainee_aadhar_no() {
        return trainee_aadhar_no;
    }

    public String getTrainee_address() {
        return trainee_address;
    }

    public String getTrainee_qualification() {
        return trainee_qualification;
    }

    public String getTrainee_category() {
        return trainee_category;
    }

    public String getTrainee_horizontal_category() {
        return trainee_horizontal_category;
    }

    public String getTrainee_addmission_category() {
        return trainee_addmission_category;
    }

    public String getTrainee_minority_category() {
        return trainee_minority_category;
    }

    public String getTrainee_state_reg_no() {
        return trainee_state_reg_no;
    }

    public String getTrainee_app_form_no() {
        return trainee_app_form_no;
    }
    public Date getTrainee_admission_date() {
        return trainee_admission_date;
    }

    public String getTrainee_trade_name() {
        return trainee_trade_name;
    }

    public String getTrainee_type() {
        return trainee_type;
    }

    public int getTrainee_trade_shift() {
        return trainee_trade_shift;
    }

    public int getTrainee_trade_unit() {
        return trainee_trade_unit;
    }

    public String getTrainee_mode() {
        return trainee_mode;
    }

    public String getTrainee_remarks() {
        return trainee_remarks;
    }

    public String getTrainee_session() {
        return trainee_session;
    }

    public void setTrainee_session(String trainee_session) {
        this.trainee_session = trainee_session;
    }
    public String getTrainee_id() {
        return trainee_id;
    }

    public void setTrainee_id(String trainee_id) {
        this.trainee_id = trainee_id;
    }

    public byte[] getTrainee_photo() {
        return trainee_photo;
    }

    public void setTrainee_photo(byte[] trainee_photo) {
        this.trainee_photo = trainee_photo;
    }
    


}
