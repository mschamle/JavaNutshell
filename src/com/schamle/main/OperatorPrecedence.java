package com.schamle.main;

public class OperatorPrecedence {
    public static void main(String[] args) {
        precedenceAssignment();
        precedenceAssignmentUnary();
    }

    private static void precedenceAssignmentUnary() {
        int a = 2;
        int v = ++a + ++a * ++a;
        System.out.println("\nRtoL precedence for assignment/unary, LtoR for rest {int v = ++a + ++a * ++a} when a = 2");
        System.out.println(String.format("a,v = %d,%d", a,v)); //decimal integer
    }

    private static void precedenceAssignment() {
        int a,b=0,c,d = 10;
        a = b += c = -~d;
        System.out.println("\nRtoL precedence for assignment {a = b += c = -~d} when d = 10 ");
        System.out.println(String.format("a,b,c,d = %d,%d,%d,%d", a,b,c,d)); //decimal integer
        System.out.println(String.format("a=%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("b=%32s", Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println(String.format("c=%32s", Integer.toBinaryString(c)).replace(' ', '0'));
        System.out.println(String.format("d=%32s", Integer.toBinaryString(d)).replace(' ', '0'));
    }

}
