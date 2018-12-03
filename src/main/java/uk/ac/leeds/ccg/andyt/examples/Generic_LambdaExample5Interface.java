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
 * Uses a simple interface Function3 which returns a String built from a char[].
 * Adapted from http://tutorials.jenkov.com/java/lambda-expressions.html.
 *
 * @author Andy Turner
 */
public class Generic_LambdaExample5Interface {

    public static String doCreate(char[] c) {
        return new String(c);
    }

    public void run() {

        Function3 f = (c) -> {
            return doCreate(c);
        };

        String s;

        s = f.create("Hello World".toCharArray());

        System.out.println(s);
    }

    public static void main(String[] args) {
        new Generic_LambdaExample5Interface().run();
    }
}
