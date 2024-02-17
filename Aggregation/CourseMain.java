package Aggregation;

public class CourseMain 
{
    public static void main(String[] args) 
    {
        Instructor instructorClass = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbookClass = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

        Course courseClass1 = new Course("Software Engineering", instructorClass, textbookClass);
        courseClass1.printInfo();

        Instructor instructorClass2 = new Instructor("Ted", "Lasso", "8-345");
        Textbook textbookClass2 = new Textbook("Tactics", "Pep Guardiola", "Manchester City");

        Course courseClass2 = new Course("Soccer", instructorClass2, textbookClass2);
        courseClass2.printInfo();
    }
}