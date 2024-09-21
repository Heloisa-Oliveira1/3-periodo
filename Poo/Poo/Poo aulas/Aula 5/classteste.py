class Conta:
    def __init__(self, nome, senha):
        self.nome = nome
        self.__senha = senha

    def __str__(self):
        return f"""
            O nome é: {self.nome}
            e senha é: {self.__senha}
            """

conta1 = Conta("Zé das Coves", "admim")

print(f"""
    O nome é: {conta1.nome}
    e senha é: {conta1.__senha}
    """)