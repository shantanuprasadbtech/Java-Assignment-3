# Student Records Database

A Java program that manages a list of students. The program allows the user to input, display, update, and delete student records.

Classes: 

Student

This class defines a Student object with the following attributes:


name (String): the student's name

dob (String): the student's date of birth

prn (int): the student's prn

This class provides getter and setter methods.

UserInput

This class is responsible for getting user input for a new student record. It contains a single method inputStudent() which prompts the user for the student's name, date of birth, and PRN. It returns an array containing these three values.

Main

This class contains the main method that runs the program. It creates an array of Student objects based on user input, and provides options for displaying, updating, and deleting student records.

Methods in Main

display(Student[] students): Displays a list of all student records.
update(Student[] students, int updPrn): Updates the student record with the given PRN.
delete(Student[] students, int delPrn): Deletes the student record with the given PRN.
