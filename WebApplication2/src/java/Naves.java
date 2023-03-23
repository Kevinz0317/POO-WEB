/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.starwars.*;

public class Naves {
    protected String tipo;
    protected int numPersonas;
    protected int cantNaves;
    protected double combustible;
    protected int navesTrans;

    public Naves() {
    }

    public Naves(String tipo, int numPersonas, int cantNaves, double combustible, int navesTrans) {
        this.tipo = tipo;
        this.numPersonas = numPersonas;
        this.cantNaves = cantNaves;
        this.combustible = combustible;
        this.navesTrans = navesTrans;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }
    
    public int getCantNaves() {
        return cantNaves;
    }
    
    public void setCantNaves(int cantNaves) {
        this.cantNaves = cantNaves;
    }
    
    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public int getNavesTrans() {
        return navesTrans;
    }

    public void setNavesTrans(int navesTrans) {
        this.navesTrans = navesTrans;
    }
               
}