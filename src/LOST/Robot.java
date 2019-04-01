package LOST;


import java.awt.Rectangle;
import java.util.ArrayList;

public class Robot {

    // Constants are Here
    final int JUMPSPEED = -17;
    final int MOVESPEED = 5;

    private int centerX ;
    private int centerY ;
    private boolean jumped ;
    private boolean movingLeft ;
    private boolean movingRight ;
    private boolean ducked ;
    private  String direction ;

    private int speedX ;
    private int speedY ;
    public  Rectangle rect  ;
    public  Rectangle rect2  ;
    public  Rectangle yellowRed ;
    
    public  Rectangle footleft  ;
    public  Rectangle footright  ;
    
    private Background bg1 ;
    private Background bg2 ;
    private Background bg3 ;
    private Background bg4 ;
    public void restart(){
        centerX = 500;
        centerY=560;
        jumped = false;
        movingLeft = false;
        movingRight = false;
        ducked = false;
        direction = "right";
        speedX = 0;
        speedY =0;
        rect = new Rectangle(0,0,0,0);
        rect2 = new Rectangle(0,0,0,0);
        yellowRed = new Rectangle(0,0,0,0);
        footleft = new Rectangle(0,0,0,0);
        footright = new Rectangle(0,0,0,0);
        bg1 = StartingClass.getBg1();
        bg2 = StartingClass.getBg2();
        bg3 = StartingClass.getBg3();
        bg4 = StartingClass.getBg4();
    }
    private Robot(){
        super();
        restart();
    }
    private static class RobotHolder{
        private static final Robot INSTANCE = new Robot();
    }
    public static Robot getInstance(){
        return RobotHolder.INSTANCE;
    }
    
    private final ArrayList<Projectile> projectiles = new ArrayList<>();

    public void update() {
        if (speedX == 0){
            bg1.setSpeedX(0);
            bg2.setSpeedX(0);
            bg3.setSpeedX(0);
            bg4.setSpeedX(0);
        }
        
        if ((centerX <= 800 && speedX > 0)||(centerX >=400 && speedX<0)) {
            centerX += speedX;
        }
        
        if (speedX > 0 && centerX > 800) {
            bg1.setSpeedX(-MOVESPEED / 5);
            bg2.setSpeedX(-MOVESPEED / 5);
            bg3.setSpeedX(-MOVESPEED / 5);
            bg4.setSpeedX(-MOVESPEED / 5);
        }
         if (speedX < 0 && centerX < 400){
            bg1.setSpeedX(MOVESPEED / 5);
            bg2.setSpeedX(MOVESPEED / 5);
            bg3.setSpeedX(MOVESPEED / 5);
            bg4.setSpeedX(MOVESPEED / 5);
        }
        

        // Updates Y Position
        centerY += speedY;

        // Handles Jumping

          speedY += 1;

        if (speedY > 3){
            jumped = true;
        }

        rect.setRect(centerX -55, centerY - 63	, 35, 70);
        rect2.setRect(rect.getX(), rect.getY() + 70, 35, 70);
        yellowRed.setRect(centerX - 92, centerY - 80, 110, 180);

        footleft.setRect(centerX -60, centerY - 33, 5, 95);
        footright.setRect(centerX -20, centerY - 33, 5, 95);


    }

    public void moveRight() {
        direction = "right";
        if (ducked == false) {
            speedX = MOVESPEED;
        }
    }

    public void moveLeft() {
        direction = "left";
        if (ducked == false) {
            speedX = -MOVESPEED;
        }
    }

    public void stopRight() {
        setMovingRight(false);
        stop();
    }

    public void stopLeft() {
        setMovingLeft(false);
        stop();
    }

    private void stop() {
        if (isMovingRight() == false && isMovingLeft() == false) {
            speedX = 0;
        }

        if (isMovingRight() == false && isMovingLeft() == true) {
            moveLeft();
        }

        if (isMovingRight() == true && isMovingLeft() == false) {
            moveRight();
        }

    }

    public void jump() {
        if (jumped == false) {
            speedY = JUMPSPEED;
            jumped = true;
        }

    }

    public void shoot() {
        Projectile p;
        if ("right".equals(getDirection()))
            p = new Projectile(centerX-5, centerY-5,true);
        else
            p = new Projectile(centerX-5, centerY-5,false);
	projectiles.add(p);
    }
    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public boolean isJumped() {
        return jumped;
    }

    public int getSpeedX() {
        return speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public void setJumped(boolean jumped) {
        this.jumped = jumped;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public boolean isDucked() {
        return ducked;
    }

    public void setDucked(boolean ducked) {
        this.ducked = ducked;
    }

    public boolean isMovingRight() {
        return movingRight;
    }

    public void setMovingRight(boolean movingRight) {
        this.movingRight = movingRight;
    }

    public boolean isMovingLeft() {
        return movingLeft;
    }

    public void setMovingLeft(boolean movingLeft) {
        this.movingLeft = movingLeft;
    }

    public ArrayList<Projectile> getProjectiles() {
        return projectiles;
    }

   
    public  String getDirection(){
        return direction;
    }

}