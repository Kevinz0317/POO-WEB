/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.mycompany.starwars.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jdcan
 */
public class AtAt extends Naves implements INaves{
    @Override
    public double consumoCombustibleParsec() {
        int b;
        double c,a;
        
        b = getCantNaves();
        c = getCombustible();
      
        a = (b * c) - (b * c * 0.25);
        JOptionPane.showMessageDialog(null, "La Cantidad de combustible total necesario es: "+a+" Litros por Parsec");

        return a;
    }
}