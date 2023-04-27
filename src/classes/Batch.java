package classes;

import java.util.Date;

public class Batch {

    private String courseCode;
    private String batchNumber;
    private String batchName;
    private String batchCapacity;
    private int tiutionFee;
    private Date batchStartingDate;

    public Batch(String courseCode, String batchNumber, String batchName, String batchCapacity, int tiutionFee, Date batchStartingDate) {
        this.courseCode = courseCode;
        this.batchNumber = batchNumber;
        this.batchName = batchName;
        this.batchCapacity = batchCapacity;
        this.tiutionFee = tiutionFee;
        this.batchStartingDate = batchStartingDate;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchCapacity() {
        return batchCapacity;
    }

    public void setBatchCapacity(String batchCapacity) {
        this.batchCapacity = batchCapacity;
    }

    public int getTiutionFee() {
        return tiutionFee;
    }

    public void setTiutionFee(int tiutionFee) {
        this.tiutionFee = tiutionFee;
    }

    public Date getBatchStartingDate() {
        return batchStartingDate;
    }

    public void setBatchStartingDate(Date batchStartingDate) {
        this.batchStartingDate = batchStartingDate;
    }
    

}