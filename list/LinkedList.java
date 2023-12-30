package list;

public class LinkedList<E> implements Linked<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;

    public LinkedList() {
        firstNode = new Node<E>(null, firstNode, null);
        lastNode = new Node<E>(null, null, lastNode);
    }

    @Override
    public void addLast(E e) {
        Node <E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node <E> (null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node <E> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node <> (null, null, next);
        next.setPrevElement(firstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node <E> target = firstNode;
        if(counter == 1) {
            firstNode.getCurrentElement();
        } else if (counter == size) {
            for (int i = 0; i < counter; i++) {
                target = target.getNextElement();
            }
            target.getCurrentElement();

        } else {
            target.getPrevElement();
        }

        return target.currentElement;
    }

    private Node<E> getNodeByIndex(int index) {
        Node<E> target = firstNode;
        for (int i = 0; i < index; i++) {
            target = target.getNextElement();
        }

        return target;
    }

    @Override
    public void remove(int index) {
        Node<E> target = getNodeByIndex(index);

        Node<E> prev = target.getPrevElement();
        Node<E> next = target.getNextElement();

        if (prev != null) {
            prev.setNextElement(next);
        } else {
            firstNode = next;
        }

        if (next != null) {
            next.setPrevElement(prev);
        } else {
            lastNode = prev;
        }

        size--;
    }

    private class Node<E> {
        private E currentElement; 
        private Node<E> nextElement;
        private Node<E> prevElement;
        private Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }
        public E getCurrentElement() {
            return currentElement;
        }
        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }
        public Node<E> getNextElement() {
            return nextElement;
        }
        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }
        public Node<E> getPrevElement() {
            return prevElement;
        }
        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }
    }

    @Override
    public String toString() {
        String str = "";
        Node <E> n = firstNode;
        while (n != null) {
            str = str + n.getCurrentElement();
        }
        return str;
    }

}
