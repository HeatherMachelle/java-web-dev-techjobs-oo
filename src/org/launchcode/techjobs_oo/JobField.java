package org.launchcode.techjobs_oo;
import java.util.Objects;


//TODO    What fields do ALL FOUR of the classes have in common?

//TODO    To prevent the creation of a JobField object, make this class abstract
public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    //TODO    Which constructors are the same in ALL FOUR classes?

    public JobField(String value) {
        this.value = value;
    }

    //TODO    Custom toString, equals, and hashCode methods

    @Override
    public String toString() {
        return value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }


//TODO    What getters and setters do ALL of the classes share?

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }
}

