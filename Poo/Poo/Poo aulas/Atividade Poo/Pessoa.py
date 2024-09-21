class Pessoa:
    def __init__(self, origem, idade, genero, cor, profissão):
        self.origem = origem
        self.idade = idade
        self.genero = genero
        self.cor = cor
        self.profissão = profissão

    def __str__(self):
        return f"""
                Pessoa é do {self.origem}, 
                tem a idade {self.idade}, 
                seu gênero é {self.genero},
                sua cor é {self.cor},
                sua profissão é {self.profissão}
                """
