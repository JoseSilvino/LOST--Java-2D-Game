/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOST;

import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

/**
 *
 * @author Neto
 */
public class State {
    private Updatable state;
    public void mousePress(MouseEvent me) {
        state.mousePress(me);
    }
    public State() {
        this.state = new Start();
    }
    public void setState(Updatable state) {
        this.state = state;
    }
    public Updatable getState() {
        return state;
    }
    public void KeyRelease(KeyEvent e) {
        state.releaseKey(e);
    }
    public void KeyPress(KeyEvent e) {
        state.pressKey(e);
    }
    public void setMousePress(boolean pressed) {
        state.setMousePress(pressed);
    }
    public void update(){
        state.update();
    }
    public void drawImage(Graphics g ,StartingClass start) {
        state.drawImage(g, start);
    }
    
}
