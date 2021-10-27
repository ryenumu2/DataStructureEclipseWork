StringBuilder r = new StringBuilder();
        for (String indiv: a) {
            r.append("/");
            r.append(indiv);
        } //way to create a string that will append a character in between words
        

___________________________________________________________________________________

String[] parts = ["", "a",".","b","..","c",""]
        
        Deque<String> a = new LinkedList<>();
        
        for(int i=0; i<parts.length; i++) {
            if (parts[i] == "" || parts[i] == "." || (parts[i] == ".." && a.size() == 0)) 
            {
                i++;
            }
            
            else if (parts[i] == ".." && a.size() >= 1) {
                a.removeFirst();
            }
            else {
                a.addFirst(parts[i]);
            }
        }

Super important: if you need to check if a string in an array is equal to something, DO NOT USE '=='!!
You MUST use .equals("whatever to compare"), instead of == "whatever to compare".

Use 'continue;' in the if statement in for loop body if you don't want to do anything in that if statement:

for(int i=0; i<parts.length; i++) {
            if (parts[i].equals("") || parts[i].equals(".") || (parts[i].equals("..") && a.size() == 0)) {
                //i++; this won't work: will simply skip over every other i value
                continue;
            }
            
_________________________________________________________________________________

for (String dir:b){
            r.append("/");
            r.append(dir);
        }
        
        vs 
        
for (int j=0; j<=b.size(); j++) { 
        //while (b.size() > 0) {
            r.append("/");
            r.append(b.removeFirst());
        }
        
        vs
        
        while (b.size() > 0) {
            r.append("/");
            r.append(b.removeFirst());
        } 
        
        ^^between the three implementations, the first and third will give the correct result. The second on the other hand, will 
        only return everything except the last element 
        
_________________________________________________________________________________
        
why iterating through a newly constructed ArrayList will not work: because the list is empty, and there's nothing to iterate over. size() is 0, and i cannot iterate over null values! (need to populate arraylist first in order to use a for statement)

The ArrayList constructor with an int parameter "constructs an empty list with the specified initial capacity" (docs). That means you've got some space reserved, but the list is still empty, size() will yield 0, and there's nothing to iterate over.

https://stackoverflow.com/questions/68869387/iterating-through-an-arraylist-if-statement-within-for-loop-is-completely-ignor

similarly for isEmpty(): 
if (CirQueue.get(0) == null) {
            return true;
        } //gives IndexOutOfBoundsException: Index 0 out of bounds for length 0: it is
          //simply a list of nulls, and so index 0 doesn't exist since the size is 0
___________________________________________________________________________

for https://leetcode.com/problems/design-circular-queue/solution/: remember that 'ArrayList' is NOT the only way to create
an array. You can also simply do int[] a = new int[k];

https://stackoverflow.com/questions/4842883/are-there-reasons-to-prefer-arrays-over-arraylists
^^highlights the differences between when ArrayList is better over an array: when need a simple random access list and removal and insertion is done very frequently. array, however, is almost always better performance, since no wrappers are needed.

	Elements in primitive arrays can't be empty. They'll always get initialized to something. This differs from ArrayList, which is null
	for primitive arrays, .length is used, NOT .size(), which is for ArrayList!
	
_________________________________________________________________________________

class MyCircularQueue {
    
    int CirQueue[];
    int size;
    int count;
    
    public MyCircularQueue(int k) {
        this.size = k;
        this.count = 0;
        this.CirQueue = new int[k]; 
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        else {
            CirQueue[this.count] = value;
            this.count++;
        }
        return true;
    }
    
    public boolean deQueue() {
        //int counter = 0;
        if (isEmpty()) {
            return false;
        }

        CirQueue[0] = 0;
        
        for (int s: CirQueue) {
            while (s+1 < this.count) {
            CirQueue[s] = CirQueue[s+1];
            }
            //count++;
        }
        this.count--;
        return true; 
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        else return CirQueue[0];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        
        return CirQueue[this.count-1];

    }
    
    public boolean isEmpty() {
        
        if (this.count==0) {
            return true;
        }
        return false;

        /*
        if (CirQueue.get(0) == null) {
            return true;
        } //gives IndexOutOfBoundsException: Index 0 out of bounds for length 0: it is
          //simply a list of nulls, and so index 0 doesn't exist since the size is 0
        */
    }
    
    public boolean isFull() {
        if (this.count == this.size) {
            return true;
        }
        return false;
    }
    
    ^^the Time Limit Exception error occurred in while loop for Deque: should be https://leetcode.com/problems/design-circular-queue/submissions/
    
}


/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

For Time limit exceeded problem: https://leetcode.com/problems/design-circular-queue/

There are missing some details. Which IDE are you using for debugging? Does the IDE throw this error or your application? Maybe also include the code that calls the constructor. The constructor itself looks fine and can't be the issue.



