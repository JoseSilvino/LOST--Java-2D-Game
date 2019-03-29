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
public class Ctrl implements Action {

    @Override
    public void press() {
        StartingClass Starter = StartingClass.starter;
      Starter.setCtrl_press(true);
    }

    @Override
    public void release() {
        StartingClass Starter = StartingClass.starter;
        Robot robot = StartingClass.getRobot();
        if(Starter.isCtrl_press()) robot.shoot();
    }
    
}
