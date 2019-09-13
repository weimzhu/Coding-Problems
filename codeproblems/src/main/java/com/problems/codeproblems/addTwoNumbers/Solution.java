package com.problems.codeproblems.addTwoNumbers;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return recurseNode(l1, l2, 0);
    }

    private static ListNode recurseNode(ListNode l1, ListNode l2, int carryOver) {
        if (l1 == null && l2 == null) {
            if (carryOver > 0) {
                return new ListNode(carryOver);
            }
            else {
                return null;
            }
        }
        else {
            int num1;
            int num2;

            if (l1 == null) {
                num1 = 0;
            }
            else {
                num1 = l1.val;
            }
            if (l2 == null) {
                num2 = 0;
            }
            else {
                num2 = l2.val;
            }
            ListNode result = new ListNode(0);
            int sum = num1 + num2 + carryOver;

            if (sum >= 10) {
                int remainder = sum % 10;
                carryOver = (sum - remainder) / 10;
                result.val = remainder;
            }
            else {
                result.val = sum;
                carryOver = 0;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            result.next = recurseNode(l1, l2, carryOver);
            return result;
        }
    }
    // public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //     ListNode result = new ListNode(0);
    //     ListNode next = result;

    //     int sum = 0;
    //     int carryOver = 0;
    //     while (l1 != null || l2 != null) {
    //         int num1;
    //         int num2;

    //         if (l1 == null) {
    //             num1 = 0;
    //         }
    //         else {
    //             num1 = l1.val;
    //         }
    //         if (l2 == null) {
    //             num2 = 0;
    //         }
    //         else {
    //             num2 = l2.val;
    //         }

    //         sum = num1 + num2 + carryOver;
    //         if (sum >= 10) {
    //             int remainder = sum % 10;
    //             carryOver = (sum - remainder) / 10;
    //             next.val = remainder;
    //         }
    //         else {
    //             next.val = sum;
    //         }

    //         if (l1 != null) {
    //             l1 = l1.next;
    //         } 
    //         if (l2 != null) {
    //             l2 = l2.next;
    //         }

    //         if (l1 != null || l2 != null) {
    //             next.next = new ListNode(0);
    //         }
            
    //         next = next.next;
    //     }

    //     return result;
    // }
}