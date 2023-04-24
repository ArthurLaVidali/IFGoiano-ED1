class Pilha:
    def __init__(self):
        self.itens = []

    def vazia(self):
        return len(self.itens) == 0

    def topo(self):
        if not self.vazia():
            return self.itens[-1]

    def empilha(self, elemento):
        self.itens.append(elemento)

    def desempilha(self):
        if not self.vazia():
            return self.itens.pop()

# Solicita a sequência de caracteres
sequencia = input("Digite a sequência de caracteres: ")

# Imprime o texto na ordem inversa
pilha = Pilha()
for caractere in sequencia:
    pilha.empilha(caractere)

print("Texto na ordem inversa:")
while not pilha.vazia():
    print(pilha.desempilha(), end='')
print()

# Verifica se o texto é um palíndromo
pilha = Pilha()
for caractere in sequencia:
    if caractere != ' ' and caractere != '.':
        pilha.empilha(caractere.lower())

palindromo = True
while not pilha.vazia():
    if pilha.desempilha() != sequencia[0].lower():
        palindromo = False
        break

    sequencia = sequencia[1:]

if palindromo:
    print("A sequência é um palíndromo.")
else:
    print("A sequência não é um palíndromo.")
