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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_StaticIO;

/**
 * A simple example showing the takeWhile operation in action. This will only
 * compile on Java 9 or higher. The takeWhile line may be commented out below.
 * To see it actually working, then uncomment the line in the program as
 * indicated. and the for returning or printing the longest line in a file.
 *
 * @author Andy Turner
 */
public class Generic_StreamExample3Java9TakeWhile {

    /**
     *
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
        f = new File(dir, "test2.txt");
        BufferedReader r;
        r = Generic_StaticIO.getBufferedReader(f);
        String header;
        try {
            header = r.readLine();
            //System.out.println(header);
        } catch (IOException ex) {
            Logger.getLogger(Generic_StreamExample1Filter.class.getName()).log(Level.SEVERE, null, ex);
        }

        /**
         * Example using mapToInt and takeWhile.
         */
        r.lines()
                .mapToInt(i -> Integer.parseInt(i.split(",")[2].trim()))
                //        .takeWhile(i -> i > 2); // Uncomment this line to get the takeWhile example to work.
                .forEach(System.out::println);

    }

}
