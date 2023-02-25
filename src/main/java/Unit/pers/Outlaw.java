package Unit.pers;
import Unit.Warrion;

/**
 * Разбойник
 */
public class Outlaw extends Warrion {

    public Outlaw(String name, int attack, int def, int damageMin, int damageMax, float hp,
                  int maxHp, int speed, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, posX, posY);
    }

    public Outlaw(String name, int posX, int posY) {
        super(name, 8, 3, 2, 4, 10f, 10, 6, posX, posY);

    }

    @Override
//    public String getInfo() {
//        return String.format("Разбойник  | %9s | %5d | %2d-%d | %.0f | %6d | %8d |          |       | x:%d y:%d ",
//                this.name, this.attack, this.damageMin, this.damageMax, this.hp, this.def,
//                this.speed, this.position.posX, this.position.posY);
//    }
    public String getInfo(){ return "Разбойник";}
    public int getData() {
        return 0;
    }
}
