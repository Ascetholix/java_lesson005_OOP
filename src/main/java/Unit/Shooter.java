package Unit;

import java.util.ArrayList;

/**
 * Абстрактный класс Стрелок
 */
public abstract class Shooter extends Person{

    public int shot;

    public int getShot() {
        return shot;
    }

    public Shooter(String name, int attack, int def, int damageMin, int damageMax,
                   float hp, float maxHp, int speed, int shot, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, posX, posY);
        this.shot = shot;
    }

    //    Реализовать метод step() лучников.
//    3.1 Если жизнь равна нулю или стрел нет, завершить обработку.
//    3.2 Поиск среди противников наиболее приближённого. мин макс и сред повреждние
//    3.3 Нанести  повреждение найденному противнику.
//    3.4 Найти среди своих крестьянина.
//    3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.
    public void step(ArrayList<Person> team1, ArrayList<Person> team2) {
        if (state.equals("Die") || shot == 0) return;   // 3.1
        int target = findNearest(team2);                // 3.2
        float damage = (team2.get(target).def -attack > 0)?    // 3.3
                damageMin : (team2.get(target).def -attack < 0)?
                damageMax : (damageMin + damageMax)/2;
        team2.get(target).getDamage(damage);    // происвоит опоненту

        // поиск фермара по getInfo и состяную state
        // если условия true то сотяное Busy b выход из цикла

        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getInfo().equals("Фермер") &&
                    team1.get(i).state.equals("Stand")){
                team1.get(i).state = "Busy";
                return;
            }
        }
        shot--;
    }

}
