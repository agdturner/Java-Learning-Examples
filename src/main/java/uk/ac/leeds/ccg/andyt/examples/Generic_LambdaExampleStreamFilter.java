/*
 * Copyright (C) 2018 geoagdt.
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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_StaticIO;


/**
 *
 * @author geoagdt
 */
public class Generic_LambdaExampleStreamFilter {

    /**
     * A simple example for filtering an input stream.
     * @param args 
     */
    public static void main(String[] args) {

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
                    System.out.println(header);
        } catch (IOException ex) {
            Logger.getLogger(Generic_LambdaExampleStreamFilter.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<String> linesWithIDGT2 = r.lines()
//                .filter(x -> true)
//                .filter(x -> x.split(",").length == 4)
//                .filter(x -> x.split(",")[0].equalsIgnoreCase("2"))
                .filter(x -> new Integer(x.split(",")[0]) > 2)
                .collect(Collectors.toList());
        linesWithIDGT2.forEach(System.out::println);
        
    }
    
}
