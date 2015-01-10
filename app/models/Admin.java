package models;

import net.sf.oval.constraint.Email;
import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created by sertug on 18/12/14.
 */
@Entity
public class Admin extends Model{
    @Email
    @Required
    public String email;
    @Password
    @Required
    public String password;
    public Boolean firstLogin;

    public Admin(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
