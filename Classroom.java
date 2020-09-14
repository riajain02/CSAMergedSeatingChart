import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
import java.io.*;
// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.reflect.Constructor;

/**
 * The world in which the students will be arranged in a virtual seating chart for the Classroom.
 *
 * Ria Jain
 * Version 1.0
 * September 13, 2020
 */
public class Classroom extends World
{
    private ArrayList<Student> listo = new ArrayList<Student>();
    public ToggleButton toggle = new ToggleButton();
    
    /**
     * Constructor for objects of class Classroom.
     *
     */
    public Classroom()
    {
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130);
        setBackground("Background2.jpg");
        addObject(toggle, 250, 250);
        prepare();
        setPeriod();
    }
    
    /**
     * calls the setPeriod method whenever the toggle is clicked
     */
    public void act() {
        if(ToggleButton.changed=true) {
            setPeriod();
            ToggleButton.changed=false;
        }
    }
    
    /**
     * calls the constructor for each subclass of student and creates an instance, adds it to the ArrayList<Object> for all the students in the world
     */
    public void prepare()
    {
        ArvindKumar arvindkumar = new ArvindKumar("Arvind", "Kumar", 1, 3, 3);
        listo.add(arvindkumar);
        
        AkashDarbha akashdarbha = new AkashDarbha("Akash", "Darbha", 1, 2, 2);
        listo.add(akashdarbha);
        
        AnirudhNagasamudra anirudhnagasamudra = new AnirudhNagasamudra("Anirudh", "Nagasamudra", 1, 5, 2);
        listo.add(anirudhnagasamudra);
        
        ChelseaLee chelsealee = new ChelseaLee("Chelsea", "Lee", 1, 5, 3);
        listo.add(chelsealee);
        
        AnishShivamurthy anishshivamurthy = new AnishShivamurthy("Anish", "Shivamurthy", 1, 2, 3);
        listo.add(anishshivamurthy);
        
        AyushBandopadhyay ayushbandopadhyay = new AyushBandopadhyay("Ayush", "Bandopadhyay", 1, 4, 3);
        listo.add(ayushbandopadhyay);
        
        AaryaDharm aaryadharm = new AaryaDharm("Aarya", "Dharm", 1, 1, 2);
        listo.add(aaryadharm);
        
        AkhilGiridhar akhilgiridhar = new AkhilGiridhar("Akhil", "Giridhar", 1, 3, 2);
        listo.add(akhilgiridhar);
        
        AnikaSharma anikasharma = new AnikaSharma("Anika", "Sharma", 1, 4, 2);
        listo.add(anikasharma);
        
        AnishKolan anishkolan = new AnishKolan("Anish", "Kolan", 1, 1, 3);
        listo.add(anishkolan);
    }
    
    /**
     * deletes all existing objects in the Student class in the world, iterates throught the array, and only adds the student who belong to the period that is currently being shown in the world (currentPeriod)
     */
    public void setPeriod() {
        removeObjects(getObjects(Student.class));
        int i = 0;
        while(i<listo.size()) {
            if(listo.get(i).period==ToggleButton.currentPeriod) {
                addObject(listo.get(i), 1, 1);
                listo.get(i).sitDown();
            }
            i++;
        }
    }
    
}

