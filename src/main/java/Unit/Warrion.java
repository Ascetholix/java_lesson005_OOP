package Unit;

import java.util.ArrayList;

public abstract class Warrion extends  Person{

    public Warrion(String name, int attack, int def, int damageMin, int damageMax,
                   float hp, int maxHp, int speed, int posX, int posY) {
        super(name, attack, def, damageMin, damageMax, hp, maxHp, speed, posX, posY);
    }

    public void step(ArrayList<Person> team1, ArrayList<Person> team2) {
        if (state.equals("Die")) return;
        int target = findNearest(team2);
        float damage = (team2.get(target).def -attack > 0)?
                damageMin : (team2.get(target).def -attack > 0)?
                damageMax : (damageMin+damageMax)/2;
        team2.get(target).getDamage(damage);

        // поиск фермара по getInfo и состяную state
        // если условия true то сотяное Busy b выход из цикла

        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getInfo().split(" | ")[0].equals("Фермер") &&
                    team1.get(i).state.equals("Stand")){
                team1.get(i).state = "Busy";
                return;
            }
        }
    }
}
