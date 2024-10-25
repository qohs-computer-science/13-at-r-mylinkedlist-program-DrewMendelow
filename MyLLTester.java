//Drew Mendelow, pd 7, 10/23/24
//Tester file for MyLinkedList class
public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList list = new MyLinkedList();

    System.out.println("List size:" + list.size() + "\n");

    System.out.println("List empty? " + list.isEmpty() + "\n");

    System.out.println("Original list: \n" + list.toString());

    list.add("one");
    System.out.println("Item added. New list: \n" + list.toString());
    list.add("two");
    System.out.println("Item added. New list: \n" + list.toString());
    list.add("three");
    System.out.println("Item added. New list: \n" + list.toString());
    list.add("four");
    System.out.println("Item added. New list: \n" + list.toString());
    list.add("five");
    System.out.println("Item added. New list: \n" + list.toString());
    list.addFirst("six");
    System.out.println("Item added at beginning. New list: \n" + list.toString());
    list.addLast("seven");
    System.out.println("Item added at end. New list: \n" + list.toString());
    list.addFirst("eight");
    System.out.println("Item added at beginning. New list: \n" + list.toString());
    list.addFirst("nine");
    System.out.println("Item added at beginning. New list: \n" + list.toString());
    list.addFirst("ten");
    System.out.println("Item added at beginning. New list: \n" + list.toString());

    System.out.println("List size:" + list.size() + "\n");

    System.out.println("List empty? " + list.isEmpty() + "\n");
    
    list.set(2, "eleven");
    System.out.println("Item changed. New list: \n" + list.toString());

    System.out.println("item 3: " + list.get(2) + "\n");

    list.remove(7);
    System.out.println("Item removed. New list: \n" + list.toString());
    list.removeFirst();
    System.out.println("First item removed. New list: \n" + list.toString());
    list.removeLast();
    System.out.println("Last item removed. New list: \n" + list.toString());

    System.out.println("List size:" + list.size() + "\n");

    System.out.println("List empty? " + list.isEmpty() + "\n");

    list.removeLast();
    System.out.println("Last item removed. New list: \n" + list.toString());
    list.removeLast();
    System.out.println("Last item removed. New list: \n" + list.toString());
    list.removeLast();
    System.out.println("Last item removed. New list: \n" + list.toString());
    list.removeLast();
    System.out.println("Last item removed. New list: \n" + list.toString());
    list.removeLast();
    System.out.println("Last item removed. New list: \n" + list.toString());
    list.removeLast();
    System.out.println("Last item removed. New list: \n" + list.toString());
    list.removeLast();
    System.out.println("Last item removed. New list: \n" + list.toString());
    list.removeLast();
    System.out.println("Last item removed. New list: \n" + list.toString());

    System.out.println("List size:" + list.size() + "\n");

    System.out.println("List empty? " + list.isEmpty() + "\n");
    
    list.add("drew");
    System.out.println("Item added. New list: \n" + list.toString());

    list.set(0, "banana");
    System.out.println("Item changed. New list: \n" + list.toString());

    System.out.println("item 3: " + list.get(0) + "\n");

    System.out.println("List size:" + list.size() + "\n");

    System.out.println("List empty? " + list.isEmpty());
  } // end main
} // end class
