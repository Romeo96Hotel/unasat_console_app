package org.example;

public interface TeamDAOInterface {

    void createTeam(String teamName);

    void selectTeam(String teamName);

    void deleteTeam(String teamName);
}
