/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooprojects.appcalculadora;
import java.lang.reflect.InvocationTargetException;
import org.reflections.Reflections;
import java.util.Set;
/**
 *
 * @author biell
 */
public class Menu {
    
    public static void exibir() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException{
        Entrada input = new Entrada();
        Calculadora calc = new Calculadora();
        int opcao = (int) input.lerNumero("Escolha uma das seguintes operacoes:\n1)Divisão\n2)Multiplicacao\n3)Subtracao\n4)Soma\n");
        
        float n1 = input.lerNumero("nº1: ");
        float n2 = input.lerNumero("nº2: ");
        
        //Instanciando novo objeto da classe Reflections, passando o caminho do pacote onde estão as classes operações
        Reflections reflections = new Reflections("pooprojects.appcalculadora");
        
        //Pega todas as classes que implementam a interface Operacao e bota em uma estrutura
        //Obs.: Neste caso foi escolhido guardar em um set pois evita que hajam classes repetidas de operações 
        Set<Class<? extends Operacao>> classes = reflections.getSubTypesOf(Operacao.class);
        
        //Percorrendo o set e operando para cada nome de classe guardado na estrutura
        int iterator = 0;
     
        for(Class<? extends Operacao> classe : classes){
            if(iterator == opcao-1){
                System.out.printf("Resultado: %f\n",calc.calcular("pooprojects.appcalculadora.".concat(classe.getSimpleName()), n1, n2));
                break; 
            }
            iterator++;
        }
    }
}


