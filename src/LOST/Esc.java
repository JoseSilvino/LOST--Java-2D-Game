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
       StartingClass.setScreen(Menu.getInstance());
    }
    private Esc(){
        super();
    }
    private static class EscHolder{
        private static final Esc INSTANCE = new Esc();
    }
    public static Esc getInstance(){
        return EscHolder.INSTANCE;
    }
    @Override
    public void release() { }
    
}
