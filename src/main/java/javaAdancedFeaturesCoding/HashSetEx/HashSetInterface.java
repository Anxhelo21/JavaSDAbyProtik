package javaAdancedFeaturesCoding.HashSetEx;

import java.util.HashSet;

public interface HashSetInterface <E> {

    void add(E word);
    void remove(E value );
    void clear();
    Boolean contains(E value);
    Integer size();
    void printValues();
}