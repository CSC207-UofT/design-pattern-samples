package dependency_injection.with_dependency_injection;

import java.util.*;

public class Recruiter extends User {


    /*
     * Recruiter acts as a dependency injector.
     * It introduces related candidates to related teams.
     */

    private final List<Team> teams;


    public Recruiter(String name, String email, List<Team> teams) {
        super(name, email);
        this.teams = teams;
    }


    public List<Team> getTeams() {
        return this.teams;
    }

    public void match(Interviewee interviewee) {
        Team hiringTeam = findTeam(interviewee);

        if (hiringTeam != null) {
            introduce(hiringTeam, interviewee);
        }


    }

    /*
     * Dependency injection happens here.
     */
    public void introduce(Team hiringTeam, Interviewee interviewee) {
        hiringTeam.setInterviewee(interviewee);
        interviewee.setHiringTeam(hiringTeam);
    }


    public Team findTeam(Interviewee interviewee) {
        Team hiringTeam = null;

        for (Team t : teams) {
            int counter = 0;

            Set<String> reqExpertise = new HashSet<>(t.getRequiredExpertise());

            for (String expertise : interviewee.getExpertise())
                if (reqExpertise.contains(expertise))
                    counter++;

            if (counter >= 0.6 * t.getRequiredExpertise().size()) {
                hiringTeam = t;
                break;
            }
        }

        return hiringTeam;
    }

}
