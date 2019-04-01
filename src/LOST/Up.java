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
public class Up implements Action{

    @Override
    public void release() { }

    @Override
    public void press() {
      System.out.println("Move up");
    }
    private Up(){
        super();
    }
    private static class UpHolder{
        private static final Up INSTANCE = new Up();
    }
    public static Up getInstance(){
        return UpHolder.INSTANCE;
    }
    
}
