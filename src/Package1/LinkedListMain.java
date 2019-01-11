package Package1;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList2 list1 = new LinkedList2();
       list1.addElement(7);
        list1.addElement(1);
        list1.addElement(4);
        list1.addElement(5);
        list1.addElement(9);

        System.out.println(String.format("Value by index %s is %s", 3 ,list1.get(100)));
        System.out.println("size " + list1.size());

        System.out.println(list1.delete(-100000));
        System.out.println("size " + list1.size());

        System.out.println(String.format("Value by index %s is %s", 3 ,list1.get(3)));
        System.out.println(String.format("Value by index %s is %s", 5 ,list1.get(5)));
        System.out.println("size " + list1.size());




    }

}
