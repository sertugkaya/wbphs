package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created by sertug on 18/12/14.
 */
@Entity
public class Vet extends Model {
    public String email;
    public String password;

    public Vet(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
