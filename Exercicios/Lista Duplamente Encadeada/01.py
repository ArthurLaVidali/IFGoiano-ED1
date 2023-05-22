class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None


class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def is_empty(self):
        return self.head is None

    def append(self, data):
        new_node = Node(data)
        if self.is_empty():
            self.head = new_node
            self.tail = new_node
        else:
            new_node.prev = self.tail
            self.tail.next = new_node
            self.tail = new_node

    def prepend(self, data):
        new_node = Node(data)
        if self.is_empty():
            self.head = new_node
            self.tail = new_node
        else:
            new_node.next = self.head
            self.head.prev = new_node
            self.head = new_node

    def concatenate(self, other_list):
        if other_list.is_empty():
            return
        if self.is_empty():
            self.head = other_list.head
            self.tail = other_list.tail
        else:
            self.tail.next = other_list.head
            other_list.head.prev = self.tail
            self.tail = other_list.tail

    def split(self):
        if self.is_empty() or self.head == self.tail:
            return self, None
        slow_ptr = self.head
        fast_ptr = self.head
        while fast_ptr.next is not None and fast_ptr.next.next is not None:
            slow_ptr = slow_ptr.next
            fast_ptr = fast_ptr.next.next

        second_list = DoublyLinkedList()
        second_list.head = slow_ptr.next
        second_list.head.prev = None
        second_list.tail = self.tail
        self.tail = slow_ptr
        slow_ptr.next = None

        return self, second_list

    def merge_sorted(self, other_list):
        if other_list.is_empty():
            return

        merged_list = DoublyLinkedList()
        current_self = self.head
        current_other = other_list.head

        while current_self is not None and current_other is not None:
            if current_self.data <= current_other.data:
                merged_list.append(current_self.data)
                current_self = current_self.next
            else:
                merged_list.append(current_other.data)
                current_other = current_other.next

        while current_self is not None:
            merged_list.append(current_self.data)
            current_self = current_self.next

        while current_other is not None:
            merged_list.append(current_other.data)
            current_other = current_other.next

        return merged_list


# Criação das listas
list1 = DoublyLinkedList()
list2 = DoublyLinkedList()

# Preenchimento das listas
list1.append(3)
list1.append(5)
list1.append(9)

list2.append(2)
list2.append(4)
list2.append(7)

# Concatenar duas listas
list1.concatenate(list2)

# Exibir a lista concatenada
current = list1.head
while current is not None:
    print(current.data, end=" ")
    current = current.next
# Saída: 3 5 9 2 4 7

# Separar a lista em duas novas listas
split_list1, split_list2 = list1.split()

# Exibir a primeira lista resultante da separação
current = split_list1.head
while current is not None:
    print(current.data, end=" ")
    current = current.next
# Saída: 3 5 9

# Exibir a segunda lista resultante da separação
current = split_list2.head
while current is not None:
    print(current.data, end=" ")
    current = current.next
# Saída: 2 4 7

# Criar listas ordenadas para intercalar
list3 = DoublyLinkedList()
list3.append(1)
list3.append(4)
list3.append(6)

list4 = DoublyLinkedList()
list4.append(2)
list4.append(3)
list4.append(5)

# Intercalar duas listas ordenadas em uma lista ordenada
merged_list = list3.merge_sorted(list4)

# Exibir a lista ordenada resultante da intercalação
current = merged_list.head
while current is not None:
    print(current.data, end=" ")
    current = current.next
# Saída: 1 2 3 4 5 6
