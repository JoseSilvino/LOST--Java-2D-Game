
package LOST;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class Guide extends DynamicBackground implements Updatable{
    
    public double orbitX = -20; /* x-coordinate in orbit's center */
    public double orbitY = -20; /* y-coordinate in orbit's center */
    
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
        
        if (mx>60 && mx<210 && my>350 && my<390){
            StartingClass.st.setState(StartingClass.starter.GUIDE);
            
        }
            else if(mx>20 && mx<170 && my>700 && my<740){            
            StartingClass.st.setState(StartingClass.starter.MENU);
        }
    }

    @Override
    public void pressKey(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
            StartingClass.st.setState(StartingClass.starter.MENU);
        }
    }

    @Override
    public void releaseKey(KeyEvent e) { }

    @Override
    public void drawImage(Graphics g, StartingClass start) {
                        g.drawImage(start.getGuideback(),(int)start.GUIDE.drawX,(int)start.GUIDE.drawY, start);
                    g.drawImage(start.getGuidefront(),478,170, start);
                    g.drawImage(start.getBackButton(), 20,700, start);

    }
}
