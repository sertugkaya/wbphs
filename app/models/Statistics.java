package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by sertug on 21/12/14.
 */
@Entity
public class Statistics extends Model{
    public Integer vetBrowse;
    public Integer numOfUsers;
    public Integer numOfPets;
    public Integer vetAppointments;
/*
    @OneToMany
    public List<Appointment> vetAppointments;
*/
}
