package com.company;

import java.util.Stack;

public class Stackulator {
    public static void Stackulator(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

        String[] expression = args;

        for (String token : expression) { // Read token, push if operator.
            System.out.println(token);
            String s = token;

            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals("^")) ops.push(s);
            else if (s.equals("abs")) ops.push(s);
            else if (s.equals("floor")) ops.push(s);
            else if (s.equals(")")) { // Pop, evaluate, and push result if token is ")".
                String op = ops.pop();
                double v = vals.pop();

                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                else if (op.equals("^")) v = Math.pow(vals.pop(), v);
                else if (op.equals("abs")) v = Math.abs(v);
                else if (op.equals("floor")) v = Math.floor(v);
                vals.push(v);

            } // Token not operator or paren: push double value.
            else vals.push(Double.parseDouble(s));
        }

        System.out.println(vals.pop());
    }

    public static void main(String[] args) {

        //---------------
        //Problem 1
        //---------------

        String[] expression1 = new String[]{"(", "(", "4", "+", "1", ")", "+", "3", ")"};   //test 1
        String[] expression2 = new String[]{"(", "2", "+", "2", ")"};                       //test 2
        String[] expression3 = new String[]{"(", "(", "5", "-", "1", ")", "/", "2", ")"};   //test 3
        Stackulator.Stackulator(expression1);
        Stackulator.Stackulator(expression2);
        Stackulator.Stackulator(expression3);
        String[] expression4 = new String[]{"(", "2", "^", "2", ")"}; // 2^2
        String[] expression5 = new String[]{"(", "sqrt", "4", ")"}; // sqrt4
        String[] expression6 = new String[]{"(", "floor", "5.6", ")"}; // floor2
        Stackulator.Stackulator(expression4);
        Stackulator.main(expression5);
        Stackulator.main(expression6);
        String[] expresion7 = new String[]{"2", "%", "2"}; // % does not work
        Stackulator.main(expresion7);
    }

}