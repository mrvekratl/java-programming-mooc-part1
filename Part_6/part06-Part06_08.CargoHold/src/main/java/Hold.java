
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
public class Hold {
     private int weightLimit;
    private ArrayList<Suitcase> suitcases;

    public Hold(int weightLimit) {
        this.weightLimit = weightLimit;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = this.getCurrentWeight();
        if (weight + suitcase.totalWeight() <= this.weightLimit) {
            this.suitcases.add(suitcase);
        }
    }

    public int getCurrentWeight() {
        int weight = 0;
        for (Suitcase suitcase : this.suitcases) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }
    public String toString() {
        int weight = this.getCurrentWeight();
        return this.suitcases.size() + " suitcases (" + weight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
