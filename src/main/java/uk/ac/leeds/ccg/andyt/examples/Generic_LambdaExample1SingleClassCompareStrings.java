/*
 * Copyright (C) 2018 Andy Turner, University of Leeds.
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

import java.util.Comparator;

/**
 * Using a String comparison example, this shows both the non-lambda expression
 * way and lambda expression way of achieving the same thing. Adapted from
 * http://tutorials.jenkov.com/java/lambda-expressions.html.
 *
 * @author Andy Turner
 */
public class Generic_LambdaExample1SingleClassCompareStrings {

    public static void main(String[] args) {

        /**
         * 1. A non lambda expression example.
         */
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String t, String t1) {
                return t.compareTo(t1);
            }
        };
        int compareValue = stringComparator.compare("hello", "world");
        System.out.println(compareValue);
        /**
         * 2. A lambda expression equivalent of 1.
         */
        Comparator<String> stringComparator2 = (String t, String t1) -> t.compareTo(t1);
        int compareValue2 = stringComparator2.compare("hello", "world");
        System.out.println(compareValue2);
        /**
         * 3. A simplified lambda equivalent of 2. Note that the types of t and
         * t1 are inferred.
         */
        Comparator<String> stringComparator3 = (t, t1) -> t.compareTo(t1);
        int compareValue3 = stringComparator3.compare("hello", "world");
        System.out.println(compareValue3);

    }
}
