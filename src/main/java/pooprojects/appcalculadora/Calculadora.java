/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooprojects.appcalculadora;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 *
 * @author biell
 */
public class Calculadora {
    
    
    public float calcular(String op, float n1, float n2) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException{
        Class c = Class.forName(op);
        Method m = c.getMethod("calcular",float.class,float.class);
        return (float) m.invoke(c.getDeclaredConstructor().newInstance(), n1, n2);
    }
}
