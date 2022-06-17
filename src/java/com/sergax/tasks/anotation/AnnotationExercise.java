package com.sergax.tasks.anotation;

import java.util.Arrays;

/**
 * @author : sergax
 * @date : 17.06.22
 */

@Exercise("hello")
public class AnnotationExercise {
    //todo : mark class with annotation
    public static void main(String[] args) {
        var an = AnnotationExercise.class.getAnnotations();
        System.out.println(Arrays.toString(an));
    }
}
