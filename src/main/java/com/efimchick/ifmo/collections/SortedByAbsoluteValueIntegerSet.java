package com.efimchick.ifmo.collections;

import java.util.*;

class SortedByAbsoluteValueIntegerSet implements Set<Integer> {
    Set<Integer> set = new HashSet<>();

//    public static void main(String[] args) {
//        SortedByAbsoluteValueIntegerSet arr =new SortedByAbsoluteValueIntegerSet();
//        arr.addAll(Arrays.asList(1, 3, 5, 7, 9));
//        System.out.println(arr);
//        arr.addAll(Arrays.asList(-2, -4, -6, -8, -10));
//        System.out.println(arr);
//
//    }

    @Override
    public String toString() {
        return String.valueOf(set);
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private ArrayList<Integer> arr = new ArrayList<>(set);
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < arr.size();
            }

            @Override
            public Integer next() {
                if(currentIndex == arr.size()){
                    throw new NoSuchElementException();
                }

                currentIndex++;
                return arr.get(currentIndex - 1);
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Integer param) {
        return set.add(param);
    }

    @Override
    public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> set) {
        for(Integer i : set){
            this.set.add(i);
        }
        return true;
    }

    @Override
    public void clear() {
        set.clear();
    }

    @Override
    public boolean removeAll(Collection param) {
        return set.removeAll(param);
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
