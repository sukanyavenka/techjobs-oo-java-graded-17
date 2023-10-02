package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String toString() {

        String newline = System.lineSeparator();
        String nameString = "Name: " + (getName() != null ? getName() : "Data not available") + newline;

        String emp=(employer.getValue() == "")  ?"Data not available":employer.getValue();
        employer.setValue(emp);
        String loc=(location.getValue() == "")?"Data not available":location.getValue();
        location.setValue(loc);
        String pos=(positionType.getValue() == "")?"Data not available":positionType.getValue();
        positionType.setValue(pos);
        //String employerString = "Employer: " + (getEmployer().getValue() == "" ? "Data not available" :getEmployer().getValue()) + newline;
        //String locationString = "Location: " + (getLocation() != null ? getLocation().getValue() : "Data not available") + newline;
        //String positionTypeString = "Position Type: " + (getPositionType() != null  ? getPositionType().getValue() : "Data not available") + newline;
       // String coreCompetencyString = "Core Competency: " + (getCoreCompetency() != null ? getCoreCompetency().getValue() : "Data not available") + newline;


        return   newline+ "ID: " + getId()+ newline +
                        "Name: " + name + newline +
                        "Employer: " + employer + newline +
                        "Location: " + location + newline +
                        "Position Type: " + positionType + newline +
                        "Core Competency: " + coreCompetency + newline;



    }
}

