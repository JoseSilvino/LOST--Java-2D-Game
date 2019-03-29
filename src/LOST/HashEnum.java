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
    private final HashMap<Integer,Action> map = new HashMap<>();
    public HashEnum(){
        map.put(KeyEvent.VK_ESCAPE, new Esc());
        map.put(KeyEvent.VK_SPACE,new Space());
        map.put(KeyEvent.VK_CONTROL,new Ctrl());
        map.put(KeyEvent.VK_UP, new Up());
        map.put(KeyEvent.VK_DOWN,new Down());
        map.put(KeyEvent.VK_LEFT,new Left());
        map.put(KeyEvent.VK_RIGHT,new Right());
        map.put(KeyEvent.VK_ENTER, new Enter());
    }
    public boolean contains(int index) {
        return map.containsKey(index);
    }
    public Action get(int index) {
        return map.get(index);
    }
}
