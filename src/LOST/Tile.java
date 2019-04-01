package LOST;

import java.awt.Image;
import java.awt.Rectangle;

public class Tile {
    
    private int tileX, tileY, speedX, type;
    public Image tileImage;
    private Robot robot = Robot.getInstance();
    private Background bg = StartingClass.getBg1();
    private Rectangle r;

    
    public Tile(int x, int y, int typeint){
        tileX = x*40;
        tileY = y*40;
        type = typeint;
        r = new Rectangle();    
        switch (type) {
            case 2:
                tileImage = StartingClass.grasstop;
                break;
            case 3:
                tileImage = StartingClass.tiledirt;
                break;
            case 4:
                tileImage = StartingClass.tilestone;
                break;
            case 5:
                tileImage = StartingClass.tiletree;
                break;
            case 6:
                tileImage = StartingClass.tilerock;
                break;
            default:
                type = 0;
                break;
        }
    }
    public void update(){
        speedX = bg.getSpeedX() * 5;
        tileX += speedX;  
        r.setBounds(tileX, tileY, 40, 40);
        
        if (r.intersects(robot.yellowRed) && type != 0) {
                                
				checkVerticalCollision(robot.rect, robot.rect2);
				checkSideCollision(robot.footleft, robot.footright);
			}
        Enemy.enemies.stream().filter((i) -> (r.intersects(i.r)  && ( type == 2 || type == 3 || type == 6 ))).map((i) -> {
            i.setSpeedX(0);
            return i;
        }).forEachOrdered((i) -> {
            if (i.getCenterX()<tileX)
                i.setCenterX(tileX-55);
            else if (i.getCenterX()>tileX)
                i.setCenterX(tileX+56);
        });
    }
    
   public int getTileX() {
        return tileX;
    }

    public void setTileX(int tileX) {
        this.tileX = tileX;
    }

    public int getTileY() {
        return tileY;
    }

    public void setTileY(int tileY) {
        this.tileY = tileY;
    }
    public Rectangle getRectangle(){
        return r;
    }
    public int getType(){
        return type;
    }

    public Image getTileImage() {
        return tileImage;
    }

    public void setTileImage(Image tileImage) {
        this.tileImage = tileImage;
    }
    
    public void checkVerticalCollision(Rectangle rtop, Rectangle rbot) {
        if ( type == 2 || type == 3 || type == 6 ){
            if (rtop.intersects(r)) {
                robot.setCenterY(tileY+100);
                robot.setSpeedY(-robot.JUMPSPEED);
            }

            if (rbot.intersects(r)) {
                robot.setJumped(false);
                robot.setSpeedY(0);
                robot.setCenterY(tileY - 75);
            }
        }
    }
    
     public void checkSideCollision(Rectangle leftfoot, Rectangle rightfoot) {
        if (type == 2 || type == 3 || type == 6 ){
            
           if (leftfoot.intersects(r)) {
                robot.setCenterX(tileX + 100);
                robot.setSpeedX(0);
            }
            
            else if (rightfoot.intersects(r)) {
                robot.setCenterX(tileX + 15);
                robot.setSpeedX(0);
            }
        }
    }

}