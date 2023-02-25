package Unit.pers;
import Unit.Person;

import java.util.ArrayList;

/**
 * Фермер
 */
public class Farmer extends Person {
    int  delivery;

    public Farmer(String name, int attack, int def, int damageMin, int damageMax, float hp,
                  int maxHp, int speed, int delivery, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, posX, posY);
        this.delivery = delivery;
    }

    public Farmer(String name, int posX, int posY) {
        super(name, 1, 1, 1, 0,1f,1, 3,posX, posY);
        this.delivery = 1;
    }

    public int getDelivery() {
        return delivery;
    }

    @Override
//    public String getInfo() {
//        return String.format("Фермер     | %9s | %5d | %4d | %.0f | %6d | %8d |          |       | x:%d y:%d ",
//                this.name, this.attack, this.damageMax, this.hp, this.def,
//                this.speed, this.position.posX, this.position.posY);
//    }

    public String getInfo(){ return"Фермер";}
    public void step(ArrayList<Person> team1, ArrayList<Person> team2) {
        if (!this.state.equals("Die") ) this.state = "Stand";
    }
    public int getData() {
        return delivery;
    }
    public void setData(int delivery){
        this.delivery = delivery;
    }


}
