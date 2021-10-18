package dependency_injection.with_dependency_injection;

import java.util.*;

public class Interviewee extends User {

    private final List<String> expertise;
    private Team hiringTeam;

    public Interviewee(String name, String email, List<String> expertise) {
        super(name, email);
        this.expertise = expertise;
    }


    public List<String> getExpertise() {
        return this.expertise;
    }

    /*
     * Dependency Injection : The Interviewee's team is set..
     */

    public void setHiringTeam(Team t) {
        this.hiringTeam = t;
    }


    public void printStatus() {
        if (hiringTeam != null)
            System.out.println("Candidate " + this.getName() + " is matched to " + this.hiringTeam.teamName + ".");

        else
            System.out.println("There is no team match for the interviewee " + this.getName() + ".");
    }

}
