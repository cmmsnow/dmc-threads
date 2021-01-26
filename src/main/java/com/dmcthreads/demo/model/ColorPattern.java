package com.dmcthreads.demo.model;

import com.dmcthreads.demo.model.ThreadColor;
import javax.persistence.*;
import java.util.Map;

@Entity
@Table
public class ColorPattern {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patternId;
    private String patternName;
    private String patternDescription;
    private Integer numOfRows;
    private Integer numOfColumns;
    @OneToMany(mappedBy = "pattern", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Map<String, ThreadColor> colorsMap;

    public ColorPattern(){}

    public ColorPattern(String patternName, String patternDescription, Integer numOfRows, Integer numOfColumns, Map<String, ThreadColor> colorsMap){
        this.patternName = patternName;
        this.patternDescription = patternDescription;
        this.numOfRows = numOfRows;
        this.numOfColumns = numOfColumns;
        this.colorsMap = colorsMap;
    }

    public Integer getPatternId() { return patternId; }

    public void setPatternId(Integer patternId) { this.patternId = patternId; }

    public String getPatternName() { return patternName; }

    public void setPatternName(String patternName) { this.patternName = patternName; }

    public String getPatternDescription() { return patternDescription; }

    public void setPatternDescription(String patternDescription) { this.patternDescription = patternDescription; }

    public Integer getNumOfRows() { return numOfRows; }

    public void setNumOfRows(Integer numOfRows) { this.numOfRows = numOfRows; }

    public Integer getNumOfColumns() { return numOfColumns; }

    public void setNumOfColumns(Integer numOfColumns) { this.numOfColumns = numOfColumns; }

    public Map<String, ThreadColor> getColorsMap() { return colorsMap; }

    public void setColorsMap(Map<String, ThreadColor> colorsMap) { this.colorsMap = colorsMap; }
}
