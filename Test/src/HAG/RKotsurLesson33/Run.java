package HAG.RKotsurLesson33;

import HAG.RKotsurLesson31.Test.TestArr;

/**
 * Создать класс Team, который содержит коллекции экземпляров класс Developer.
 ● Класс Developer содержит коллекцию классов Skill
 ● Создать класс Project, который содержит экземпляр класса Team.
 ● Необходимо реализовать методы для вывода на экран всех разработчиков в команде и вывести их навыки.

 P.s. Возможно во время решения этой задачи возникнут некоторые вопросы, так что мы ее рассмотрим на занятии.

 */
public class Run {
    public static void main(String[] args) {
        //Create Skill
        Skill skill0 = new Skill("Run");
        Skill skill1 = new Skill("go");
        Skill skill2= new Skill("read");
        Skill skill3 = new Skill("listen");
        Skill skill4 = new Skill("hear");
        Skill skill5 = new Skill("writeCode");

        //Create Dev
        Developer developer0 = new Developer("PETRO");
        Developer developer1 = new Developer("RUSLAN");
        Developer developer2 = new Developer("MASHA");

        //Fill skill Dev
        developer0.methodAddSkill(skill0);
        developer0.methodAddSkill(skill2);
        developer0.methodAddSkill(skill3);
        developer0.methodAddSkill(skill1);

        developer1.methodAddSkill(skill5);
        developer1.methodAddSkill(skill4);
        developer1.methodAddSkill(skill2);

        developer2.methodAddSkill(skill0);
        developer2.methodAddSkill(skill2);
        developer2.methodAddSkill(skill3);
        developer2.methodAddSkill(skill1);
        developer2.methodAddSkill(skill5);

        //Create team
        Team  team0 = new Team();
        Team  team1 = new Team();

        //Fill team
        team0.methodAddTeam(developer0);
        team0.methodAddTeam(developer1);

        team1.methodAddTeam(developer0);
        team1.methodAddTeam(developer1);
        team1.methodAddTeam(developer2);

        //Create Project
        Project project = new Project();

        //Fill Project
        project.methodAddProject(team0);
        project.methodAddProject(team1);

        project.seeAllTeam();

    }
}
