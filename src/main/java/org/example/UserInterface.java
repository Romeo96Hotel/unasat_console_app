package org.example;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scan;
    private final ContestantDAOInterface conDao;
    private final TeamDAOInterface teamDao;

    public UserInterface() {
        this.scan = new Scanner(System.in);
        this.conDao = new ContestantDAO();
        this.teamDao = new TeamDAO();
    }

    public void start() {

        System.out.println("Welcome to Unasat team manager");

        while (true) {
            System.out.println("Enter number of the corresponding action...\n" +
                    "1. Add team\n" +
                    "2. Remove team\n" +
                    "3. view team(Shows contestants info)\n" +
                    "4. Exit team manager");
            System.out.println("----------------------------");
            String userInput = scan.nextLine();
            if (userInput.equals("4")) {

                System.out.println("K thanks bye!");
                return;
            }

            switch (userInput) {
                case "1":
                    Contestant contestant1 = new Contestant();
                    Contestant contestant2 = new Contestant();

                    System.out.println("Enter Team's name");
                    String teamName = scan.nextLine();

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

                    System.out.println("Enter 1st contestant email:");
                    String email1 = scan.nextLine();

                    System.out.println("Enter 1st contestant address:");
                    String address1 = scan.nextLine();

                    System.out.println("Enter 1st contestant ict skill-set:");
                    String skillSet1 = scan.nextLine();

                    System.out.println("-------------------------------------");

                    // set contestant1 values
                    contestant1.setFirstName(firstName1);
                    contestant1.setLastName(lastName1);
                    contestant1.setId(id1);
                    contestant1.setAge(age1);
                    contestant1.setBirthday(bd1);
                    contestant1.setCtcNumber(ctcNum1);
                    contestant1.setTeamName(teamName);
                    contestant1.setEmail(email1);
                    contestant1.setAddress(address1);
                    contestant1.setSkillSet(skillSet1);

                    System.out.println("Enter 2nd contestant given name:");
                    String firstName2 = scan.nextLine();

                    System.out.println("Enter 2nd contestant family name:");
                    String lastName2 = scan.nextLine();

                    System.out.println("Enter 2nd contestant student ID#:");
                    String id2 = scan.nextLine();

                    System.out.println("Enter 2nd contestant student age:");
                    int age2 = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter 2nd contestant birthday:");
                    System.out.println("Format yyyy-mm-dd");
                    String bd2 = scan.nextLine();

                    System.out.println("Enter 2nd contestant contact number:");
                    String ctcNum2 = scan.nextLine();

                    System.out.println("Enter 2nd contestant email:");
                    String email2 = scan.nextLine();

                    System.out.println("Enter 2nd contestant address:");
                    String address2 = scan.nextLine();

                    System.out.println("Enter 2nd contestant ict skill-set:");
                    String skillSet2 = scan.nextLine();

                    // set contestant2 values
                    contestant2.setFirstName(firstName2);
                    contestant2.setLastName(lastName2);
                    contestant2.setId(id2);
                    contestant2.setAge(age2);
                    contestant2.setBirthday(bd2);
                    contestant2.setCtcNumber(ctcNum2);
                    contestant2.setTeamName(teamName);
                    contestant2.setEmail(email2);
                    contestant2.setAddress(address2);
                    contestant2.setSkillSet(skillSet2);

                    // add contestants to database
                    // add team to database
                    teamDao.createTeam(teamName);
                    conDao.createContestant(contestant1);
                    conDao.createContestant(contestant2);
                    System.out.println("-------------------------------");
                    break;

                case "2":
                    System.out.println("Enter name of team to delete");
                    String deleteTeam = scan.nextLine();
                    teamDao.deleteTeam(deleteTeam);
                    System.out.println("-------------------------------");
                    break;

                case "3":
                    System.out.println("Insert name of team to view?");
                    String searchedTeam = scan.nextLine();
                    teamDao.selectTeam(searchedTeam);
                    conDao.getContestant(searchedTeam);
                    System.out.println("-------------------------------");
                    break;

                default:
                    System.out.println("Invalid entry");
                    break;

            }

        }
    }
}



