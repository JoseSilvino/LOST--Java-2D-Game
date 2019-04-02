/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOST;
import java.awt.Graphics;
import java.awt.event.*;
/**
 *
 * @author Neto
 */
public interface Screen {
    public void update();
    public void setMousePress(boolean mousePress);
    public void pressKey(KeyEvent e);
    public void releaseKey(KeyEvent e);
    public void drawImage(Graphics g , StartingClass start);
    public void mousePress(MouseEvent e);
}
