package com.dmcthreads.demo.model;

import javax.persistence.*;

@Entity
@Table
public class ThreadColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer colorID;
    private String colorName;
    private String hexadecimal;
    private String colorFamily;

    public ThreadColor(){}

    public ThreadColor(String colorName, String hexadecimal, String colorFamily){
        this.colorName = colorName;
        this.hexadecimal = hexadecimal;
        this.colorFamily = colorFamily;
    }

    public Integer getColorID() {
        return this.colorID;
    }

    public void setColorID(Integer colorID) {
        this.colorID = colorID;
    }

    public String getColorName() {
        return this.colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getHexadecimal() {
        return this.hexadecimal;
    }

    public void setHexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    public String getColorFamily() {
        return this.colorFamily;
    }

    public void setColorFamily(String colorFamily) {
        this.colorFamily = colorFamily;
    }
}
