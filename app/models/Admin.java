package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created by sertug on 18/12/14.
 */
@Entity
public class Admin extends Model{
    public String email;
    public String password;
    public Boolean firstLogin;

    public Admin(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
