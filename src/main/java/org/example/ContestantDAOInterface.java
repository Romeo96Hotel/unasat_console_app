package org.example;

public interface ContestantDAOInterface {

    void createContestant(Contestant cont);

    void deleteContestant(String name);

    void getAllContestants();

    void getContestant(String name);
}
