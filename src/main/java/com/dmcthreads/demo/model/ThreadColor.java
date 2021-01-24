package com.dmcthreads.demo.model;

import javax.persistence.*;

@Entity
@Table
public class ThreadColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ColorID;
    private String ColorName;
    private String Hexadecimal;
    private String ColorFamily;

    public ThreadColor(){}

    public ThreadColor(String ColorName, String Hexadecimal, String ColorFamily){
        this.ColorName = ColorName;
        this.Hexadecimal = Hexadecimal;
        this.ColorFamily = ColorFamily;
    }

    public Integer getColorID() {
        return ColorID;
    }

    public void setColorID(Integer colorID) {
        ColorID = colorID;
    }

    public String getColorName() {
        return ColorName;
    }

    public void setColorName(String colorName) {
        ColorName = colorName;
    }

    public String getHexadecimal() {
        return Hexadecimal;
    }

    public void setHexadecimal(String hexadecimal) {
        Hexadecimal = hexadecimal;
    }

    public String getColorFamily() {
        return ColorFamily;
    }

    public void setColorFamily(String colorFamily) {
        ColorFamily = colorFamily;
    }
}
