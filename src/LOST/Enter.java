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
public class Enter implements Action {

    @Override
    public void release() { }

    @Override
    public void press() {
        StartingClass.st.setState(StartingClass.starter);
    }
    
}
