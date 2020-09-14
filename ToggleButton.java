import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ToggleButton class is for the toggle to switch between periods.
 * 
 * Ria Jain
 * Version 1.0
 * September 13, 2020
 */
public class ToggleButton extends Actor
{
    // Variable definitions
    public static int currentPeriod = 2; // initialize the period to 2
    private GreenfootImage per2 = new GreenfootImage("Background2.jpg"); // variable for the second period background
    private GreenfootImage per3 = new GreenfootImage("Background3.jpg"); // variable for the third period background
    public static boolean changed = false; // variable detecting when the toggle button is clicked and the period is changed 
    
    /**
     * Constructor for ToggleButton
     */
    public ToggleButton() {
        GreenfootImage toggleImage = new GreenfootImage("toggleButton.png"); // creates a variable for the image of the toggle
        toggleImage.scale(125,75); // resizes image
        setImage(toggleImage); // sets the image of the  object to the variable created above
    }
    
    /**
     * Act method - called whenever the 'act' or 'run' button is pressed in the environment.
     * Changes the period when the otggle button is clicked and indicates that a change has occurred.
     */
    public void act() 
    {   
        if(Greenfoot.mouseClicked(this)) { // conditional for when the toggle is clicked
            int i = this.getCurrentPeriod(); // variable for the current period (the most recent)
            int j = i==2? 3 : 2; // if the period is 2, it changes it to 3; if the period is not 2 (in which case it must be 3), the variable is changed to 2
            this.setCurrentPeriod(j); // sets the current period to the value that j was assigned in the previous line
            toggle(currentPeriod); // sets the background based on the value that j was assigned in the previous line (the period)
            changed = true; // indicates that a change has occurred so the students can be changed
        }
        Greenfoot.delay(10);
    }
    
    /**
     * getter - returns the current period
     */
    public int getCurrentPeriod() {
        return currentPeriod;
    }
    
    /**
     * setter - sets the current period to whatever integer argument is given when the function is called
     */
    public void setCurrentPeriod(int i) {
        currentPeriod=i;
    }
    
    /**
     * sets the background when the toggle is clicked to the other period
     */
    public void toggle(int j) {
        if(j == 2) {
            getWorld().setBackground(per2);
        }
        if(j == 3) {
            getWorld().setBackground(per3);
        }
    }
    
}
