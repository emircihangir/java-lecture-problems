package P1;
public class P1 {
    public static void main(String[] args) {
        Student student1 = new Student("Emir", "Yazılım 1", 1, 2015);
        Student student2 = new Student("Ahmet", "Elektrik 5", 2, 2019);
        Student student3 = new Student("Mehmet", "Bilgisayar 2", 3, 1985);

        student1.printStudent();
        student2.printStudent();
        student3.printStudent();
    }
}
