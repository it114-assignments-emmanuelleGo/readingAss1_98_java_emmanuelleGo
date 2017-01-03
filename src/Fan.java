/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    public Fan()
    {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public boolean getOn() {
        return on;
    }
    
    public void setOn(boolean on) {
        this.on = on;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString() {
        if (on) {
            return "The fan is ON \nThe color of the fan is: " + color 
                    + "\nThe speed of the fan is: " + speed
                    + "\nThe fan's radius is: " + radius;
        }
        return "The fan is OFF \nThe color of the fan is: " + color 
                    + "\nThe speed of the fan is: " + speed
                    + "\nThe fan's radius is: " + radius;
         
    }
}
