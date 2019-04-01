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
public class RobotRight implements RobotSpriteChange{

    @Override
    public void changeSprite(StartingClass start) {
                Robot robot = Robot.getInstance();
        if(robot.isJumped()){
            start.setCurrentSprite(start.getCharacterJumped_r());
        }else if(robot.isDucked()==false&&robot.isStopped()){
            start.setCurrentSprite(start.getC0());
        }

        else if(!robot.isStopped()){
            start.setAnim(start.anim_r);
            start.setCurrentSprite(start.anim.getImage());
            start.animUpdate();
        }
        else if(robot.isDucked()) {
            start.anim = start.anim_l;
            start.setCurrentSprite(start.anim.getImage());
            start.animUpdate();
        }
    }

    @Override
    public Projectile shoot() {
        Robot robot = Robot.getInstance();
        return new Projectile(robot.getCenterX()-5, robot.getCenterY()-5,true);
    }

    @Override
    public void move() {
                Robot robot = Robot.getInstance();
                robot.DirectionIndex =1;
        if(!robot.isDucked()){
            robot.setSpeedX(robot.MOVESPEED);
        }
    }
    
    private RobotRight() {
    }
    
    public static RobotRight getInstance() {
        return RobotRightHolder.INSTANCE;
    }
    
    private static class RobotRightHolder {

        private static final RobotRight INSTANCE = new RobotRight();
    }
}
