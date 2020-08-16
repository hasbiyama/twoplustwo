/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hasbiyama
 */
import java.lang.reflect.Field;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;

public class twoPlustwo {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[])throws Exception {
        Class cache = Integer.class.getDeclaredClasses()[0];
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true);
        Integer[] array = (Integer[]) c.get(cache);
        array[132] = 5;
        
        System.out.printf("%d", 2 + 2);
        // TODO code application logic here
    }
}


  
