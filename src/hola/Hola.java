/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Hola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Date f = new Date(91, 8, 29);
        Calendar f = GregorianCalendar.getInstance();
        f.set(1991, 7, 29);
        Person p1;
        p1 = new Person("Enrique", "Ramon", f);
        System.out.println(p1.getFullName());
        System.out.println(p1.getDate().getTime());
        System.out.println(p1.getAge());
        System.out.println("Hola");
        System.out.println("...");
        System.out.println("Fin");
     }
}

