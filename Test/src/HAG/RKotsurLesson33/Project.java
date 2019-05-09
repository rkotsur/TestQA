package HAG.RKotsurLesson33;

import HAG.RKotsurLesson21.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 1 on 10.03.2019.
 */
public class Project {
    Collection <Team> teams = new ArrayList<Team>();
    void methodAddProject(Team teamAdd){
        teams.add(teamAdd);

    }
    void seeAllTeam(){
        for (Team x:
             teams) {
            x.returnNameDeveloper();
            System.out.println(x);

        }
    }
        }


