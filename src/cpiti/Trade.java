
package cpiti;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trade {
 @Id
 private String trade_id;
 private String trade_name;
 private int trade_duration;
 private double trade_fee;
 private int trade_total_semester;
 private String trade_session;

    public String getTrade_id() {
        return trade_id;
    }

    public String getTrade_name() {
        return trade_name;
    }

    public int getTrade_duration() {
        return trade_duration;
    }

    public double getTrade_fee() {
        return trade_fee;
    }

    public int getTrade_total_semester() {
        return trade_total_semester;
    }

    public void setTrade_id(String trade_id) {
        this.trade_id = trade_id;
    }

    public void setTrade_name(String trade_name) {
        this.trade_name = trade_name;
    }

    public void setTrade_duration(int trade_duration) {
        this.trade_duration = trade_duration;
    }

    public void setTrade_fee(double trade_fee) {
        this.trade_fee = trade_fee;
    }

    public void setTrade_total_semester(int trade_total_semester) {
        this.trade_total_semester = trade_total_semester;
    }

    public String getTrade_session() {
        return trade_session;
    }

    public void setTrade_session(String trade_session) {
        this.trade_session = trade_session;
    }
    
    
    
    
    
    
}
