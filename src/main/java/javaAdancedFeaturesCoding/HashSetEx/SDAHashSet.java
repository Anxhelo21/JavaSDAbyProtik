package javaAdancedFeaturesCoding.HashSetEx;

import java.util.HashSet;

public class SDAHashSet <E> implements HashSetInterface{
    private E sentence;
    HashSet<E> hashSetToStore = new HashSet<>();

    @Override
    public void add(Object value) {
        hashSetToStore.add((E) value);
    }

    @Override
    public void remove(Object value) {
        hashSetToStore.remove(value);
    }

    @Override
    public void clear() {
        hashSetToStore.clear();
    }

    @Override
    public Boolean contains(Object value) {
       return hashSetToStore.contains(value);
    }

    @Override
    public Integer size() {
        return hashSetToStore.size();
    }

    @Override
    public void printValues() {
        System.out.println(hashSetToStore);
    }
}
