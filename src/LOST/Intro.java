package LOST;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Intro extends DynamicBackground implements Screen{
    
    public double orbitX = -50; /* x-coordinate in orbit's center */
    public double orbitY = -50; /* y-coordinate in orbit's center */
    
    private Intro(){
        super();
    }
    private static class IntroHolder{
        private static final Intro INSTANCE = new Intro();
    }
    public static Intro getInstance(){
        return IntroHolder.INSTANCE;
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
        if (mx>60 && mx<210 && my>300 && my<340){
            StartingClass.setScreen(Intro.getInstance());            
        }
            else if(mx>20 && mx<170 && my>700 && my<740){
            StartingClass.setScreen(Menu.getInstance());
        }
    }   

    @Override
    public void pressKey(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
           StartingClass.setScreen(Menu.getInstance());
        }
    }

    @Override
    public void releaseKey(KeyEvent e) {
    }

    @Override
    public void drawImage(Graphics g, StartingClass start) {
                    Intro INTRO = Intro.getInstance();
                    g.drawImage(start.getIntroback(),(int)INTRO.drawX, (int)INTRO.drawY, start);
                    g.drawImage(start.getIntrofront(),52, 70, start);
                    g.drawImage(start.getBackButton(),20,700, start);
    }
}
