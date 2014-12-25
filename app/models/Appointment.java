package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.sql.Time;
import java.util.Date;

/**
 * Created by sertug on 22/12/14.
 */
@Entity
public class Appointment extends Model{
    public Date date;
    public Time duration;
    public String comments;
    public String treatment;

    @ManyToOne
    public Vet vet;

    @OneToOne
    public Pet pet;
}
