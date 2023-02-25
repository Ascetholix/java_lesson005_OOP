package Unit;

import java.util.ArrayList;

/**
 * Абстрактный класс Черодей
 */
public abstract class Sorcerer extends Person{
    public int magic;

    public int getMagic() {
        return magic;
    }


    public Sorcerer(String name, int attack, int def, int damageMin, int damageMax,
                    float hp, int maxHp, int speed, int magic, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, posX, posY);
        this.magic = magic;
    }

    public void step(ArrayList<Person> team1, ArrayList<Person> team2) {
        if (state.equals("Die") || magic == 0) return;
        int target = treatmentNearest(team1);
        float damage = team1.get(target).def -attack;
        team1.get(target).getDamage(damage);    // происвоит

    }

}
