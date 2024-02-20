package resources;

import java.sql.Date;

import javax.xml.crypto.Data;

public class shoplog {
    
    private int id;

    private Date date;

    private String purpose;

    private int price;

    private int a_age;

    private String a_gender;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getA_age() {
        return a_age;
    }

    public void setA_age(int a_age) {
        this.a_age = a_age;
    }

    public String getA_gender() {
        return a_gender;
    }

    public void setA_gender(String a_gender) {
        this.a_gender = a_gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
