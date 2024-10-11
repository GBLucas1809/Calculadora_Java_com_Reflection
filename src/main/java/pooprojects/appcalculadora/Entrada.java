/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooprojects.appcalculadora;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author biell
 */
public class Entrada {
    
    Scanner s;
    
    Entrada(){
        s = new Scanner(System.in);
    }
    
    public double lerNumero(String msg){
        try{
            System.out.println(msg);
            double line = s.nextDouble();
            return line;
        }
        catch(InputMismatchException e){
            System.out.println("Isso não e um numero. Tente novamente");
            return this.lerNumero(msg);
        }
    }
    
}
