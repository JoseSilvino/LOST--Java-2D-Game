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
       Robot robot = Robot.getInstance();
       robot.jump();
    }
    private Space(){
    super();
    }
    private static class SpaceHolder{
        private static final Space INSTANCE = new Space();
    }
    public static Space getInstance(){
        return SpaceHolder.INSTANCE;
    }
    
    @Override
    public void release() {
        Robot robot = Robot.getInstance();
        robot.setMovingLeft(false);
        robot.setMovingRight(false);
    }
    
}
