
package cpiti;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Instructor implements Serializable{
@Id
private String instructor_uid;
private String instructor_name;
@Temporal(TemporalType.DATE)
private Date   instructor_dob;
private String instructor_gender;
private String marital_status;
private String instructor_category;
private String insructor_language;
private String instructor_father_husband;
private String instructor_blood_grp;
private String gpf_epf_no;
@Lob
private byte[] instructor_photo;
private String mobile_no;
private String instructor_mail;
private String instructor_address;
private String instructor_state;
private String instructor_district;
private String instructor_pincode;
private String instructor_home_no;
private String instructor_qualification;
private String instructor_passing_year;
private String board_name;
private String board_subjects;
private String board_grade;
private float  percentage;
private String instructor_tech_qualification;
private String instructor_tech_passing_year;
private String board_tech_name;
private String board_tech_subjects;
private String board_tech_grade;
private float  tech_percentage;

    public String getInstructor_uid() {
        return instructor_uid;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public Date getInstructor_dob() {
        return instructor_dob;
    }

    public String getInstructor_gender() {
        return instructor_gender;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public String getInstructor_category() {
        return instructor_category;
    }

    public String getInsructor_language() {
        return insructor_language;
    }

    public String getInstructor_father_husband() {
        return instructor_father_husband;
    }

    public String getInstructor_blood_grp() {
        return instructor_blood_grp;
    }

    public String getGpf_epf_no() {
        return gpf_epf_no;
    }

    public byte[] getInstructor_photo() {
        return instructor_photo;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public String getInstructor_mail() {
        return instructor_mail;
    }

    public String getInstructor_address() {
        return instructor_address;
    }

    public String getInstructor_state() {
        return instructor_state;
    }

    public String getInstructor_district() {
        return instructor_district;
    }

    public String getInstructor_pincode() {
        return instructor_pincode;
    }

    public String getInstructor_home_no() {
        return instructor_home_no;
    }

    public String getInstructor_qualification() {
        return instructor_qualification;
    }

    public String getInstructor_passing_year() {
        return instructor_passing_year;
    }

    public String getBoard_name() {
        return board_name;
    }

    public String getBoard_subjects() {
        return board_subjects;
    }

    public String getBoard_grade() {
        return board_grade;
    }

    public float getPercentage() {
        return percentage;
    }

    public String getInstructor_tech_qualification() {
        return instructor_tech_qualification;
    }

    public String getInstructor_tech_passing_year() {
        return instructor_tech_passing_year;
    }

    public String getBoard_tech_name() {
        return board_tech_name;
    }

    public String getBoard_tech_subjects() {
        return board_tech_subjects;
    }

    public String getBoard_tech_grade() {
        return board_tech_grade;
    }

    public float getTech_percentage() {
        return tech_percentage;
    }

    public void setInstructor_uid(String instructor_uid) {
        this.instructor_uid = instructor_uid;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }

    public void setInstructor_dob(Date instructor_dob) {
        this.instructor_dob = instructor_dob;
    }

    public void setInstructor_gender(String instructor_gender) {
        this.instructor_gender = instructor_gender;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public void setInstructor_category(String instructor_category) {
        this.instructor_category = instructor_category;
    }

    public void setInsructor_language(String insructor_language) {
        this.insructor_language = insructor_language;
    }

    public void setInstructor_father_husband(String instructor_father_husband) {
        this.instructor_father_husband = instructor_father_husband;
    }

    public void setInstructor_blood_grp(String instructor_blood_grp) {
        this.instructor_blood_grp = instructor_blood_grp;
    }

    public void setGpf_epf_no(String gpf_epf_no) {
        this.gpf_epf_no = gpf_epf_no;
    }

    public void setInstructor_photo(byte[] instructor_photo) {
        this.instructor_photo = instructor_photo;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public void setInstructor_mail(String instructor_mail) {
        this.instructor_mail = instructor_mail;
    }

    public void setInstructor_address(String instructor_address) {
        this.instructor_address = instructor_address;
    }

    public void setInstructor_state(String instructor_state) {
        this.instructor_state = instructor_state;
    }

    public void setInstructor_district(String instructor_district) {
        this.instructor_district = instructor_district;
    }

    public void setInstructor_pincode(String instructor_pincode) {
        this.instructor_pincode = instructor_pincode;
    }

    public void setInstructor_home_no(String instructor_home_no) {
        this.instructor_home_no = instructor_home_no;
    }

    public void setInstructor_qualification(String instructor_qualification) {
        this.instructor_qualification = instructor_qualification;
    }

    public void setInstructor_passing_year(String instructor_passing_year) {
        this.instructor_passing_year = instructor_passing_year;
    }

    public void setBoard_name(String board_name) {
        this.board_name = board_name;
    }

    public void setBoard_subjects(String board_subjects) {
        this.board_subjects = board_subjects;
    }

    public void setBoard_grade(String board_grade) {
        this.board_grade = board_grade;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public void setInstructor_tech_qualification(String instructor_tech_qualification) {
        this.instructor_tech_qualification = instructor_tech_qualification;
    }

    public void setInstructor_tech_passing_year(String instructor_tech_passing_year) {
        this.instructor_tech_passing_year = instructor_tech_passing_year;
    }

    public void setBoard_tech_name(String board_tech_name) {
        this.board_tech_name = board_tech_name;
    }

    public void setBoard_tech_subjects(String board_tech_subjects) {
        this.board_tech_subjects = board_tech_subjects;
    }

    public void setBoard_tech_grade(String board_tech_grade) {
        this.board_tech_grade = board_tech_grade;
    }

    public void setTech_percentage(float tech_percentage) {
        this.tech_percentage = tech_percentage;
    }
    
}
