class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None


class DoublyLinkedList:
    def __init__(self):
        self.head = Node(None)
        self.tail = Node(None)
        self.head.next = self.tail
        self.tail.prev = self.head

    def is_empty(self):
        return self.head.next == self.tail

    def search(self, data):
        current = self.head.next
        while current != self.tail:
            if current.data == data:
                return current
            current = current.next
        return None

    def insert(self, data):
        new_node = Node(data)
        last_node = self.tail.prev
        last_node.next = new_node
        new_node.prev = last_node
        new_node.next = self.tail
        self.tail.prev = new_node

    def delete(self, data):
        node_to_delete = self.search(data)
        if node_to_delete is None:
            return
        prev_node = node_to_delete.prev
        next_node = node_to_delete.next
        prev_node.next = next_node
        next_node.prev = prev_node

    def display(self):
        current = self.head.next
        while current != self.tail:
            print(current.data, end=" ")
            current = current.next
        print()

# Criação da lista
doubly_linked_list = DoublyLinkedList()

# Inserção de elementos
doubly_linked_list.insert(3)
doubly_linked_list.insert(5)
doubly_linked_list.insert(9)

# Exibição da lista
doubly_linked_list.display()
# Saída: 3 5 9

# Busca por um elemento existente
node = doubly_linked_list.search(5)
print(node.data)
# Saída: 5

# Busca por um elemento inexistente
node = doubly_linked_list.search(2)
print(node)
# Saída: None

# Exclusão de um elemento existente
doubly_linked_list.delete(5)
doubly_linked_list.display()
# Saída: 3 9

# Exclusão de um elemento inexistente
doubly_linked_list.delete(7)
doubly_linked_list.display()
# Saída: 3 9
