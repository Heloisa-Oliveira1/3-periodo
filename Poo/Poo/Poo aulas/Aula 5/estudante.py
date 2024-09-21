class Student:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        self.grades = []

    def add_grade(self, grade):
        return self.grades.append(grade)
    
    def get_avarege_grade(self):
        if len(self.grades) == 0:
            return 0
        return sum(self.grades) / len(self.grades)
    
    @property
    def is_passing(self):
        return self.get_avarege_grade() >= 60
    
    @classmethod
    def main(cls):
        students = []
        print("------------------------")
        while True:
            print("1 - Adicionar aluno")
            print("2 - Adicionar nota")
            print("3 - Verificar aprovação")
            print("4 - Sair")
            choice = int(input("Escolha uma opção: "))

            if choice == 1:
                name = input("Nome do aluno: ")
                age = int(input("Idade do aluno: "))
                student = cls(name, age)
                students.append(student)
                print("Aluno adicionado.")
                print("----------------")
            elif choice == 2:
                if not students:
                    print("Nenhum aluno cadastrado.")
                    continue
                for idx, student in enumerate(students):
                    print(f"{idx + 1} - {student.name}")
                student_idx = int(input("Escolha o número do aluno: ")) - 1

                if 0 <= student_idx < len(students):
                    grade = float(input("Nota do aluno: "))
                    students[student_idx].add_grade(grade)
                    print("Nota adicionada.")
                    print("----------------")
                else:
                    print("Indice de aluno inválido.")

            elif choice == 3:
                if not students:
                    print("Nenhum aluno cadastrado.")
                    continue
                for student in students:
                    average_grade = student.get_avarege_grade()
                    if average_grade >= 6.0:
                        status = "Aprovado"
                    else:
                        status = "Reprovado"
                    print(f""" 
                            {student.name}
                            ------------- 
                            - Média: {average_grade} 
                            - Status: {status}""")
            
            elif choice == 4:
                print("Saindo...")
                print("Obrigado por usar o nosso sistema")
                print("Até a próxima")
                break
            else:
                print("Opção inválida. Escolha novamente.")

Student.main()