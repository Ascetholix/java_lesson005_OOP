package Unit.pers;

import Unit.Sorcerer;

/**
 * Колдун
 */
public class Mag extends Sorcerer {

    public Mag(String name, int attack, int def, int damageMin, int damageMax, float hp, int maxHp,
               int speed, int magic, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, magic, posX, posY);
    }

    public Mag(String name, int posX, int posY) {
        super(name,17, 12, -5, 0,30f,30, 9, 1, posX, posY);

    }

    @Override
//    public String getInfo() {
//        return String.format("Колдун     | %9s | %5d | %4d | %.0f | %6d | %8d |          | %5d | x:%d y:%d ",
//                this.name, this.attack, this.damageMin, this.hp, this.def, this.speed,
//                this.magic, this.position.posX, this.position.posY);
//    }

    public String getInfo(){ return"Колдун";}
    public int getData() {
        return magic;
    }
    public void setData(int magic){
        this.magic = magic;
    }


}
