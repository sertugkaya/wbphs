package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by sertug on 18/12/14.
 */
@Entity
public class PetOwner extends Model{
    public String email;
    public String password;
    public String name;
    public String lastName;
    public String address;
    public Date birthDate;
    public Integer tcNo;


    public PetOwner(String email, String password, String name, String lastName, String address, Date birthDate, Integer tcNo) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.birthDate = birthDate;
        this.tcNo = tcNo;
    }

}
