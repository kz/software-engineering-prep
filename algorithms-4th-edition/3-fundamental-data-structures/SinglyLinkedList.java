class Main {

  public static void main(String[] args) {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    singlyLinkedList.addLast("A");
    singlyLinkedList.addLast("B");
    singlyLinkedList.addLast("C");
    singlyLinkedList.addLast("D");
    System.out.print(singlyLinkedList.removeFirst());
    System.out.print(singlyLinkedList.removeFirst());
  }

}

public class SinglyLinkedList<E> {

  // Inner/nested Node class
  private static class Node<E> {

    private E element;    // Element of this node
    private Node<E> next; // Pointer to next node

    public Node(E e, Node<E> n) {
      element = e;
      next = n;
    }

    public E getElement() {
      return element;
    }

    public void setNext(Node<E> n) {
      next = n;
    }

    public Node<E> getNext() {
      return next;
    }
  }

  private Node<E> head; // Head pointer
  private Node<E> tail; // Tail pointer
  private int size;     // Size of the linked list

  public SinglyLinkedList() {

  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void addFirst(E e) {
    // Point head to current head (even if it is null)
    head = new Node<>(e, head);

    if (isEmpty()) {
      // Tail points to the node if it is the only node
      tail = head;
    }

    size++;
  }

  public void addLast(E e) {
    // Being the last node, its pointer will be null
    Node<E> newest = new Node<>(e, null);

    if (isEmpty()) {
      // If it is the only node, the head will point to this node
      head = newest;
    } else {
      // If it is not, then the previous tail will point to this new node
      tail.setNext(newest);
    }

    // Set the tail to point to this node
    tail = newest;

    size++;
  }

  public E removeFirst() {
    if (isEmpty()) {
      // Can't remove from an empty linked list
      return null;
    }

    // Get the first node's element
    E first = head.getElement();
    // Set the new head
    head = head.getNext();

    size--;
    if (size == 0) {
      // Ensure that the tail is updated if the linked list is now empty
      tail = null;
    }

    return first;
  }
}