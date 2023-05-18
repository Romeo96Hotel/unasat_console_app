package org.example;

public interface TeamDAOInterface {

    public void createTeam(String teamName);

    public void deleteTeam(String teamName);

    public void joinContestants(String contestant1, String contestant2);
}
