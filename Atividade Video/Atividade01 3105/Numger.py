import random

# Classe para representar um nó da lista duplamente encadeada
class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None

# Função para imprimir os números presentes na lista encadeada
def print_list(head):
    current = head
    while current:
        print(current.data, end=" ")
        current = current.next
    print()

# Função para inserir um número em ordem crescente na lista
def insert_in_order(head, num):
    new_node = Node(num)
    if head is None:
        return new_node

    if num < head.data:
        new_node.next = head
        head.prev = new_node
        return new_node

    current = head
    while current.next and current.next.data < num:
        current = current.next

    new_node.prev = current
    new_node.next = current.next
    if current.next:
        current.next.prev = new_node
    current.next = new_node

    return head

# Função para remover os números primos da lista
def remove_primes(head):
    current = head
    while current:
        num = current.data
        is_prime = True
        if num > 1:
            for i in range(2, int(num**0.5) + 1):
                if num % i == 0:
                    is_prime = False
                    break
        else:
            is_prime = False

        if is_prime:
            if current.prev:
                current.prev.next = current.next
            else:
                head = current.next

            if current.next:
                current.next.prev = current.prev

        current = current.next

    return head

# Gerar 1000 números aleatórios entre -9999 e 9999
random_numbers = [random.randint(-9999, 9999) for _ in range(1000)]

# Criar a lista encadeada inserindo os números em ordem crescente
head = None
for num in random_numbers:
    head = insert_in_order(head, num)

# Imprimir a lista em ordem crescente
print("Lista em ordem crescente:")
print_list(head)

# Imprimir a lista em ordem decrescente
print("Lista em ordem decrescente:")
current = head
while current.next:
    current = current.next
tail = current
while tail:
    print(tail.data, end=" ")
    tail = tail.prev
print()

# Remover os números primos da lista
head = remove_primes(head)

# Imprimir a lista novamente após a remoção dos números primos
print("Lista após a remoção dos números primos:")
print_list(head)
