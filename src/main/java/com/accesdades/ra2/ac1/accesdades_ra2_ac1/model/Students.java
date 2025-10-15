package com.accesdades.ra2.ac1.accesdades_ra2_ac1.model;

public class Students {
    private Long id;
    private String nom;
    private String cognom;
    private int age;
    private String cicle;
    private int any;

    public Students(Long id, String nom, String cognom, int age, String cicle, int any) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.age = age;
        this.cicle = cicle;
        this.any = any;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getCognom() {
        return cognom;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCicle() {
        return cicle;
    }
    public void setCicle(String cicle) {
        this.cicle = cicle;
    }
    public int getAny() {
        return any;
    }
    public void setAny(int any) {
        this.any = any;
    }
    
}

