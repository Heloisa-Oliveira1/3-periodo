class Automovel:
    # Metodo construtor
    def __init__(self, modelo, marca, ano, cor):
        self.modelo = modelo
        self.marca = marca
        self.ano = ano
        self.cor = cor
        self.is_running = False
        self.distancia = float(0)

    # Método de apresentação
    def __str__(self):
        return f"""
            O carro é: {fusca.modelo}
            De marca: {fusca.marca}
            Seu ano é: {fusca.ano}
            E sua cor é: {fusca.cor}
            """
    
    def ligar(self):
        if not self.is_running:
            self.is_running = True
            print(f"O {self.modelo} esta ligado!!!")
            print("VRUMMMMMMM.....")
        else:
            print(f"O {self.modelo} já esta ligado, não precisa ligar!!!")
    
    def acelerar(self, velocidade):
        if self.is_running:
            self.distancia += velocidade
            print(f"A velocidade é: {velocidade} km/h")
            print(f"Km usado é: {self.distancia} km")
        else:
            print(f"O {self.modelo} esta desligado, precisa ligar primeiro!!!")
    
    def desligar(self):
        if self.is_running:
            self.is_running = False
            print(f"O {self.modelo} esta desligado!!!")
        else:
            print(f"O {self.modelo} já esta desligado, não precisa desligar!!!")


fusca = Automovel("Fusca", "VW", 1945, "Rosa")

print(fusca)
fusca.desligar()
fusca.ligar()
fusca.acelerar(20)
fusca.acelerar(50)
fusca.acelerar(30)
fusca.acelerar(5)
fusca.desligar()
