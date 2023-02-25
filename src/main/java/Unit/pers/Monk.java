package Unit.pers;

import Unit.Sorcerer;

/**
 * Монах
 */
public class Monk extends Sorcerer {

    public Monk(String name, int attack, int def, int damageMin, int damageMax, float hp,
                int maxHp, int speed, int magic, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, magic, posX, posY);
    }

    public Monk(String name, int posX, int posY) {
        super( name,12, 7, -4, 0,30f,30, 5, 1,posX, posY);

    }

    public String getInfo(){ return"Монах";}

    public int getData() {return magic;}

    public void setData(int magic){
        this.magic = magic;
    }

}
