
package LOST;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class Guide extends DynamicBackground implements Updatable{
    
    public double orbitX = -20; /* x-coordinate in orbit's center */
    public double orbitY = -20; /* y-coordinate in orbit's center */
    private Guide(){
        super();
    }
    private static class GuideHolder{
    private static final Guide INSTANCE = new Guide();
   }
    public static Guide getInstance(){
        return GuideHolder.INSTANCE;
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
        State St = State.getInstance();
        if (mx>60 && mx<210 && my>350 && my<390){
            St.setState(Guide.getInstance());
            
        }
            else if(mx>20 && mx<170 && my>700 && my<740){            
            St.setState(Menu.getInstance());
        }
    }

    @Override
    public void pressKey(KeyEvent e) {
        State St = State.getInstance();
                if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
            St.setState(Menu.getInstance());
        }
    }

    @Override
    public void releaseKey(KeyEvent e) { }

    @Override
    public void drawImage(Graphics g, StartingClass start) {
                    Guide GUIDE = getInstance();
                    g.drawImage(start.getGuideback(),(int)GUIDE.drawX,(int)GUIDE.drawY, start);
                    g.drawImage(start.getGuidefront(),478,170, start);
                    g.drawImage(start.getBackButton(), 20,700, start);

    }
}
