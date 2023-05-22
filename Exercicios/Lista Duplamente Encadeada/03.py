class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class CircularLinkedList:
    def __init__(self):
        self.head = None

    def is_empty(self):
        return self.head is None

    def count_elements(self):
        if self.is_empty():
            return 0
        count = 1
        current = self.head.next
        while current != self.head:
            count += 1
            current = current.next
        return count

    def insert_at_head(self, data):
        new_node = Node(data)
        if self.is_empty():
            new_node.next = new_node
        else:
            new_node.next = self.head.next
        self.head = new_node

    def concatenate(self, other_list):
        if self.is_empty():
            self.head = other_list.head
        elif not other_list.is_empty():
            current = self.head.next
            while current.next != self.head:
                current = current.next
            current.next = other_list.head.next
            other_list_head = other_list.head
            other_list.head = None
            current.next.next = self.head
            other_list_head.next = other_list_head

    def merge_sorted(self, other_list):
        if self.is_empty():
            return other_list
        elif other_list.is_empty():
            return self

        merged_list = CircularLinkedList()
        current_self = self.head
        current_other = other_list.head

        while True:
            if current_self.data <= current_other.data:
                merged_list.insert_at_head(current_self.data)
                current_self = current_self.next
            else:
                merged_list.insert_at_head(current_other.data)
                current_other = current_other.next

            if current_self == self.head:
                while current_other != other_list.head:
                    merged_list.insert_at_head(current_other.data)
                    current_other = current_other.next
                break
            elif current_other == other_list.head:
                while current_self != self.head:
                    merged_list.insert_at_head(current_self.data)
                    current_self = current_self.next
                break

        return merged_list

    def copy(self):
        if self.is_empty():
            return CircularLinkedList()

        copied_list = CircularLinkedList()
        current = self.head
        while True:
            copied_list.insert_at_head(current.data)
            current = current.next
            if current == self.head:
                break

        return copied_list

# Criação das listas circulares
list1 = CircularLinkedList()
list2 = CircularLinkedList()

# Inserção de elementos na primeira lista
list1.insert_at_head(3)
list1.insert_at_head(5)
list1.insert_at_head(9)

# Contar o número de elementos na primeira lista
count = list1.count_elements()
print(count)
# Saída: 3

# Inserção de um elemento à esquerda da cabeça da primeira lista
list1.insert_at_head(7)

# Concatenar duas listas circulares
list1.concatenate(list2)

# Intercalar duas listas ordenadas
list3 = CircularLinkedList()
list3.insert_at_head(1)
list3.insert_at_head(5)
list3.insert_at_head(9)

list4 = CircularLinkedList()
list4.insert_at_head(2)
list4.insert_at_head(4)
list4.insert_at_head(7)

merged_list = list3.merge_sorted(list4)

# Fazer uma cópia da primeira lista
copied_list = list1.copy()

# Exibição da lista copiada
current = copied_list.head
while True:
    print(current.data, end=" ")
    current = current.next
    if current == copied_list.head:
        break
# Saída: 7 9 5 3

# Exibição da lista intercalada
current = merged_list.head
while True:
    print(current.data, end=" ")
    current = current.next
    if current == merged_list.head:
        break
# Saída: 1 2 4 5 7 9