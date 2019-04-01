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
        Robot robot = Robot.getInstance();
        robot.stopLeft();
    }
    private Left(){
        super();
    }
    private static class LeftHolder{
        private static final Left INSTANCE = new Left();
    }
    public static Left getInstance(){
        return LeftHolder.INSTANCE;
    }
    @Override
    public void press() {
        Robot.getInstance().DirectionIndex=0;
        Robot.getInstance().move();
    }
    
}
