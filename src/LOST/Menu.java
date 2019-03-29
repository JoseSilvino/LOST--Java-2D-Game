package LOST;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class Menu extends DynamicBackground implements Updatable{
    
    public double orbitX = -700; /* x-coordinate in orbit's center */
    public double orbitY = -600; /* y-coordinate in orbit's center */
    
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
        
        if (mx>60 && mx<210 && my>250 && my<290) //Play button
            StartingClass.st.setState(StartingClass.starter);
        else if (mx>60 && mx<210 && my>300 && my<340) // intro button
            StartingClass.st.setState(StartingClass.starter.INTRO);
        else if (mx>60 && mx<210 && my>350 && my<390) //guide button
            StartingClass.st.setState(StartingClass.starter.GUIDE);
        else if (mx>60 && mx<210 && my>400 && my<440) // credits button
           StartingClass.st.setState(StartingClass.starter.CREDITS);
        else if(mx>60 && mx<210 && my>450 && my<490)
            System.exit(0);
        
    }

    @Override
    public void pressKey(KeyEvent e) { }

    @Override
    public void releaseKey(KeyEvent e) { }

    @Override
    public void drawImage(Graphics g, StartingClass start) {
        
                    g.drawImage(start.getMenu(), (int)start. MENU.drawX,(int)start.MENU.drawY,start);
                    g.drawImage(start.getLogo(), 510, 32, start);
                    g.drawImage(start.getPlay(),60,250,start);
                    g.drawImage(start.getIntroButton(), 60, 300, start);
                    g.drawImage(start.getGuideButton(),60,350, start);
                    g.drawImage(start.getCreditsButton(),60,400,start);
                    g.drawImage(start.getExit(),60,450,start);
                    g.drawImage(start.getTeamlogo(),60,680,start);
    }
}
