/*
 * Copyright (C) 2018 Andy Turner, University of Leeds..
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package uk.ac.leeds.ccg.andyt.examples;

/**
 * Uses a simplest interface Function2 to print "Hello World" by concatenating
 * String variables one of which is declared outside the lamdba expression.
 * Adapted from http://tutorials.jenkov.com/java/lambda-expressions.html.
 *
 * @author Andy Turner
 */
public class Generic_LambdaExample3InterfaceHelloWorld {

    static String s2 = "Life is Good!";
    
    public static void main(String[] args) {

        //String s1; // This is effectively final so best to declare it final.
        final String s1;
        s1 = "Hello";
        
        Function2 f = (s) -> {
            System.out.println(s1 + " " + s + ": " + s2);
        };

        System.out.println(s2);
        
        f.apply("World");
        
        //s1 = "Can I change this?: No! It will lead to a compilation error.";
        s2 = "I can change this!";
        System.out.println(s2);
    }
}
