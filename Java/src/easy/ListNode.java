package easy;

//Definition for singly-linked list.
public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class ListNodeTasks {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        int count1 = 0;// Initialize count l1
        int count2 = 0; // initialize count l2

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
//            for (int i = 0; i < ) {}
        } else if (count2 > count1) {
//            for (int i = 0; i < ) {}
        }

        return l1;
    }

    /*
    You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

    Return the head of the merged linked list.  
    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]
    Example 2:

    Input: list1 = [], list2 = []
    Output: []
    Example 3:

    Input: list1 = [], list2 = [0]
    Output: [0]
    Runtime: 1 ms, faster than 81.17% of Java online submissions for Merge Two Sorted Lists.
    Memory Usage: 42.9 MB, less than 59.52% of Java online submissions for Merge Two Sorted Lists.
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode merged = new ListNode();
        ListNode head = merged;
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                merged.next = list1;
                merged = merged.next;
                list1 = list1.next;
            } else {
                merged.next = list2;
                merged = merged.next;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            merged.next = list1;
            merged = merged.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            merged.next = list2;
            merged = merged.next;
            list2 = list2.next;
        }
        
        return head.next;
    }
}
