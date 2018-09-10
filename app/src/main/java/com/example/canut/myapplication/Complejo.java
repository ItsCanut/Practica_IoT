package com.example.canut.myapplication;

public class Complejo {
    private double real, imaginario;

    public Complejo(double r, double i){
        this.real = r;
        this.imaginario = i;
    }

    public static Complejo suma(Complejo a, Complejo b) {
        return new Complejo(a.real + b.real,
                a.imaginario + b.imaginario);
        // this.real = a.real + b.real;
        // this.imaginario = a.imaginario + b.imaginario;
    }


}
