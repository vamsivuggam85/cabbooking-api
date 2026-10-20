package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customoer {

    @Id
    private int customoerid;

    private String customoermail;
    private String customername;
    private String customoerphono;

    public Customoer() {
    }

    public int getCustomoerid() {
        return customoerid;
    }

    public void setCustomoerid(int customoerid) {
        this.customoerid = customoerid;
    }

    public String getCustomoermail() {
        return customoermail;
    }

    public void setCustomoermail(String customoermail) {
        this.customoermail = customoermail;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomoerphono() {
        return customoerphono;
    }

    public void setCustomoerphono(String customoerphono) {
        this.customoerphono = customoerphono;
    }
}