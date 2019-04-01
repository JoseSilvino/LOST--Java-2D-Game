package LOST;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class credits extends DynamicBackground implements Updatable{
    
    public double orbitX = -50; /* x-coordinate in orbit's center */
    public double orbitY = -50; /* y-coordinate in orbit's center */
    public double orbitRadius = 20;

    @Override
    public void update(){
                        radian = orbitSpeed * t;
                        drawX = orbitX + orbitRadius * Math.cos(radian);
                        drawY = orbitY + orbitRadius * Math.sin(radian);
                        t+=1;
    }
    private credits(){
        super();
    }
    private static class creditsHolder{
        private static final credits INSTANCE = new credits();
    }
    public static credits getInstance(){
    return creditsHolder.INSTANCE;
    }
    @Override
 public void mousePress(MouseEvent e){
   int mx=e.getX();
   int my= e.getY();
   State St = State.getInstance();
    if (mx>60 && mx<210 && my>400 && my<440)
       St.setState(getInstance());
       
    if(mx>20 && mx<170 && my>700 && my<740)
      St.setState(Menu.getInstance());
    }   

    @Override
    public void pressKey(KeyEvent e) {
         if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
            State.getInstance().setState(Menu.getInstance());
        }
    }

    @Override
    public void releaseKey(KeyEvent e) { }

    @Override
    public void drawImage(Graphics g, StartingClass start) {
                    credits CREDITS = credits.getInstance();
                    g.drawImage(start.getCredits(), (int)CREDITS.drawX, (int)CREDITS.drawY, start);
                    g.drawImage(start.getCredits1(),183,84, start);
                    g.drawImage(start.getBackButton(),20,700, start);
    }
}
