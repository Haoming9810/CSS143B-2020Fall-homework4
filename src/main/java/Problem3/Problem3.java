package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;


public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        ListNode ptr = list.next;
        if(list==null){
            return;
        }
        printListInReverse(ListNode.getNext());
        print.println(ListNode.getData() + " " );
    }
    }
}
