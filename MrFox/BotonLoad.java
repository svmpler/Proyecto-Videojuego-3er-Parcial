import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonLoad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotonLoad extends Boton
{
    /**
     * Act - do whatever the BotonLoad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        checkMouse();
        
        if (Greenfoot.mouseClicked(this)){
             clickSound();   
             Greenfoot.setWorld(new GameSaved());
            }
    }    
}
