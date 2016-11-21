/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author sf2015
 */
public class BuilderRobot implements RobotInterface {
    
    String madeIN;
    
    
    @Override
    public void who_am_i() {
        System.out.println("I am Builder"+madeIN);
    }
    
}
