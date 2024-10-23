//Drew Mendelow, pd 7, 10/23/24
//MyLinkedList class with methods to add remove and change items 
public class MyLinkedList
{
    public ListNode head;
    public MyLinkedList(){
        head = null;
    }//end MyLinkedList

    // returns the current # of ListNode elements in the LinkedList
    public int size(){
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.getNext();
        }//end while
        return count;
    }//end size
    
    // returns true if there are no ListNode elements in the LinkedList
    public boolean isEmpty(){
        return head == null;
    }//end isEmpty

    // adds a ListNode element to the end of the LinkedList, always returns true.
    public boolean add(Object obj){
        if (head == null){
            head = new ListNode(obj, null);
        }//end if
        else{
            ListNode temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }//end while
            temp.setNext(new ListNode(obj, null));
        }//end else
        return true;
    }//end add

    // adds a ListNode element to the beginning of the LinkedList
    public boolean addFirst(Object obj){
        if (head == null){
            head = new ListNode(obj, null);
        }//end if
        else{
            head = new ListNode(obj, head);
        }//end else
        return true;
    }//end addFirst

    // adds a ListNode element to the end of the LinkedList
    public boolean addLast(Object obj){
        ListNode temp = head;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }//end while
        temp.setNext(new ListNode(obj, null));
        return true;
    }//end addLast

    // changes the information stored as the value of the ListNode element at the given position
    public Object set(int i, Object obj){
        ListNode temp = head;
        int count = 0;
        Object old = new Object();
        while (temp != null){
            if (count == i){
                old = temp.getValue();
                temp.setValue(obj);
                break;
            }//end if
            count++;
            temp = temp.getNext();
        }//end while
        return old;
    }//end set

    // returns the information stored as the value of the ListNode element at a given position
    public Object get(int i){
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            if (count == i){
                return temp.getValue();
            }//end if
            count++;
            temp = temp.getNext();
        }//end while
        return null;
    }//end get

    // removes the ListNode element at the given position leaving the rest of the LinkedList intact
    public Object remove(int i){
        if (i > size() - 1){
            return null;
        }//end if
        Object val = new Object();
        if (i == 0){
            val = head.getValue();
            head = head.getNext();
            return val;
        }//end if
        ListNode temp = head.getNext();
        ListNode tempOld = head;
        int count = 1;
        while (temp != null){
            if (count == i){
                val = temp.getValue();
                tempOld.setNext(temp.getNext());
                return val;
            }//end if
            count++;
            tempOld = temp;
            temp = temp.getNext();
        }//end while
        return null;
    }//end remove

    // removes the ListNode element at the beginning of the LinkedList and returns the value of the node
    public Object removeFirst(){
        Object val = new Object();
        val = head.getValue();
        head = head.getNext();
        return val;
    }//end removeFirst

    // removes the ListNode element at the end of the LinkedList and returns the value of the node
    public Object removeLast(){
        if (head == null){
            return null;
        }//end if
        else if (head.getNext() == null){
            head = null;
            return null;
        }//end else if
        else {
            ListNode temp = head;
            Object val = new Object();
            while (temp.getNext().getNext() != null){
                temp = temp.getNext();
            }
            val = temp.getNext().getValue();
            temp.setNext(null);
            return val;
        }//end else
    }//end removeLast

    // returns a String representation of the LinkedList in the following format: 0:Hello
    public String toString(){
        ListNode temp = head;
        int count = 0;
        String result = "";
        while (temp != null){
            result += count + ":" + temp.getValue() + "\n";
            count++;
            temp = temp.getNext();
        }//end while
        return result;
    }//end toString
}//end MyLinkedList
