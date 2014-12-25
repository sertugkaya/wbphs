package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by sertug on 18/12/14.
 */
@Entity
public class Pet extends Model {
    public String name;
    public PetType type;
    public Gender gender;
    public Date birthDate;
    public String breed;
    public String certificateInfo;
    public String vaccinations;
    public String diseases;
    public boolean isPrivate;

    @ManyToOne
    public PetOwner owner;

}

