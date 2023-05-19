package org.example;

public class Main {
    public static void main(String[] args) {
        /*UserInterface ui = new UserInterface();
        ui.start();*/

        ContestantDAO dao = new ContestantDAO();

        dao.getAllContestants();
    }
}