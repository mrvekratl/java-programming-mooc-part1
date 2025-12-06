
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Monster
 */
public class Stack {

    private ArrayList<String> values = new ArrayList<>();

    public Stack() {
        this.values = new ArrayList<>();
    }
    public boolean isEmpty(){
        return this.values.isEmpty();
    }
    
    public void add(String value){
        this.values.add(value);
    }
    
    public ArrayList<String> values(){
        return this.values;
    }
    public String take(){
        String topValue = this.values.get(this.values.size() -1);
        this.values.remove(this.values.size() -1);
        return topValue;
    }

}
