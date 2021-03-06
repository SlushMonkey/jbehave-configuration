package com.thoughtworks.jbehave_configuration._1_minimum_configuration;

import org.jbehave.core.embedder.Embedder;

import java.util.Arrays;
import java.util.List;

public class SimpleJBehave {

    private static Embedder embedder = new Embedder();
    private static List<String> storyPaths = Arrays
            .asList("com/thoughtworks/jbehave_configuration/SquaringStories.story");

    public static void main(String[] args) {
        embedder.candidateSteps().add(new ExampleSteps());
        embedder.runStoriesAsPaths(storyPaths);
    }
}