package org.example;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scan;
    private final ContestantDAOInterface dao;

    public UserInterface() {
        this.scan = new Scanner(System.in);
        this.dao = new ContestantDAO();
    }

    public void start() {

        System.out.println("Welcome to Unasat team manager");

        while (true) {
            System.out.println("Enter number of the corresponding action...\n" +
                    "1. Add contestant\n" +
                    "2. Remove contestant\n" +
                    "3. Show all contestants\n" +
                    "4. Exit team manager");
            System.out.println("----------------------------");
            String userInput = scan.nextLine();
            if (userInput.equals("4")) {

                System.out.println("K thanks bye!");
                return;
            }

            switch (userInput) {
                case "1":
                    Contestant contestant = new Contestant();

                    System.out.println("Enter 1st contestant given name:");
                    String firstName1 = scan.nextLine();

                    System.out.println("Enter 1st contestant family name:");
                    String lastName1 = scan.nextLine();

                    System.out.println("Enter 1st contestant student ID#:");
                    String id1 = scan.nextLine();

                    System.out.println("Enter 1st contestant student age:");
                    int age1 = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter 1st contestant birthday:");
                    System.out.println("Format yyyy-mm-dd");
                    String bd1 = scan.nextLine();

                    System.out.println("Enter 1st contestant contact number:");
                    String ctcNum1 = scan.nextLine();

                    System.out.println("Enter 1st contestant team name:");
                    String teamName = scan.nextLine();

                    System.out.println("Enter 1st contestant email:");
                    String email1 = scan.nextLine();

                    System.out.println("Enter 1st contestant address:");
                    String address1 = scan.nextLine();

                    System.out.println("Enter 1st contestant ict skill-set:");
                    String skillSet1 = scan.nextLine();

                    // set contestant values
                    contestant.setFirstName(firstName1);
                    contestant.setLastName(lastName1);
                    contestant.setId(id1);
                    contestant.setAge(age1);
                    contestant.setBirthday(bd1);
                    contestant.setCtcNumber(ctcNum1);
                    contestant.setTeamName(teamName);
                    contestant.setEmail(email1);
                    contestant.setAddress(address1);
                    contestant.setSkillSet(skillSet1);


                    // add contestant to database
                    dao.createContestant(contestant);
                    System.out.println("----------------------------");
                    break;
                case "2":
                    System.out.println("Enter the name of the contestant you would like to remove.");
                    String contestantToDelete = scan.nextLine();
                    dao.deleteContestant(contestantToDelete);
                    System.out.println("----------------------------");
                    break;
                case "3":
                    System.out.println("Getting all contestants");
                    System.out.println("-------------------------");
                    dao.getAllContestants();
                    System.out.println("----------------------------");
                default:
                    System.out.println("Invalid entry");

            }
        }
    }
}



