package HAG.RKotsurLesson21;

import javax.naming.Name;

/**
 * Created by 1 on 02.02.2019.
 */
public class Human {

    Human(String name, boolean sex, int old, Human father, Human mother){
        this.name = name;
        this.sex = sex;
        this.old = old;
        this.father=father;
        this.mother=mother;
    }

    public Human(String name, boolean sex, int old) {
        this.name = name;
        this.sex = sex;
        this.old = old;
    }

    String name;
    boolean sex;
    int old;
    Human father;
    Human mother;


    @Override
    public String toString() {
        return
                "Имя:" + name + " " +
                ", sex=" + (sex?("мужской"):("женский")) +
                ", old=" + old +
                ", отец=" + father +
                ", мать=" + mother;

    }
}
