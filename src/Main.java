class Main {
    public static void main(String[] args) {
       LinkedList linkedList = new LinkedList();

       linkedList.add("P");
       linkedList.add("A");
       linkedList.add("S");
       linkedList.add("A");
       linkedList.add("A");

       System.out.println( linkedList.toString());

       linkedList.insert("L", 2);

       System.out.println(linkedList.toString());

       linkedList.remove(5);

       System.out.println(linkedList.toString());

       linkedList.swap(4,2);

       System.out.println(linkedList.toString());

       linkedList.remove(2);

       System.out.println(linkedList.toString());

       linkedList.add("A");

       System.out.println(linkedList.toString());

       linkedList.swapTailToHead();

       System.out.println(linkedList.toString());

       linkedList.removeAtSpecificValue("S");

       System.out.println(linkedList.toString());


       linkedList.removeDuplicate();

       System.out.println(linkedList.toString());

       linkedList.add("C");
       linkedList.add("A");
       linkedList.add("S");
       linkedList.add("C");
       linkedList.add("P");

       System.out.println(linkedList.toString());

       linkedList.removeDuplicate();

       System.out.println(linkedList.toString());
    }
}