/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOST;

import java.awt.event.KeyEvent;
import java.util.HashMap;

/**
 *
 * @author Neto
 */
public class HashEnum {
        private final HashMap<Integer,Action> map = new HashMap<>(8);
        private HashEnum(){
        map.put(KeyEvent.VK_ESCAPE, Esc.getInstance());
        map.put(KeyEvent.VK_SPACE, Space.getInstance());
        map.put(KeyEvent.VK_CONTROL,Ctrl.getInstance());
        map.put(KeyEvent.VK_UP, Up.getInstance());
        map.put(KeyEvent.VK_DOWN,Down.getInstance());
        map.put(KeyEvent.VK_LEFT,Left.getInstance());
        map.put(KeyEvent.VK_RIGHT, Right.getInstance());
        map.put(KeyEvent.VK_ENTER, Enter.getInstance());
    }
    public boolean contains(int index) {
        return map.containsKey(index);
    }
    public Action get(int index) {
        return map.get(index);
    }
    
    public static HashEnum getInstance() {
        return HashEnumHolder.INSTANCE;
    }
    
    private static class HashEnumHolder {

        private static final HashEnum INSTANCE = new HashEnum();
    }
}
