package com.problems.codeproblems.addTwoNumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class testRunner {

    @Test
    public void testSolution1() {
        // 2 -> 4 -> 3
        ListNode num1 = new ListNode(2);
        num1.next = new ListNode(4);
        num1.next.next = new ListNode(3);

        // 5 -> 6 -> 4
        ListNode num2 = new ListNode(5);
        num2.next = new ListNode(6);
        num2.next.next = new ListNode(4);

        ListNode result = Solution.addTwoNumbers(num1, num2);
        System.out.println("Testing");
        String resultString = "";
        while (result != null) {
            resultString += result.val;
            result = result.next;
        }

        System.out.println("Result>>" + resultString);
    }

    @Test
    public void testSolution2() {
        // 2 -> 4 -> 3
        ListNode num1 = new ListNode(5);

        // 5 -> 6 -> 4
        ListNode num2 = new ListNode(5);

        ListNode result = Solution.addTwoNumbers(num1, num2);
        System.out.println("Testing");
        String resultString = "";
        while (result != null) {
            resultString += result.val;
            result = result.next;
        }

        System.out.println("Result>>" + resultString);
    }
}