import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Student class is for all students.
 * Note: it currently contains the first eight that compile.
 * 
 * Ria Jain  
 * Version 1.0 - Note: the only change made was the new "period" instance variable
 * September 13, 2020
 */
public abstract class Student extends Actor
{
    // NOTE ABOUT PERIOD: each student must define the period by modifying their constructor to include an additional integer argument, then equating that integer to the period
    // this is so that when the array is iterated through, the student can be placed in the correct place depending on the current period
    
    // Instance variables
    public int period; // added variable for the period, is public because it needs to be accessed by the Classroom
    public String firstName; // variable for the first name
    public String lastName; // variable for the last name
    public int myRow; // rows start in the front of class (1), and end in the back of class
    public int mySeat;        // seats are left to right, 1-8
    public boolean isActive;  // can you think of an algorithm that would allow you to use this variable to use keyboard entry for all the instance of a student that we will create?
    public boolean sitting;   // Is the student sitting or standing (default sitting)                
    public String portraitFile; // image used when sitting
    public String standingFile; // image used when standing
    public String soundFile; //      firstName.toLowerCase()+lastName.toLowerCase()+".ext"; (.wav or .jpg)\

    public void setRow(int r){
        myRow=r;
    }
    
    public void setSeat(int s){
       mySeat=s;
    }
    
    public abstract void  getName(); //This is an abstract methods. You will have to implement it
                                     // in your own class file. See KilgoreTrout for an example
    public abstract void  provideLesson(); // each group should implement their own version of this method.
                                           // See the notes in the assignment instructions for possible implementation.
    public abstract void  answerQuestion(); //This is an abstract method. You will have to implement it
                                            // in your own class file.  It was used in 2019-20 so that students could
                                            // implement methods that would discuss the summer homework lessons.  This year
                                            // you will work in teams of 3 to figure out some way to actually give a short
                                            // Runestone lesson.
    
    /**
     * Plays a sound file when called
     * @param String myNameFile  is the name of the sound file to play, ex "mySound.wav",
     */
    
    public int GetRow(){
        return myRow;
    }
    
    public int GetSeat(){
        return mySeat;
    }
    
    public void sayName(String myNameFile){
        Greenfoot.playSound(myNameFile);
    }
    
    public void returnToSeat(){
        setLocation(mySeat,myRow);
    }
    public void sitDown(){
        returnToSeat();
        setImage(portraitFile);
        setRotation(0);
        sitting=true;
    }
        
 
}
