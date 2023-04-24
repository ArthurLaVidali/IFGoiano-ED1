class Aviao:
    def __init__(self, nome, numero):
        self.nome = nome
        self.numero = numero

class PistaDecolagem:
    def __init__(self):
        self.fila_espera = []

    def listar_avioes_espera(self):
        if len(self.fila_espera) == 0:
            print("Não há aviões na fila de espera.")
        else:
            print("Aviões na fila de espera:")
            for aviao in self.fila_espera:
                print(f"{aviao.nome} ({aviao.numero})")

    def adicionar_aviao_espera(self):
        nome = input("Digite o nome do avião: ")
        numero = int(input("Digite o número do avião: "))
        aviao = Aviao(nome, numero)
        self.fila_espera.append(aviao)
        print(f"O avião {nome} ({numero}) foi adicionado à fila de espera.")

    def listar_primeiro_aviao(self):
        if len(self.fila_espera) == 0:
            print("Não há aviões na fila de espera.")
        else:
            aviao = self.fila_espera[0]
            print(f"Primeiro avião na fila de espera: {aviao.nome} ({aviao.numero})")

    def listar_numero_avioes_espera(self):
        print(f"Há {len(self.fila_espera)} aviões aguardando na fila de decolagem.")

    def autorizar_decolagem(self):
        if len(self.fila_espera) == 0:
            print("Não há aviões na fila de espera.")
        else:
            aviao = self.fila_espera.pop(0)
            print(f"O avião {aviao.nome} ({aviao.numero}) foi autorizado a decolar.")

pista_decolagem = PistaDecolagem()

while True:
    print("Escolha uma opção:")
    print("1 - Listar número de aviões aguardando na fila")
    print("2 - Autorizar decolagem do primeiro avião da fila")
    print("3 - Adicionar avião à fila de espera")
    print("4 - Listar todos os aviões na fila de espera")
    print("5 - Listar características do primeiro avião da fila")
    print("0 - Sair")

    opcao = int(input())

    if opcao == 0:
        break
    elif opcao == 1:
        pista_decolagem.listar_numero_avioes_espera()
    elif opcao == 2:
        pista_decolagem.autorizar_decolagem()
    elif opcao == 3:
        pista_decolagem.adicionar_aviao_espera()
    elif opcao == 4:
        pista_decolagem.listar_avioes_espera()
    elif opcao == 5:
        pista_decolagem.listar_primeiro_aviao()
    else:
        print("Opção inválida.")
