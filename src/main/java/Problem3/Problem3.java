package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;
import java.sql.SQLOutput;


public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {

        ListNode ptr= list.next;
        if (ptr == null)
            return ;

        ptr =  ptr.next;
        print.println(ptr);



    }
}

