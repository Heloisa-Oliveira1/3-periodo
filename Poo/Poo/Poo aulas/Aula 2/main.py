from Carro import *

if __name__ == "__main__":
    carro1 = Carro("Chevrolet", 2006, "Preto", "Corsa", "LTD22", "Manual")
    carro2 = Carro("FIAT", 2000, "Branco", "Uno com escada em cima", "ENGSOFT", "Manual")

    print(carro1)

    carro1.start()

    carro1.stop()

    print(carro2)

    carro2.start()

    carro2.drive(35)

    carro2.drive(100)

    carro2.stop()

