package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cab {

    @Id
    private int cabid;

    private String cabnumber;
    private String cabtype;
    private String status;

    public Cab() {
    }

    public int getCabid() {
        return cabid;
    }

    public void setCabid(int cabid) {
        this.cabid = cabid;
    }

    public String getCabnumber() {
        return cabnumber;
    }

    public void setCabnumber(String cabnumber) {
        this.cabnumber = cabnumber;
    }

    public String getCabtype() {
        return cabtype;
    }

    public void setCabtype(String cabtype) {
        this.cabtype = cabtype;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}