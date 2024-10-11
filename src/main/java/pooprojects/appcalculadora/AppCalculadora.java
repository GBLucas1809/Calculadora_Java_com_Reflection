/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pooprojects.appcalculadora;

import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author biell
 */
public class AppCalculadora {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, 
            InvocationTargetException, InstantiationException {
        
        Menu m = new Menu();
        Calculadora c = new Calculadora();
        Entrada e = new Entrada();
        
        int opc = m.menu_opcoes("Escolha entre as seguintes opcoes:\n1)Soma\n2)Subtracao\n3)Multiplicacao\n4)Divisao\n0)Sair",e);
        while(opc!=0){
            switch (opc) {
                case 1:
                    System.out.println(c.calcular("pooprojects.appcalculadora.Soma",(float) e.lerNumero("Primeiro nº: "), (float) e.lerNumero("Segundo nº:")));
                    break;
                case 2:
                    System.out.println(c.calcular("pooprojects.appcalculadora.Subtracao",(float) e.lerNumero("Primeiro nº:"), (float) e.lerNumero("Segundo nº:")));
                    break;
                case 3:
                    System.out.println(c.calcular("pooprojects.appcalculadora.Multiplicacao",(float) e.lerNumero("Primeiro nº:"), (float) e.lerNumero("Segundo nº:")));
                    break;
                case 4:
                    System.out.println(c.calcular("pooprojects.appcalculadora.Divisao",(float) e.lerNumero("Primeiro nº:"), (float) e.lerNumero("Segundo nº:")));
                    break;
                default:
                   System.out.println("Opcao inválida.\n");
            }
            opc = m.menu_opcoes("Escolha entre as seguintes opcoes:\n1)Soma\n2)Subtracao\n3)Multiplicacao\n4)Divisao\n0)Sair",e);
        }
        
        System.out.println("Tchau!");
        
    }
}
