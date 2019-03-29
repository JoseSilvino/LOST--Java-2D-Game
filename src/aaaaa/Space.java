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
public class Space implements Action {

    @Override
    public void press() {
       Robot robot = StartingClass.getRobot();
       robot.jump();
    }

    @Override
    public void release() {
        Robot robot = StartingClass.getRobot();
        robot.setMovingLeft(false);
        robot.setMovingRight(false);
    }
    
}
