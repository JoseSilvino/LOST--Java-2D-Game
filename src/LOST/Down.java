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
public class Down implements Action {

    @Override
    public void release() {
        StartingClass starter =StartingClass.starter;
        starter.crouchdown_r.currentFrame = 0;
        starter.crouchdown_l.currentFrame = 0;
        Robot robot = Robot.getInstance();
        robot.setDucked(false);
    }
    private static class DownHolder{
        private static final Down INSTANCE = new Down();
    }
    private Down(){
        super();
    }
    public static Down getInstance(){
        return DownHolder.INSTANCE;
    }
    @Override
    public void press() {
      Robot.getInstance().setDucked(true);
    }
    
}
