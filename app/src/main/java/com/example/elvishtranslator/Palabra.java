package com.example.elvishtranslator;

public class Palabra {
    private String espanyol;
    private String eflico;
    private int imagenid;

    public Palabra(String espanyol, String eflico, int imagenid) {
        this.espanyol = espanyol;
        this.eflico = eflico;
        this.imagenid = imagenid;
    }

    public String getEspanyol() {
        return espanyol;
    }

    public String getEflico() {
        return eflico;
    }
    public int getImagenid(){

        return imagenid;
    }
}
