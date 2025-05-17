package P1;
public class Student {
    public String name, className;
    public int studentNumber, yearRegistered;

    public Student(String name, String className, int studentNumber, int yearRegistered){
        this.name = name;
        this.className = className;
        this.studentNumber = studentNumber;
        this.yearRegistered = yearRegistered;
    }

    public void printStudent(){
        System.out.println("Name: " + name);
        System.out.println("Number: " + studentNumber);
        System.out.println("Class: " + className);
        System.out.println("Year registered: " + yearRegistered);
    }
}
