import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int age;
    List<Double> grades;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double getAverageGrade() {
        if (this.grades.isEmpty()) {
            return 0;
        }
        double sum = 0;

        for (double grade : this.grades) {
            sum += grade;
        }

        return sum / this.grades.size();
    }

    public boolean isPassing() {
        return this.getAverageGrade() >= 60;
    }

    public static void main(String[] args) {
        Student student = new Student("Ze das coves", 55);
        student.addGrade(60);
        student.addGrade(55);

        System.out.println("A média da nota é: "+ student.getAverageGrade());

        System.out.println("O aluno está aprovado: "+ student.isPassing());
    }
}