package Unit.pers;
import Unit.Warrion;

/**
 * Копейщик
 */
public class Spearman extends Warrion {
    public Spearman(String name, int attack, int def, int damageMin, int damageMax,
                    float hp, float maxHp, int speed, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, posX, posY);
    }

    public Spearman(String name, int posX, int posY) {
        super(name,4, 5, 1, 3,10f, 10f,4, posX, posY);
    }

    @Override

    public String getInfo(){ return "Копейщик";}
    public int getData() {
        return 0;
    }

}
