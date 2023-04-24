import random

class Pessoa:
    def __init__(self, nome, telefone, endereco, cpf):
        self.nome = nome
        self.telefone = telefone
        self.endereco = endereco
        self.cpf = cpf

class RodaDePessoas:
    def __init__(self):
        self.pessoas = [Pessoa(f'Pessoa {i+1}', f'Telefone {i+1}', f'Endereço {i+1}', f'CPF {i+1}') for i in range(20)]
        
    def eliminarPessoas(self, m):
        indice_atual = 0
        while len(self.pessoas) > 1:
            indice_remover = (indice_atual + m - 1) % len(self.pessoas)
            self.pessoas.pop(indice_remover)
            indice_atual = indice_remover
        return self.pessoas[0]

roda = RodaDePessoas()
m = random.randint(1, len(roda.pessoas))
pessoa_sobrevivente = roda.eliminarPessoas(m)
print(f"A pessoa sobrevivente é {pessoa_sobrevivente.nome}, com o número {int(pessoa_sobrevivente.nome.split(' ')[1])}")
