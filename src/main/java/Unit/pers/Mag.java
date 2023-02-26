package Unit.pers;

import Unit.Sorcerer;

/**
 * Колдун
 */
public class Mag extends Sorcerer {

    public Mag(String name, int attack, int def, int damageMin, int damageMax, float hp, float maxHp,
               int speed, int magic, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, magic, posX, posY);
    }

    public Mag(String name, int posX, int posY) {
        super(name,17, 12, -4, 0,30f,30f, 9, 1, posX, posY);

    }

    public String getInfo(){ return "Колдун";}
    public int getData() {
        return magic;
    }
    public void setData(int magic){
        this.magic = magic;
    }


}
