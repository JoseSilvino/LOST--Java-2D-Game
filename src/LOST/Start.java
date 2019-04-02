/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOST;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Neto
 */
public class Start implements Screen {

    @Override
    public void update() { }

    @Override
    public void setMousePress(boolean mousePress) {
    }
    private static class St{
        private static final Start INSTANCE = new Start();
    }
    public static Start getInstance(){
        return St.INSTANCE;
    }
    @Override
    public void pressKey(KeyEvent e) {
       if(e.getKeyCode()==KeyEvent.VK_SPACE) {
           StartingClass.setScreen(Menu.getInstance());
       }
    }

    @Override
    public void releaseKey(KeyEvent e) { }

    @Override
    public void drawImage(Graphics g, StartingClass start) {
        g.drawImage(start.getStart(), 0, 0, start);
    }

    @Override
    public void mousePress(MouseEvent e) {
       
    }
    
}
