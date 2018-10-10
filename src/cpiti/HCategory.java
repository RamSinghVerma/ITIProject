/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpiti;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HCategory implements Serializable{
    @Id
    @GeneratedValue
     private int hcategry_id;
    private String hcategory_name;

    public int getHcategry_id() {
        return hcategry_id;
    }

    public String getHcategory_name() {
        return hcategory_name;
    }

    public void setHcategry_id(int hcategry_id) {
        this.hcategry_id = hcategry_id;
    }

    public void setHcategory_name(String hcategory_name) {
        this.hcategory_name = hcategory_name;
    }
    
}