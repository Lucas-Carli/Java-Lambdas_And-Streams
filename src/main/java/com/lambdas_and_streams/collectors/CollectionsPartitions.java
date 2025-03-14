package com.lambdas_and_streams.collectors;

import com.lambdas_and_streams.util.Database;
import com.lambdas_and_streams.util.Videogame;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsPartitions {

    public static void main(String[] args) {

        Stream<Videogame> videogames = Database.videogames.stream();

        Map<Boolean, List<Videogame> > result = videogames.collect(Collectors.partitioningBy(
                v -> v.getPrice() > 15
        ));

        result.forEach((k, v) -> System.out.println(k + " - " + v));
    }

}
