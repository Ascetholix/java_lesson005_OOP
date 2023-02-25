package Unit.pers;
import Unit.Warrion;

/**
 * Копейщик
 */
public class Spearman extends Warrion {
    public Spearman(String name, int attack, int def, int damageMin, int damageMax,
                    float hp, int maxHp, int speed, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, posX, posY);
    }

    public Spearman(String name, int posX, int posY) {
        super(name,4, 5, 1, 3,10f, 10,4, posX, posY);
    }

    @Override
//    public String getInfo() {
//        return String.format("Копейщик   | %9s | %5d | %2d-%d | %.0f | %6d | %8d |          |       | x:%d y:%d ",
//                this.name, this.attack, this.damageMin, this.damageMax, this.hp, this.def,
//                this.speed, this.position.posX, this.position.posY);
//    }
    public String getInfo(){ return "Копейщик";}
    public int getData() {
        return 0;
    }

}
