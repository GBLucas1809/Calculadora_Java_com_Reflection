/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooprojects.appcalculadora;

/**
 *
 * @author biell
 */
public class Menu {
    
    public void exibir(String msg){
        System.out.println(msg);
    }
    
    
    public int menu_opcoes(String msg, Entrada i){
        this.exibir(msg);
        
        return (int) i.lerNumero("");
    }
}
