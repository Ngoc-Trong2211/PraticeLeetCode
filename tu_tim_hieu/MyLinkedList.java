package tu_tim_hieu;

public class MyLinkedList {

    public static class Node{
        int value;
        Node next;
        Node (int val){
            this.value = val;
        }
    }

    public static void printLinkeList(Node head){
        if (head == null){
            System.out.println("List is empty!");
        }
        else {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.value);
                tmp = tmp.next;
            }
        }
    }

    public static Node addToHead(Node headNode, int val){
        Node newNode = new Node(val);
        if (headNode != null){
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToLast(Node headNode, int val){
        Node newNode = new Node(val);
        if (headNode != null){
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            return headNode;
        }
        return newNode;
    }

    public static Node addToIndex(Node headNode, int val, int index){
        Node newNode = new Node(val);
        if (index == 0) return addToHead(headNode, val);
        else {
            if (headNode != null){
                Node currNode = headNode;
                int count = 0;
                while(currNode != null){
                    count++;
                    if (count == index){
                        newNode.next = currNode.next;
                        currNode.next = newNode;
                        break;
                    }
                    currNode = currNode.next;
                }

            }
        }
        return headNode;
    }

    public static Node removeHead(Node headNode){
        if (headNode != null){
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeLast(Node headNode){
        if (headNode != null){
            Node lastNode = headNode;
            while (lastNode.next.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = null;
            return headNode;
        }
        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int index){
        if (headNode == null || index < 0) return null;
        if (index == 0) return removeHead(headNode);
        
        Node currNode = headNode;
        Node previousNode = null;
        int count = 0;
        while (currNode != null) {
            if (count == index){
                currNode = currNode.next;
                previousNode.next = currNode;
                break;
            }
            previousNode = currNode;
            currNode = currNode.next;
            count++;
        }

        return headNode;
    }
    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        // printLinkeList(n1);
        // printLinkeList(n2);
        // printLinkeList(n3);

        // Node n4 = addToHead(n1, 0);
        // printLinkeList(n4);

        // Node n5 = addToLast(n1, 5);
        // printLinkeList(n5);

        // Node n6 = addToIndex(n1, 5, 2);
        // printLinkeList(n6);

        // Node n7 = removeHead(n1);
        // printLinkeList(n7);

        // Node n8 = removeLast(n1);
        // printLinkeList(n8);

        Node n9 = removeAtIndex(n1, 1);
        printLinkeList(n9);
    }
}
