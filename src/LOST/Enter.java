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
    private Enter(){
        super();
    }
    private static class EnterHolder{
        private static final Enter INSTANCE = new Enter();
    }
    public static Enter getInstance(){
        return EnterHolder.INSTANCE;
    }
    @Override
    public void press() {
        StartingClass.setScreen(StartingClass.starter);
    }
    
}
