/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOST;

/**
 *
 * @author Neto
 */
public class Esc implements Action {

    @Override
    public void press() {
       StartingClass.st.setState(StartingClass.starter.MENU);
    }

    @Override
    public void release() { }
    
}
