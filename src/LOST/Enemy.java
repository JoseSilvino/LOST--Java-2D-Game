package LOST;

import java.awt.Rectangle;
import java.util.ArrayList;


public class Enemy {

	private int maxHealth, currentHealth, power, speedX, centerX, centerY;
	private Background bg = StartingClass.getBg1();
        public Rectangle r = new Rectangle(0,0,0,0);
        public int health = 5;
        private boolean isdead;
        public static ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        private int movementSpeed;
        public String direction = "left";
        
        public Enemy(int centerX, int centerY) {
		setCenterX(centerX);
		setCenterY(centerY);
	}
        
	// Behavioral Methods
	public static void update() {
            Robot robot = Robot.getInstance();
            enemies.stream().map((i) -> {
                i.follow();
                return i;
            }).map((i) -> {
                i.centerX += i.speedX;
                return i;
            }).map((i) -> {
                i.speedX = i.bg.getSpeedX() * 5 + i.movementSpeed;
                return i;
            }).map((i) -> {
                i.r.setBounds(i.centerX - 30, i.centerY-10, 85, 60);
                return i;
            }).filter((i) -> (i.r.intersects(robot.yellowRed))).forEachOrdered((i) -> {
                i.checkCollision();
            });
	}
        
        public void follow() {
		
                if (centerX - Robot.getInstance().getCenterX() >650){
                    this.movementSpeed = 0;
                }
                else if (Robot.getInstance().getCenterX() - centerX > 650){
                    this.movementSpeed = 0;
                }

		else if (Math.abs(Robot.getInstance().getCenterX() - centerX) < 5) {
			this.movementSpeed = 0;
		}

		else {

			if (Robot.getInstance().getCenterX() >= centerX) {
				this.direction = "right";
                                this.movementSpeed = 2;
			} 
                        else {
                                this.direction = "left";
				this.movementSpeed = -2;
			}
		}

	}
        
        private void checkCollision() {
            Robot robot = Robot.getInstance();
            if (r.intersects(robot.rect) || r.intersects(robot.rect2)){
            StartingClass.setScreen(Death.getInstance());
            }
        }


	public int getMaxHealth() {
		return maxHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public int getPower() {
		return power;
	}

	public int getSpeedX() {
		return speedX;
	}

	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public Background getBg() {
		return bg;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public void setBg(Background bg) {
		this.bg = bg;
	}
        public boolean getIsDead(){
            return isdead;
        }
        public void setIsDead(boolean s){
            isdead = s;
        }

	
}

