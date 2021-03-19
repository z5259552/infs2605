package master_details;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natwatchrarod
 * contact person class to create contact person and their details
 * uses getters and setters
 */

public class contact_person {
    private String name;
    private String dob;
    private String personal;
    private String business;
    private String time;
    private String notes;

    public contact_person(String name, String dob, String personal, String business, String time, String notes) {
        this.name = name;
        this.dob = dob;
        this.personal = personal;
        this.business = business;
        this.time = time;
        this.notes = notes;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /** 
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the personal
     */
    public String getPersonal() {
        return personal;
    }

    /**
     * @param personal the personal to set
     */
    public void setPersonal(String personal) {
        this.personal = personal;
    }

    /**
     * @return the business
     */
    public String getBusiness() {
        return business;
    }

    /**
     * @param business the business to set
     */
    public void setBusiness(String business) {
        this.business = business;
    }
    
    /**
     * @return the name
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String Time) {
        this.time = time;
    }
    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }

}

