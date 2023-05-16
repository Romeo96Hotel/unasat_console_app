package org.example;

public class Contestant {
    private String firstName;
    private String lastName;
    private String id;
    private int age;
    private String email;
    private String address;
    private String ctcNumber;
    private String skillSet;
    private String teamName;
    private String birthday;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCtcNumber(String ctcNumber) {
        this.ctcNumber = ctcNumber;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCtcNumber() {
        return ctcNumber;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        return "Contestant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", ctcNumber='" + ctcNumber + '\'' +
                ", skillSet='" + skillSet + '\'' +
                ", teamName='" + teamName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
