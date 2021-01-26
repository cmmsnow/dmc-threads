package com.dmcthreads.demo.model;

import javax.persistence.*;

@Entity
@Table
public class ThreadColor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer colorId;
    private String colorName;
    private String hexadecimal;
    private String colorFamily;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "pattern_id", nullable = false)
    private ColorPattern colorPattern;

    public ThreadColor(){}

    public ThreadColor(String colorName, String hexadecimal, String colorFamily, ColorPattern colorPattern){
        this.colorName = colorName;
        this.hexadecimal = hexadecimal;
        this.colorFamily = colorFamily;
        this.colorPattern = colorPattern;
    }

    public Integer getColorId() { return this.colorId; }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
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

    public ColorPattern getColorPattern() { return colorPattern; }

    public void setColorPattern(ColorPattern colorPattern) { this.colorPattern = colorPattern; }
}
