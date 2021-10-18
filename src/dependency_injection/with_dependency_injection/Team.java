package dependency_injection.with_dependency_injection;

import java.util.*;

public class Team {


    String teamName;
    List<String> requiredExpertise;
    Interviewee candidate;


    public Team(String name, List<String> requiredExpertise) {
        this.teamName = name;
        this.requiredExpertise = requiredExpertise;
    }


    public List<String> getRequiredExpertise() {
        return this.requiredExpertise;
    }

    /*
     * Dependency Injection : The team's interviewee is set.
     */
    public void setInterviewee(Interviewee cand) {
        this.candidate = cand;
    }


    public void printStatus() {
        if (candidate != null)
            System.out.println(this.teamName + " is interviewing " + this.candidate.getInfo() + ".");

        else
            System.out.println(this.teamName + " does not have an interviewee.");
    }


}
