package com.ikea;

public class CGEmployee {
  private String firstName;
  private String lastName;
  private String empno;
  private int salary;
  private String homeAddress;
  private String company;
  private String state;
  private String skill;
  private boolean vaccinated;


  public CGEmployee(String firstName, String lastName, String empno, int salary, String homeAddress, String company, String skill, boolean vaccinated) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.empno = empno;
    this.salary = salary;
    this.homeAddress = homeAddress;
    this.company = company;
    this.skill = skill;
    this.vaccinated = vaccinated;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmpno() {
    return empno;
  }

  public void setEmpno(String empno) {
    this.empno = empno;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(String homeAddress) {
    this.homeAddress = homeAddress;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) { this.state = state; }


  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public boolean isVaccinated() {
    return vaccinated;
  }

  public void setVaccinated(boolean vaccinated) {
    this.vaccinated = vaccinated;
  }

  @Override
  public String toString() {
    return "CGEmployee{" +
            "firstName:'" + firstName + '\'' +
            ", lastName:'" + lastName + '\'' +
            ", empno:'" + empno + '\'' +
            ", salary:" + salary +
            ", homeAddress:'" + homeAddress + '\'' +
            ", company:'" + company + '\'' +
            ", state:'" + state + '\'' +
            ", skill:'" + skill + '\'' +
            ", vaccinated:" + vaccinated +
            '}';
  }
}
