public class LinkedList {
    private Node head;
    private int length = 0;

    public LinkedList() {
        this.head = null;
    }

    public void add(String value) {
        Node temp = new Node(value);

        if(this.head == null) {
            head = temp;
        } else {
            Node node = head;

            while(node.getNext() != null) {
                node = node.getNext();
            }

            node.setNext(temp);
        }

        length++;
    }

    public void insert(String value, int index) {
        if(index > length || index < 0) {
            throw new IndexOutOfBoundsException("INDEX IS NOT EXIST!");
        }

        if(index == 0) {
            Node temp = head;
            head = new Node(value);
            head.setNext(temp);
            return;
        }

        Node temp = head;
        Node prev = new Node(null);
        while(index - 1 >= 0) {
            prev = temp;
            temp = temp.getNext();
            index--;
        }

        prev.setNext(new Node(value));
        prev.getNext().setNext(temp);
    }

    public void remove(int index) {
        int count = 0;
        Node node = head;
        Node prev = node;

        while (count <= index) {
            if (count == index) {
                prev.setNext(node.getNext());
                node = null;
            } else {
                prev = node;
                node = node.getNext();
            }

            count++;
        }
    }

    public void swap(int indexX, int indexY) {
        Node currPointer, prevPointer;
        int currIndex = 0;

        currPointer = head;
        prevPointer = null;
        while (currPointer != null && currIndex != indexX) {
            prevPointer = currPointer;
            currPointer = currPointer.getNext();

            currIndex++;
        }

        currIndex = 0;
        Node currPointerX = currPointer;
        Node prevPointerX = prevPointer;


        currPointer = head;
        prevPointer = null;
        while (currPointer != null && currIndex != indexY) {
            prevPointer = currPointer;
            currPointer = currPointer.getNext();

            currIndex++;
        }

        currIndex = 0;
        Node currPointerY = currPointer;
        Node prevPointerY = prevPointer;


        Node temp = currPointerY.getNext();
        currPointerY.setNext(currPointerX.getNext());
        currPointerX.setNext(temp);


        if (prevPointerX == null) {
            head = currPointerY;
            prevPointerY.setNext(currPointerX);
        }

        if (prevPointerY == null) {
            currPointerX = head;
            prevPointerX.setNext(prevPointerY);
        }


        if (prevPointerX != null && prevPointerY != null) {
            prevPointerX.setNext(currPointerY);
            prevPointerY.setNext(currPointerX);
        }
    }

    public String toString() {
        String printedText = "{ ";

        Node node = head;

        if(node == null) {
            return printedText + " }";
        }

        while(node.getNext() != null) {
            printedText += String.valueOf(node.getValue()) + " -> ";
            node = node.getNext();
        }

        printedText += String.valueOf(node.getValue());
        return printedText + " } ";
    }

    public void removeAtSpecificValue(String value) {
        Node node = head;
        int index = 0;

        while(node.getNext() != null) {
            if (node.getValue() == value) {
                remove(index);
            }

            index++;
            node = node.getNext();
        }
    }

    public void swapTailToHead() {
        Node node = head;
        int lastIndex = 0;

        if (node == null) return;
    
        while (node.getNext() != null) {
            lastIndex++;
            node = node.getNext();
        }

        swap(0, lastIndex);
    }

    public void removeDuplicate() {
        Node current = head;
        Node index = null;
        Node temp = null;

        if (head == null) return;

        while (current != null) {
            temp = current;
            index = current.getNext();

            while(index != null) {
                if (current.getValue() == index.getValue()) {
                    temp.setNext(index.getNext());
                } else {
                    temp = index;
                }

                index = index.getNext();
            }

            current = current.getNext();
        }

    }

}