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
    private ArrayList<Student> listo = new ArrayList<Student>(); // creates an array of objects in the Student class
    public ToggleButton toggle = new ToggleButton(); // public variable for the instance of the Toggle class, called toggle (so it can also be accessed in its own class)
    
    /**
     * Constructor for objects of class Classroom.
     *
     */
    public Classroom()
    {
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130);
        setBackground("Background2.jpg"); // sets the background to match the default period (2)
        addObject(toggle, 250, 250); // adds the toggle
        prepare(); // prepares the array of students by calling each constructor and adding the object to the array
        setPeriod(); // uses the array to initialize the world with the correct set of students
    }
    
    /**
     * calls the setPeriod method whenever the toggle is clicked
     */
    public void act() {
        if(ToggleButton.changed=true) { // conditional to check if the toggle has been clicked (through a boolean that is changed to true when the toggle is clicked)
            setPeriod(); // resets the students in the world to match the new period by calling the setPeriod method
            ToggleButton.changed=false; // resets the boolean to false so that it is ready for the next time that the toggle is clicked
        }
    }
    
    /**
     * calls the constructor for each subclass of student and creates an instance, adds it to the ArrayList<Object> for all the students in the world
     */
    public void prepare()
    {
        // calls the constructor for each subclass of student
        // adds the new object to the array list of students
        // this would have to be done for every new student whose code is added to the world
        
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
        removeObjects(getObjects(Student.class)); // removes all objects of the student class from the world (like a "reset")
        int i = 0; // variable for a counter (a decomposed for loop so it is easier to understand)
        while(i<listo.size()) { // iterates as many times as there are students in the array list
            if(listo.get(i).period==ToggleButton.currentPeriod) { // checks whether each student's period (an instance variable defined in the Student class) matches the current period (a variable of the ToggleButton class)
                addObject(listo.get(i), 1, 1); // if the period matches, it adds the students to the world
                                               // note: the location is set as (1,1) but it does not matter because this is redefined with the correct coordinates in the sitDown() method anyway
                listo.get(i).sitDown(); // sets each student in the correct location based on the coordinates given when the constructor was called and sets their image to their sitting image
            }
            i++; // advances the iteration number by one (like in a for loop)
        }
    }
    
}

