package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(min=3, max=25, message = "Location must be between 3 and 25 characters in length.")
    public String location;
    @OneToMany
    @JoinColumn()
    //employer_id
    private List<Job> jobs = new ArrayList<>();
    public Employer(){}
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
