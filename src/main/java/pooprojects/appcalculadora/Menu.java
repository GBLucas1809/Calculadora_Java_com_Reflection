/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooprojects.appcalculadora;
import org.reflections.Reflections;
import java.util.Set;
/**
 *
 * @author biell
 */
public class Menu {
    
    public static void exibir(){
        
        //Instanciando novo objeto da classe Reflections, passando o caminho do pacote onde estão as classes operações
        Reflections reflections = new Reflections("pooprojects.appcalculadora");
        
        //Pega todas as classes que implementam a interface Operacao e bota em uma estrutura
        //Obs.: Neste caso foi escolhido guardar em um set pois evita que hajam classes repetidas de operações 
        Set<Class<? extends Operacao>> classes = reflections.getSubTypesOf(Operacao.class);
        
        //Percorrendo o set e operando para cada nome de classe guardado na estrutura
        for(Class<? extends Operacao> classe : classes){
            System.out.println("Nome da classe:" + classe.getSimpleName());
        }
        
        
    }
}
