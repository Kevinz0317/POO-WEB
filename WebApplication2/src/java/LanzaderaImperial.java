/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.mycompany.starwars.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public final class LanzaderaImperial extends Naves implements INaves{
    @Override
    public double consumoCombustibleParsec() {
        int b;
        double c,a;
        
        b = getCantNaves();
        c = getCombustible();
      
        a = b * c;
        JOptionPane.showMessageDialog(null, "La Cantidad de combustible total necesario es: "+a+" Litros por Parsec");

        return a;
    }
}