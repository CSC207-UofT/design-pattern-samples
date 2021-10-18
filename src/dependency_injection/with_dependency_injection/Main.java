package dependency_injection.with_dependency_injection;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
         * Design Technique: Dependency  Injection
         *
         * @author: Mahsa Sadi
         * @since 2020 - 09 - 01
         */

        Team t1 = new Team("Team A", Arrays.asList("Cloud", "Distributed Systems", "Java"));
        Team t2 = new Team("Team B", Arrays.asList("Machine Learning", "Data Science", "Python"));
        Team t3 = new Team("Team C", Arrays.asList("Compiler", "Natural Language Processing", "C"));

        Recruiter recruiter = new Recruiter("Josh", "Josh@companyX.com", Arrays.asList(t1, t2, t3));


        Interviewee i1 = new Interviewee("Sarah Simin", "Sarah@gmail.com", Arrays.asList("Java", "Cloud"));
        recruiter.match(i1);
        i1.printStatus();

        Interviewee i2 = new Interviewee("Saman Solat", "Saman@gmail.com", Arrays.asList("Machine Learning", "Data Science"));
        recruiter.match(i2);
        i2.printStatus();

        Interviewee i3 = new Interviewee("Samin Sima", "Samin@gmail.com", Arrays.asList("Java", "Compiler"));
        recruiter.match(i3);
        i3.printStatus();

        for (Team t : recruiter.getTeams())
            t.printStatus();


    }

}
