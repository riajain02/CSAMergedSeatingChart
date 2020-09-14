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
    private GreenfootImage per2 = new GreenfootImage("Background2.jpg");
    private GreenfootImage per3 = new GreenfootImage("Background3.jpg");
    public static boolean changed = false; // variable detecting when the toggle button is clicked and the period is changed 
    
    /**
     * Constructor for ToggleButton
     */
    public ToggleButton() {
        // settings for image of toggle button
        GreenfootImage toggleImage = new GreenfootImage("toggleButton.png");
        toggleImage.scale(125,75); // resizes image
        setImage(toggleImage);        
    }
    
    /**
     * Act method - called whenever the 'act' or 'run' button is pressed in the environment.
     * Changes the period when the otggle button is clicked and indicates that a change has occurred.
     */
    public void act() 
    {   
        if(Greenfoot.mouseClicked(this)) {
            int i = this.getCurrentPeriod();
            int j = i==2? 3 : 2;
            this.setCurrentPeriod(j);
            toggle(currentPeriod);
            changed = true;
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
