package models;

import play.data.validation.Email;
import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;


@Entity
public class Vet extends Model {
    @Required
    @Email
    public String email;
    @Required
    @Password
    public String password;

    public Vet(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
