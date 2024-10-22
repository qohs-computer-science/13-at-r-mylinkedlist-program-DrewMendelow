public class MyLinkedList
{
    public ListNode head;
    public MyLinkedList(){
        head = null;
    }

    // returns the current # of ListNode elements in the LinkedList
    public int size(){
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }
    
    // returns true if there are no ListNode elements in the LinkedList
    public boolean isEmpty(){
        return head == null;
    }

    // adds a ListNode element to the end of the LinkedList, always returns true.
    public boolean add(Object obj){
        ListNode temp = head;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(new ListNode(obj, null));
        return true;
    }

    // adds a ListNode element to the beginning of the LinkedList
    public boolean addFirst(Object obj){
        if (head == null){
            head = new ListNode(obj, null);
        }
        else{
            head = new ListNode(obj, head);
        }
        return true;
    }

    // adds a ListNode element to the end of the LinkedList
    public boolean addLast(Object obj){
        ListNode temp = head;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(new ListNode(obj, null));
        return true;
    }

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
            }
            count++;
            temp = temp.getNext();
        }
        return old;
    }

    // returns the information stored as the value of the ListNode element at a given position
    public Object get(int i){
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            if (count == i){
                return temp.getValue();
            }
            count++;
            temp = temp.getNext();
        }
        return null;
    }

    // removes the ListNode element at the given position leaving the rest of the LinkedList intact
    public Object remove(int i){
        Object val = new Object();
        if (i == 0){
            val = head.getValue();
            head = head.getNext();
            return val;
        }
        ListNode temp = head.getNext();
        ListNode tempOld = head;
        int count = 1;
        while (temp != null){
            if (count == i){
                val = temp.getValue();
                tempOld.setNext(temp.getNext());
                return val;
            }
            count++;
            temp = temp.getNext();
            tempOld = temp;
        }
        return null;
    }

    // removes the ListNode element at the beginning of the LinkedList and returns the value of the node
    public Object removeFirst(){
        Object val = new Object();
        val = head.getValue();
        head = head.getNext();
        return val;
    }

    // removes the ListNode element at the end of the LinkedList and returns the value of the node
    public Object removeLast(){
        if (head == null){
            return null;
        }
        else if (head.getNext() == null){
            head = null;
            return null;
        }
        else {
            ListNode temp = head;
            Object val = new Object();
            while (temp.getNext().getNext() != null){
                temp = temp.getNext();
            }
            val = temp.getNext().getValue();
            temp.setNext(null);
            return val;
        }
    }

    // returns a String representation of the LinkedList in the following format: 0:Hello
    public String toString(){
        ListNode temp = head;
        int count = 0;
        String result = "";
        while (temp != null){
            result += count + ":" + temp.getValue() + "\n";
            count++;
            temp = temp.getNext();
        }
        return result;
    }
}
