
//Definition for singly-linked list.
public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list;

        int count1 = 0;// Initialize count l1
        int count2 = 0; // initialize count l2

        ListNode l1copy = l1;
        ListNode l2copy = l2;

        // counting the length of each list
        do {
            count1++;
            l1 = l1.next;
        } while (l1.next != null);
        System.out.println("length of array1 is " + (count1+1));

        do {
            count2++;
            l2 = l2.next;
        } while (l2.next != null);
        count1 += 1;
        count2 += 1;


        // now add the lists together by a for loop
        if (count1 >= count2) {
            for (int i = 0; i < ) {}
        } else if (count2 > count1) {
            for (int i = 0; i < ) {}
        }

        return l1;
    }
}
