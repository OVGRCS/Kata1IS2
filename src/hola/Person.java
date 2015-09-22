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
public class Person {
    private final String name;
    private final String surname;
    private final Calendar date;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
    public Person(String name, String surname, Calendar date) {
        this.name = name;
        this.surname = surname;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getDate() {
        return date;
    }
    public String getFullName(){
        return name + " " + surname;
    }
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) miMetodo(today.getTimeInMillis()-date.getTimeInMillis());
    }
    private long miMetodo(long millis){
        return millis/MILLISECONDS_PER_YEAR;
    }
    
}
