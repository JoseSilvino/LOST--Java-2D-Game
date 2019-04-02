package LOST;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class Death extends DynamicBackground implements Screen{
    
    public double orbitX = -110; /* x-coordinate in orbit's center */
    public double orbitY = -60; /* y-coordinate in orbit's center */
    private Death(){
        super();
    }
    private static class DeathHolder{
        private static final Death INSTANCE = new Death();
    }
    public static Death getInstance(){
        return DeathHolder.INSTANCE;
    }
    @Override
    public void update(){
                        radian = orbitSpeed * t;
                        drawX = orbitX + orbitRadius * Math.cos(radian);
                        drawY = orbitY + orbitRadius * Math.sin(radian);
                        t+=1;
    }

    @Override
    public void mousePress(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();
        
        StartingClass.restart();
        if (mx>60 && mx<210 && my>350 && my<390){
            StartingClass.setScreen(Menu.getInstance());
        }
        else if(mx>60 && mx<210 && my>400 && my<440){
            StartingClass.setScreen(StartingClass.starter);
        }
    }

    @Override
    public void pressKey(KeyEvent e) { }

    @Override
    public void releaseKey(KeyEvent e) { }

    @Override
    public void drawImage(Graphics g, StartingClass start) {
        Death DEATH = Death.getInstance();
                    g.drawImage(start.getDeathimg(), (int) DEATH.drawX,(int)DEATH.drawY,start);
                    g.drawImage(start.getMenubutton(),60,350, start);
                    g.drawImage(start.getPlayagain(),60,400, start);
    }
}
