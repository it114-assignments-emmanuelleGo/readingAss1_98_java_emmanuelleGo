/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(), fan2 = new Fan();
        
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        
        fan2.setSpeed(fan1.MEDIUM);
        fan2.setRadius(5);
        
        System.out.println(fan1.toString() + "\n" + fan2.toString());
    }
}
