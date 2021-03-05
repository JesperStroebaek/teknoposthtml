package com.example.teknoposthtml.models;

public class Bil {

        private String doors;
        private String farve;
        private String model;

        public Bil bil(String døre, String farve, String model) {
            this.doors = døre;
            this.farve = farve;
            this.model = model;
            return bil("5","green","mazda");
        }



    public String getDoors() {
        return doors;
    }

    public void setDøre(String døre) {
        this.doors = doors;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

