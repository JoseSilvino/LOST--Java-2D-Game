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
public enum RobotDir {
    RobotLeft{
        @Override
        public RobotSpriteChange getDirection(){
        return LOST.RobotLeft.getInstance();
        }
},
RobotRight{
        @Override
        public RobotSpriteChange getDirection() {
            return LOST.RobotRight.getInstance();
        }
    
};
    public abstract RobotSpriteChange getDirection();
};
