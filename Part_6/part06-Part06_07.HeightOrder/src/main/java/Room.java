
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
public class Room {

    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        if (this.room.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }
        Person toReturn = room.get(0);
        for (Person per : room) {
            if (per.getHeight() < toReturn.getHeight()) {
                toReturn = per;
            }

        }
        return toReturn;
    }

    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }
        Person shortest = shortest();

        this.room.remove(shortest);

        return shortest;
    }
}
