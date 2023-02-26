package Unit.pers;
import Unit.Warrion;

/**
 * Разбойник
 */
public class Outlaw extends Warrion {

    public Outlaw(String name, int attack, int def, int damageMin, int damageMax, float hp,
                  float maxHp, int speed, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, posX, posY);
    }

    public Outlaw(String name, int posX, int posY) {
        super(name, 8, 3, 2, 4, 10f, 10f, 6, posX, posY);

    }

    public String getInfo(){ return "Разбойник";}
    public int getData() {
        return 0;
    }
}
