package com.aironman.sample.dao.model;

import com.mongodb.DBObject;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.NotSaved;
import org.mongodb.morphia.annotations.PostLoad;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.annotations.Transient;

import java.util.Date;
import java.util.List;

/**
 * Date: 12 junio 2014
 *
 * @author Konrad Malawski
 * @author Alonso Isidoro
 */
@Entity(value = "employees", noClassnameStored = true)
public class Employee {

    @Id
    private ObjectId id;

    private String firstName;
    private String lastName; // value types are automatically persisted

    Long salary; // only non-null values are stored

    @Embedded
    Address address;

    @Reference
    Employee       manager; // refs are stored*, and loaded automatically
    @Reference
    List<Employee> underlings; // interfaces are supported

//    @Serialized
//    EncryptedReviews enchryptedReviews; // stored in one binary field

    @Property("started")
    Date startDate; //fields can be renamed
    @Property("left")
    Date endDate;

    @Indexed
    boolean active = false; //fields can be indexed for better performance

    @NotSaved
    String readButNotStored; //fields can read, but not saved

    @Transient
    int notStored; //fields can be ignored (load/save)
    transient boolean stored = true; //not @Transient, will be ignored by Serialization/GWT for example.

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public List<Employee> getUnderlings() {
        return underlings;
    }

    public void setUnderlings(List<Employee> underlings) {
        this.underlings = underlings;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getReadButNotStored() {
        return readButNotStored;
    }

    public void setReadButNotStored(String readButNotStored) {
        this.readButNotStored = readButNotStored;
    }

    public int getNotStored() {
        return notStored;
    }

    public void setNotStored(int notStored) {
        this.notStored = notStored;
    }

    public boolean isStored() {
        return stored;
    }

    public void setStored(boolean stored) {
        this.stored = stored;
    }

    //Lifecycle methods -- Pre/PostLoad, Pre/PostSave...
    @PostLoad
    void postLoad(DBObject dbObj) {
    }
}