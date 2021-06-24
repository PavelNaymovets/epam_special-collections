package com.efimchick.ifmo.collections;

import java.util.*;

class MedianQueue implements Queue<Integer> {
    Queue<Integer> queue = new LinkedList<Integer>();

    public static void main(String[] args) {
        MedianQueue medianQueue = new MedianQueue();
        medianQueue.addAll(Arrays.asList(0, 8, 3, 9, 4, 6, 2, 1, 7, 5));
        System.out.println(medianQueue.poll());
        System.out.println(medianQueue);
    }

    @Override
    public String toString() {
        return String.valueOf(queue);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.size() == 0;
    }

    @Override
    public boolean contains(Object param) {
        return queue.contains(param);
    }

    @Override
    public Iterator iterator() {
        return new Iterator<Integer>() {
            private ArrayList<Integer> arr = new ArrayList<>(queue);
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
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Integer param) {
        return queue.add(param);
    }

    @Override
    public boolean remove(Object param) {
        return queue.remove(param);
    }

    @Override
    public boolean addAll(Collection param) {
        return queue.addAll(param);
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean offer(Integer param) {
        return queue.offer(param);
    }

    @Override
    public Integer remove() {
        return null;
    }

    @Override
    public Integer poll() {
        int paramPool = peek();
        queue.remove(paramPool);
        return paramPool;
    }

    @Override
    public Integer element() {
        return null;
    }

    @Override
    public Integer peek() {
        List<Integer> list = new ArrayList<>();
        list.addAll(queue);
        Collections.sort(list);
        int paramPeek = list.get((list.size() - 1 )/2);
        return paramPeek;
    }
}
