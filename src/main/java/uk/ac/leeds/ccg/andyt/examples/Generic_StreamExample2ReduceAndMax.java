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

import java.io.BufferedReader;
import java.io.File;
import java.util.Comparator;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_StaticIO;

/**
 * A simple example for returning or printing the longest line in a file. For
 * more excellent examples of Stream processing please see Joey James' tutorial
 * and code: https://youtu.be/t1-YZ6bF-g0
 * https://github.com/joeyajames/Java/blob/master/Java%208%20Streams/JavaStreams.java
 *
 * @author Andy Turner
 */
public class Generic_StreamExample2ReduceAndMax {

    /**
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Set up the stream.
         */
        File dir;
        dir = new File(System.getProperty("user.dir"));
        dir = new File(dir, "data");
        dir = new File(dir, "input");
        File f;
        f = new File(dir, "test.txt");
        BufferedReader r;
        /**
         * Example using reduce.
         */
        r = Generic_StaticIO.getBufferedReader(f);
        String longestLine = r.lines()
                .reduce((x, y) -> {
                    if (x.length() > y.length()) {
                        return x;
                    }
                    return y;
                })
                .get();
        System.out.println(longestLine);
        /**
         * Example using max.
         */
        r = Generic_StaticIO.getBufferedReader(f);
        String longestLine2 = r.lines()
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println(longestLine2);

    }

}
