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
public class Right implements Action {

    @Override
    public void press() {
        Robot.getInstance().DirectionIndex=1;
            Robot.getInstance().move();
    }
    private static class RightHolder{
        private static final Right INSTANCE = new Right();
    }
    private Right(){
        super();
    }
    public static Right getInstance(){
        return RightHolder.INSTANCE;
    }
    @Override
    public void release() {
        Robot robot = Robot.getInstance();
        robot.stopRight();
    }
    
}
