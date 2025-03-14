package com.lambdas_and_streams.parallel_streams;

import java.util.stream.IntStream;

public class StreamTimed {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        IntStream.rangeClosed(1,2000000000).reduce(0, Integer::sum); // Parallel  -> 8ms ->
        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime));
    }

}
