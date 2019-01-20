package com.atlassian.plugins.qrapids.rest.dto;

public class DTOSIAssesment {

    private Long id;
    private String label;
    private Float value;
    private String color;
    private Float upperThreshold;

    public DTOSIAssesment(Long id, String label, Float value, String color, Float upperThreshold) {
        this.id = id;
        this.label = label;
        this.value = value;
        this.color = color;
        this.upperThreshold = upperThreshold;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getUpperThreshold() {
        return upperThreshold;
    }

    public void setUpperThreshold(Float upperThreshold) {
        this.upperThreshold = upperThreshold;
    }

    //
    // Function that returns de desc
    public String toString(){
        String description, threshold_label;
        description = label;
        if (upperThreshold!= null & !upperThreshold.isNaN()) {
            threshold_label = String.format("%.2f",upperThreshold);
            description = description + " (" + threshold_label + ')';
        }
        return description;
    }

}
