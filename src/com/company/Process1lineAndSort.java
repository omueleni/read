package com.company;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Process1lineAndSort {

    public static void main(String[] args) throws Exception {
	// write your code here

        String fileLocation = "C:/temp/line3.txt";

        try(Stream<String> stream = Files.lines(Paths.get(fileLocation))){

            List<String[]> fileContent = stream.map(val -> val.split(",")).collect(Collectors.toList());

            List<Integer> sortedContent = Arrays.asList(fileContent.get(0))
                    .stream().mapToInt(val -> Integer.parseInt(val))
                    .sorted()
                    .boxed()
                    .collect(Collectors.toList());

            sortedContent.forEach(System.out::println);

             String reconstruct = sortedContent.stream().map(value -> String.valueOf(value))
                      .collect(Collectors.joining(","));

             System.out.println(reconstruct);

        }

    }
}
