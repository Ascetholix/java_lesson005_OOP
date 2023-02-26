package Unit;

import Unit.pers.Farmer;

import java.util.ArrayList;

public abstract class Person implements GameInterface {
    protected String name;
    protected int attack;
    protected int def;
    protected int damageMin;
    protected int damageMax;
    protected float hp;
    protected float maxHp;
    protected int speed;
    public Vector2D position;
    public String state;

    static int prCount;

    public Person(String name, int attack, int def, int damageMin, int damageMax,
                  float hp, float maxHp, int speed, int posX, int posY) {
        this.name = name;
        this.attack = attack;
        this.def = def;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        position = new Vector2D(posX, posY);
        state = "stand";
        prCount++;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDef() {
        return def;
    }

    public int getDamageMin() {
        return damageMin;
    }

    public int getDamageMax() {
        return damageMax;
    }

    public float getHp() {
        return hp;
    }

    public float getMaxHp() {
        return maxHp;
    }

    public int getSpeed() {
        return speed;
    }

    public Vector2D getPosition() {
        return position;
    }

    public String getState() {
        return state;
    }

    public static int getPrCount() {
        return prCount;
    }
    @Override
    public String getInfo() {return "";}

    public int getData(){return 0;}

    @Override
    public void step(ArrayList<Person> team1, ArrayList<Person> team2) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setDamageMin(int damageMin) {
        this.damageMin = damageMin;
    }

    public void setDamageMax(int damageMax) {
        this.damageMax = damageMax;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /** Метода нахождения ближайшего противника */
    public int findNearest(ArrayList<Person> team){
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > position.getDistance(team.get(i).position) & !team.get(i).state.equals("Die")) {
                index = i;
                min = position.getDistance(team.get(i).position);
            }
        }
        return index;
    }
    /** Метод нахождения ближайшего с минимальным Hp*/
    protected int treatmentNearest(ArrayList<Person> team) {
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > team.get(i).hp) {
                index = i;
                min = team.get(i).hp;
            }
        }
        return index;
    }
    /** Метод для ненасение урона */
    protected void getDamage(float damage){
        hp -= damage;
        if (hp > maxHp) hp = maxHp;
        if (hp <= 0) state = "Die";
    }
    public void setData(int data){
    }
}

