package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @Size(min=5, max=500, message = "Description length should be between 5 and 500 characters long.")
    private String description;
//    private List<Job> jobs = new ArrayList<>();
    public Skill() {}
//    public List<Job> getJobs() {
//        return jobs;
//    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}