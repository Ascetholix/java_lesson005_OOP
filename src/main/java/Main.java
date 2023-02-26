import Unit.*;
import Unit.pers.*;

import java.util.*;

public class Main {
    static final int UNITS =10 ; // количичество персонажей

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int command;

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.addAll(getUnit(UNITS, 1));

        ArrayList<Person> arrayList1 = new ArrayList<>();
        arrayList1.addAll(getUnit(UNITS, 2));

        ArrayList<Person>arrayListAll = new ArrayList<>();
        arrayListAll.addAll(arrayList);
        arrayListAll.addAll(arrayList1);

        sortList(arrayListAll);
//        printList(arrayListAll);

        do{

            System.out.println("Команда 1");
            printList(arrayList);

            System.out.println("Команда 2");
            printList(arrayList1);

            System.out.printf("Количество персонажей: %s Нажмите клавищу Enter", Person.getPrCount());

            scanner.nextLine();

            for (Person person: arrayListAll) {
                if(arrayList.contains(person)) person.step(arrayList,arrayList1);
                else person.step(arrayList1,arrayList);

            }
            check(arrayList);
            check(arrayList1);
        }
        while (true);
    }

    /** Метод именование персонажей */
    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
        return name;
    }

    /** Методы создание персонажей */
    private static ArrayList getUnit(int a, int group) {

        Random rnd = new Random();
        ArrayList<Person> arrayList = new ArrayList<>();
        int sideXTeam1 = 1;  // положения по Х команды 1
        int sideXTeam2 = a; // положения по Х команды 2
        int columns = 1;   // положения в колоне
        if (group == 0) {
            for (int i = 0; i < a; i++) {
                int per =  rnd.nextInt(6);
                switch (per) {
                    case 0:
                        Crossbowman crossbowman = new Crossbowman(getName(),sideXTeam1, columns);
                        arrayList.add(crossbowman);
                        columns++;
                        break;
                    case 1:
                        Sniper sniper = new Sniper(getName(),sideXTeam1, columns);
                        arrayList.add(sniper);
                        columns++;
                        break;
                    case 2:
                        Monk monk = new Monk(getName(),sideXTeam1, columns);
                        arrayList.add(monk);
                        columns++;
                        break;
                    case 3:
                        Mag mag = new Mag(getName(),sideXTeam1, columns);
                        arrayList.add(mag);
                        columns++;
                        break;
                    case 4:
                        Spearman spearman = new Spearman(getName(),sideXTeam1, columns);
                        arrayList.add(spearman);
                        columns++;
                        break;
                    case 5:
                        Outlaw outlaw = new Outlaw(getName(),sideXTeam1, columns);
                        arrayList.add(outlaw);
                        columns++;
                        break;
                    case 6:
                        Farmer farmer = new Farmer(getName(),sideXTeam1, columns);
                        arrayList.add(farmer);
                        columns++;
                        break;
                }
            }

        }
        if (group == 1) {
            for (int i = 0; i < a; i++) {
                int per =  rnd.nextInt(4);
                switch (per) {
                    case 0:
                        Sniper sniper = new Sniper(getName(),sideXTeam1, columns);
                        arrayList.add(sniper);
                        columns++;
                        break;
                    case 1:
                        Mag mag = new Mag(getName(),sideXTeam1, columns);
                        arrayList.add(mag);
                        columns++;
                        break;
                    case 2:
                        Outlaw outlaw = new Outlaw(getName(),sideXTeam1, columns);
                        arrayList.add(outlaw);
                        columns++;
                        break;
                    case 3:
                        Farmer farmer = new Farmer(getName(),sideXTeam1, columns);
                        arrayList.add(farmer);
                        columns++;
                        break;

                }
            }

        }
        if (group == 2) {
            for (int i = 0; i < a; i++) {
                int per = rnd.nextInt(4);
                switch (per) {
                    case 0:
                        Crossbowman crossbowman = new Crossbowman(getName(),sideXTeam2, columns);
                        arrayList.add(crossbowman);
                        columns++;
                        break;
                    case 1:
                        Monk monk = new Monk(getName(),sideXTeam2, columns);
                        arrayList.add(monk);
                        columns++;
                        break;
                    case 2:
                        Spearman spearman = new Spearman(getName(),sideXTeam2, columns);
                        arrayList.add(spearman);
                        columns++;
                        break;
                    case 3:
                        Farmer farmer = new Farmer(getName(),sideXTeam2, columns);
                        arrayList.add(farmer);
                        columns++;
                        break;
                }
            }
        }

        return arrayList;
    }

    /** Метод вывода*/
    private static void printList(ArrayList<Person> arrayList) {
        System.out.println("******************************************************************************************************");
        System.out.println("    Класс   |    Имя    | Атака | Урон | Hp | Зашита | Speed | Выстр/Маг/Дос | Координаты | Статус  ");
        System.out.println("******************************************************************************************************");


        for (int i = 0; i < arrayList.size(); i++) {
            System.out.printf("%10s\t  %9s %4d\t %d-%d\t %.0f\t %4d\t %5d\t %8d\t %3s\t x:%d y:%d\t  %s\t \n",
                    arrayList.get(i).getInfo(),arrayList.get(i).getName(),arrayList.get(i).getAttack(),arrayList.get(i).getDamageMin(),
                    arrayList.get(i).getDamageMax(),arrayList.get(i).getHp(),arrayList.get(i).getDef(),arrayList.get(i).getSpeed(),
                    arrayList.get(i).getData(),"",arrayList.get(i).position.posX, arrayList.get(i).position.posY, arrayList.get(i).state);
        }
        System.out.println("******************************************************************************************************");
    }

    /** Метод сортировки*/
    private static void sortList(ArrayList<Person> arrayList){
        arrayList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getSpeed()==o2.getSpeed()) return (int) (o1.getHp() - o2.getHp());
                else return o2.getSpeed() - o1.getSpeed();
            }
        });
    }
    /**Метод проверки если персонаж умер все поля 0*/
    private static void check(ArrayList<Person> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).state.equals("Die")){
                arrayList.get(i).setAttack(0);
                arrayList.get(i).setHp(0);
                arrayList.get(i).setDef(0);
                arrayList.get(i).setDamageMax(0);
                arrayList.get(i).setDamageMin(0);
                arrayList.get(i).setSpeed(0);
                arrayList.get(i).setName("++++");
                arrayList.get(i).setData(0);
            }
        }
    }
}