package com.company;

public class Main {

    public static void main(String[] args) {

        ZeroArgument zeroArgument = () -> "Hello";
        System.out.println(zeroArgument.test());

        OneArgument<Integer> oneArgument = (t) -> t * t;
        System.out.println(oneArgument.test(2));

        TwoArgument<Integer, Integer> twoArgument = (t, f) -> t > f;
        System.out.println(twoArgument.test(2,4));

    }
}
