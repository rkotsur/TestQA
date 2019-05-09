package HAG.RKotsurLesson33;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 1 on 10.03.2019.
 */
public class Developer {
    String name;

    Developer(String DevName) {
        this.name = DevName;
    }

    Collection<Skill> collectionSkill = new ArrayList<Skill>();

    void methodAddSkill(Skill skill) {
        collectionSkill.add(skill);
    }

    void returnDeveloper() {
        for (Skill x :
                collectionSkill)
            System.out.println(x.skill);


    }
}
