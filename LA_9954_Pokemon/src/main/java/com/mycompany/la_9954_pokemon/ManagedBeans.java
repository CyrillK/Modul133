/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.la_9954_pokemon;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author cyril
 */
@Named(value = "managedBean")
@SessionScoped
public class ManagedBeans implements Serializable {

    private String haare;
    private String auge;
    private String haut;
    private String Auswahl;

    public String getHaare() {
        return haare;
    }

    public void setHaare(String haare) {
        this.haare = haare;
    }

    public String getAuge() {
        return auge;
    }

    public void setAuge(String auge) {
        this.auge = auge;
    }

    public String getHaut() {
        return haut;
    }

    public void setHaut(String haut) {
        this.haut = haut;
    }

    public String getAuswahl() {
        if (haare.equals("b")) {
            Auswahl = "Blonde Haare; ";
        } else {
            Auswahl = "Schwarze Haare; ";
        }
        if (auge.equals("g")) {
            Auswahl += "Grüne Augen; ";
        } else {
            Auswahl += "Blaue Augen; ";
        }
        if (haut.equals("h")) {
            Auswahl += "Helle Haut";
        } else {
            Auswahl += "Dunkle Haut";
        }
        return Auswahl;
    }

    public void setSelection(String Auswahl) {
        this.Auswahl = Auswahl;
    }
}
