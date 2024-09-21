class Carro:
    def __init__(self, marca, ano, cor, modelo, placa, marcha):
        self.marca = marca
        self.ano = ano
        self.cor = cor
        self.modelo = modelo
        self.placa = placa
        self.marcha = marcha
        self.roda = 4
        self.is_running = False
        self.velocidade = float(0)
    
    def __str__(self):
        return f"O carro é {self.marca}, O ano é {self.ano}"
    
    def start(self):
        if not self.is_running:
            self.is_running = True
            print("O carro esta ligado!!!")
    
    def stop(self):
        if self.is_running:
            self.is_running = False
            print("O carro está desligado!!!")
        
    def drive(self, v2):
        if self.is_running:
            self.velocidade += v2
            print(f"Dirigindo {self.velocidade} km/h")
        else:
            print("O carro precisa ser ligado para acelarar e dirigir!!!")

    
    

