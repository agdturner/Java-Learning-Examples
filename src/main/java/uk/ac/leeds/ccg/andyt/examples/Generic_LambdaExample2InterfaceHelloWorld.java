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

/**
 * Uses the simplest interface Function1 to print "Hello World". 
 * Adapted from http://tutorials.jenkov.com/java/lambda-expressions.html.
 * @author Andy Turner
 */
public class Generic_LambdaExample2InterfaceHelloWorld {

    public static void main(String[] args) {
        Function1 f = () -> {System.out.println("Hello World");};
        f.apply();
    }
}
