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
public class Supremacy extends Naves implements INaves{
    
    public double consumoCombustibleParsec() {
        int b,d;
        double c,a;
        
        b = getCantNaves();
        c = getCombustible();
        d = getNavesTrans();
      
        a = (b * c) + (b * c * d * 0.1);
        JOptionPane.showMessageDialog(null, "La Cantidad de combustible total necesario es: "+a+" Litros por Parsec");

        return a;
    }
}