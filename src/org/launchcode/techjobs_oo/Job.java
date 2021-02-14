package org.launchcode.techjobs_oo;

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

    public String toString(){
        String result = "\n";
        String empty = "Data not available\n";


        result += "ID: " + this.getId() + "\n";

        if(this.name.isEmpty()){
            result += "Name: " + empty;
        }else{
            result += "Name: " + this.name + "\n";
        }


        if(this.employer.getValue().isEmpty()){
            result += "Employer: " + empty;
        }else{
            result += "Employer: " + this.employer.getValue() + "\n";
        }


        if(this.location.getValue().isEmpty()){
            result += "Location: " + empty;
        }else{
            result += "Location: " + this.location.getValue() + "\n";
        }

        if(this.positionType.getValue().isEmpty()){
            result += "PositionType: " + empty;
        }else{
            result += "PositionType: " + this.positionType.getValue() + "\n";
        }


        if(this.coreCompetency.getValue().isEmpty()){
            result += "Core Competency: " + empty;
        }else{
            result += "Core Competency: " + this.coreCompetency.getValue() + "\n";
        }

        return result;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }




    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

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
}