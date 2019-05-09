package HAG.RKotsurLesson33;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 1 on 10.03.2019.
 */
public class Team {
    Collection <Developer> collectionDeveloper= new ArrayList<Developer>();
    void methodAddTeam(Developer dev){
        collectionDeveloper.add(dev);
    }
    void returnNameDeveloper(){
        for (Developer x:
             collectionDeveloper) {
            x.returnDeveloper();
            System.out.println(x.name);
        }
    }
}
