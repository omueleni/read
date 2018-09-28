package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ProcessMultipleLine {

    public static void pln(String line){
        System.out.println(line);
    }

    public static void main (String[] args)  {

        String fileLocation = "C://temp/lines.txt";

        try(Stream<String> stream = Files.lines(Paths.get(fileLocation))){

            stream.forEach(ProcessMultipleLine::pln);

        }catch (IOException ex){

        }

    }
}
