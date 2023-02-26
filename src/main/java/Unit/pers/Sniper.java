package Unit.pers;
import Unit.Shooter;

/**
 * Снайпер
 */
public class Sniper extends Shooter {

    public Sniper(String name, int attack, int def, int damageMin, int damageMax, float hp,
                  float maxHp, int speed, int shot, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, shot, posX, posY);
    }

    public Sniper(String name, int posX, int posY){
        super(name,12, 10, 8,10,15f,15f, 9, 32, posX, posY);
    }

    public String getInfo(){ return "Снайпер";}
    public int getData() {
        return shot;
    }
    public void setData(int shot){
        this.shot = shot;
    }

}


