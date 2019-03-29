/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOST;

/**
 *
 * @author Neto
 */
public class Left implements Action{

    @Override
    public void release() {
        Robot robot = StartingClass.getRobot();
        robot.stopLeft();
    }

    @Override
    public void press() {
        StartingClass.getRobot().moveLeft();
    }
    
}
