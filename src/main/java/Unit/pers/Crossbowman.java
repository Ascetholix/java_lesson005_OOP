package Unit.pers;
import Unit.Shooter;
/**
 * Арбалетчик
 */
public class Crossbowman extends Shooter {

    public Crossbowman(String name, int attack, int def, int damageMin, int damageMax, float hp,
                       float maxHp, int speed, int shot, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, shot, posX, posY);
    }

    public Crossbowman(String name, int posX, int posY) {
        super(name,6, 3, 2,3, 10f,10f, 4, 16,posX, posY);

    }

    public String getInfo(){return "Арбалетчик";}

    @Override
    public int getData() {
        return shot;
    }
    public void setData(int shot){
        this.shot = shot;
    }
}
