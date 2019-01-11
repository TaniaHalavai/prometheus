package Package1;

public class LinkedList2 {
    private Node first;
    private Node last;

    public LinkedList2() {
first=null;
last=null;
    }

    public void addElement(Integer data) {
        Node newone = new Node();
        newone.setData(data);
        if (first == null) {
            first = newone;

        } else {
            last.setNext(newone);
        }
        last = newone;

    }

    public Integer get(int index) {

        Node node = first;
        int i = 0;
        if (index < 0) {
            return null;
        }

        while (i < index && node != null) {
            node = node.getNext();
            i++;

        }
        if(node == null) {return null;}

        if (i == index) {
            return
                    node.getData();
        } else return null;



    }

    public boolean delete(int index) {
        if (index < 0) return false;
        if (index == 0) {
            if (first == null) return false;
            else {
                first = first.getNext();
                return true;
            }

        } else {
            int i = 0;
            Node node = first;

            while (i < index - 1 && node != null) {
                i++;
                node = node.getNext();
            }


            if (node != null && node.getNext() != null) {
                if (node.getNext() == last) {
                    node.setNext(null);
                    last = node;
                } else {
                    node.setNext(node.getNext().getNext());
                }
                return true;

            } else return false;
        }
    }
        public int size() {
             int size = 0;

            Node node = this.first;
            while (node != null) {
                size++;
                node = node.getNext();
            }
            return size;
        }
    }

