package com.schamle.main;

public class BooleanOperators {
    public static void main(String[] args) {
        conditionalAND();
        conditionalOR();
        booleanAND();
        booleanOR();
        booleanXOR();
    }

    private static void booleanXOR() {
        System.out.println("\nBoolean XOR (A ^ B)");
        if (callA() ^ callB()){
            System.out.println("result is true");
        }
        else {
            System.out.println("result is false");
        }
        System.out.println("\nBoolean XOR (C ^ B)");
        if (callC() ^ callB()){
            System.out.println("result is true");
        }
        else {
            System.out.println("result is false");
        }
    }

    private static void booleanOR() {
        System.out.println("\nBoolean OR (A | B)");
        if (callA() | callB()){
            System.out.println("result is true");
        }
        else {
            System.out.println("result is false");
        }
        System.out.println("\nBoolean OR (C | B)");
        if (callC() | callB()){
            System.out.println("result is true");
        }
        else {
            System.out.println("result is false");
        }
    }

    private static void booleanAND() {
        System.out.println("\nBoolean AND (A & B)");
        if (callA() & callB()){
            System.out.println("result is true");
        }
        else {
            System.out.println("result is false");
        }
        System.out.println("\nBoolean AND (C & B)");
        if (callC() & callB()){
            System.out.println("result is true");
        }
        else {
            System.out.println("result is false");
        }
    }

    private static void conditionalOR() {
        System.out.println("\nConditional OR (A || B)");
        if (callA() || callB()){
            System.out.println("result is true");
        }
        else {
            System.out.println("result is false");
        }
        System.out.println("\nConditional OR (C || B)");
        if (callC() || callB()){
            System.out.println("result is true");
        }
        else {
            System.out.println("result is false");
        }
    }

    private static void conditionalAND() {
        System.out.println("\nConditional AND (A && B)");
        if (callA() && callB()){
            System.out.println("result is true");
        }
        else {
            System.out.println("result is false");
        }
        System.out.println("\nConditional AND (C && B)");
        if (callC() && callB()){
            System.out.println("result is true");
        }
        else {
            System.out.println("result is false");
        }
    }

    private static boolean callA() {
        System.out.println("callA with result true");
        return true;
    }

    private static boolean callB() {
        System.out.println("callB with result true");
        return true;
    }

    private static boolean callC() {
        System.out.println("callC with result false");
        return false;
    }

}
