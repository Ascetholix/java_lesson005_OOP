package Unit.pers;
import Unit.Shooter;

/**
 * Снайпер
 */
public class Sniper extends Shooter {

    public Sniper(String name, int attack, int def, int damageMin, int damageMax, float hp,
                  int maxHp, int speed, int shot, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, shot, posX, posY);
    }

    public Sniper(String name, int posX, int posY){
        super(name,12, 10, 8,10,15f,15, 9, 32, posX, posY);
    }

    @Override
//    public String getInfo() {
//        return String.format("Снайпер    | %9s | %5d | %d-%d | %.0f | %6d | %8d | %8d |       | x:%d y:%d ",
//                this.name, this.attack, this.damageMin, this.damageMax, this.hp, this.def, this.speed,
//                this.shot, this.position.posX, this.position.posY);
//    }
    public String getInfo(){ return "Снайпер";}
    public int getData() {
        return shot;
    }
    public void setData(int shot){
        this.shot = shot;
    }

}


