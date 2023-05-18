package org.example;

public interface ContestantDAOInterface {

    void createContestant(Contestant cont);

    void getAllContestants();

    void getContestant(String name);
}
