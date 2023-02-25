package Unit.pers;
import Unit.Shooter;
/**
 * Арбалетчик
 */
public class Crossbowman extends Shooter {

    public Crossbowman(String name, int attack, int def, int damageMin, int damageMax, float hp,
                       int maxHp, int speed, int shot, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, shot, posX, posY);
    }

    public Crossbowman(String name, int posX, int posY) {
        super(name,6, 3, 2,3, 10f,10, 4, 16,posX, posY);

    }

    @Override
//    public String getInfo() {
//        return String.format("Арбалетчик | %9s | %5d | %2d-%d | %.0f | %6d | %8d | %8d |       | x:%d y:%d ",
//                this.name, this.attack, this.damageMin, this.damageMax, this.maxHp, this.def, this.speed,
//                this.shot, this.position.posX, this.position.posY);
//    }
    public String getInfo(){return "Арбалетчик";}

    @Override
    public int getData() {
        return shot;
    }
    public void setData(int shot){
        this.shot = shot;
    }
}
