from collections import deque
import random

class Pessoa:
    def __init__(self, ID, sexo, idade, gestante, lactante, necessidade_especial, prioridade):
        self.ID = ID
        self.sexo = sexo
        self.idade = idade
        self.gestante = gestante
        self.lactante = lactante
        self.necessidade_especial = necessidade_especial
        self.prioridade = prioridade

# Função para criar uma pessoa com dados aleatórios
def criar_pessoa(ID):
    sexo = random.choice(['M', 'F'])
    idade = random.randint(18, 100)
    gestante = random.choice(['s', 'n'])
    lactante = random.choice(['s', 'n'])
    necessidade_especial = random.choice(['s', 'n'])
    
    # Definir a prioridade com base nos atributos da pessoa
    prioridade = 0
    
    if gestante == 's' or lactante == 's':
        prioridade = 3
    elif necessidade_especial == 's':
        prioridade = 2
    elif idade >= 60:
        prioridade = 1
    
    return Pessoa(ID, sexo, idade, gestante, lactante, necessidade_especial, prioridade)

fila_atendimento = deque()

# Criar grupos de 10 pessoas
for i in range(10):
    grupo = []
    for j in range(i + 1):
        pessoa = criar_pessoa(i * 10 + j + 1)
        grupo.append(pessoa)
    
    # Ordenar o grupo de acordo com a prioridade (3, 2, 1, 0)
    grupo.sort(key=lambda pessoa: (pessoa.prioridade, -pessoa.ID), reverse=True)
    
    # Adicionar as pessoas do grupo à fila de atendimento
    fila_atendimento.extend(grupo)

# Atender as 100 primeiras pessoas da fila
pessoas_atendidas = []
for _ in range(100):
    if fila_atendimento:
        pessoa = fila_atendimento.popleft()
        pessoas_atendidas.append(pessoa)

# Imprimir os atendimentos realizados
for pessoa in pessoas_atendidas:
    print(f"ID: {pessoa.ID}, Sexo: {pessoa.sexo}, Idade: {pessoa.idade}, Gestante: {pessoa.gestante}, Lactante: {pessoa.lactante}, Necessidade Especial: {pessoa.necessidade_especial}, Prioridade: {pessoa.prioridade}")

# Imprimir as pessoas que não foram atendidas
pessoas_nao_atendidas = list(fila_atendimento)

for pessoa in pessoas_nao_atendidas:
    print(f"ID: {pessoa.ID}, Sexo: {pessoa.sexo}, Idade: {pessoa.idade}, Gestante: {pessoa.gestante}, Lactante: {pessoa.lactante}, Necessidade Especial: {pessoa.necessidade_especial}, Prioridade: {pessoa.prioridade}")
