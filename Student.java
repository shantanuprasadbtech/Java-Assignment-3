public class Student {

    // Private variables for name, dob, and prn
    private String name;
    private String dob;
    private int prn;

    // Constructor to create a new Student object with name, dob, and prn
    public Student(String name, String dob, int prn) {
        this.name = name;
        this.dob = dob;
        this.prn = prn;
    }

    // Setter method to set the name of the student
    public void setName(String name){
        this.name = name;
    }

    // Setter method to set the PRN of the student
    public void setPRN(int prn){
        this.prn = prn;
    }

    // Setter method to set dob of the student
    public void setDOB(String dob){
        this.dob = dob;
    }

    // Getter method to get the name of the student
    public String getName() {
        return this.name;
    }

    // Getter method to get the PRN of the student
    public int getPRN() {
        return this.prn;
    }

    // Getter method to get the date of birth of the student
    public String getDOB() {
        return this.dob;
    }
}
