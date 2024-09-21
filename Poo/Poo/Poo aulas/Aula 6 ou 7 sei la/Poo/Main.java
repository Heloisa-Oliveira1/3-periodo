import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Adicionar nota");
            System.out.println("3 - Verificar aprovação");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String name = scanner.next();
                    System.out.print("Idade do aluno: ");
                    int age = scanner.nextInt();
                    Student student = new Student(name, age);
                    students.add(student);
                    System.out.println("Aluno adicionado.");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                        continue;
                    }
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println((i + 1) + " - " + students.get(i).name);
                    }
                    System.out.print("Escolha o número do aluno: ");
                    int studentIdx = scanner.nextInt() - 1;
                    if (studentIdx >= 0 && studentIdx < students.size()) {
                        System.out.print("Nota do aluno: ");
                        double grade = scanner.nextDouble();
                        students.get(studentIdx).addGrade(grade);
                        System.out.println("Nota adicionada.");
                    } else {
                        System.out.println("Índice de aluno inválido.");
                    }
                    break;
                case 3:
                    if (students.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                        continue;
                    }
                    for (Student s : students) {
                        double averageGrade = s.getAverageGrade();
                        String status = averageGrade >= 6 ? "Aprovado" : "Reprovado";
                        System.out.println(s.name + " - Média: " + averageGrade + " - Status: " + status);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.out.println("Obrigado por usar o nosso sistema");
                    System.out.println("Até a próxima");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        }
    }
}