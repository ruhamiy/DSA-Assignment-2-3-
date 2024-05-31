package delAfterPosition;

     class Node {
         int value;
         Node next;

         Node(int value) {
             this.value = value;
             this.next = null;
         }
     }

     class LinkedList {
         Node head;
         public void deleteAfterNode(Node node) {
             if (node != null && node.next != null) {
                 node.next = node.next.next;
             }
         }
         public void append(int value) {
             if (head == null) {
                 head = new Node(value);
             } else {
                 Node current = head;
                 while (current.next != null) {
                     current = current.next;
                 }
                 current.next = new Node(value);
             }
         }
         public void display() {
             Node current = head;
             while (current != null) {
                 System.out.print(current.value + " -> ");
                 current = current.next;
             }
             System.out.println("null");
         }

         public static void main(String[] args) {
             LinkedList list = new LinkedList();
             list.append(1);
             list.append(2);
             list.append(3);
             list.append(4);

             System.out.println("Original list:");
             list.display();

             Node node = list.head.next;
             list.deleteAfterNode(node);

             System.out.println("List after deleting the node after node with given value :");
             list.display();
         }
     }

