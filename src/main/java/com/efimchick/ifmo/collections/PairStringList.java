package com.efimchick.ifmo.collections;

import java.util.*;

class PairStringList implements List<String>{
    public List<String> list = new ArrayList<>();


    @Override
    public String toString() {
        return String.valueOf(list);
    }
    //Сделал
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < list.size();
            }

            @Override
            public String next() {
                if(currentIndex == list.size()){
                    throw new NoSuchElementException();
                }
                currentIndex++;
                return list.get(currentIndex - 1);
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(String param) {
        for (int i = 0; i < 2; i++) {
               list.add(param);
        }
        return true;
    }

    @Override
    public void add(int index, String param) {
        if(index % 2 != 0){
            for (int i = 0; i < 2; i++) {
                list.add(index + 1, param);
            }
        } else{
            for (int i = 0; i < 2; i++) {
                list.add(index, param);
            }
        }
    }

    @Override
    public boolean remove(Object param) {
        for (int i = 0; i < 2; i++) {
            list.remove(param);
        }
        return false;
    }

    @Override
    public String remove(int index) {
        if(index % 2 != 0){
            for (int i = 0; i < 2; i++, index--) {
                list.remove(index);
            }
        } else{
            for (int i = 0; i < 2; i++) {
                list.remove(index);
            }
        }
        return null;
    }

    @Override
    public String get(int index) {
        return list.get(index);
    }

    @Override
    public String set(int index, String param) {
        if(index % 2 != 0){
            for (int i = 0; i < 2; i++, index--) {
                list.set(index, param);
            }
        } else{
            for (int i = 0; i < 2; i++, index++) {
                list.set(index, param);
            }
        }
        return null;
    }

    @Override
    public boolean addAll(Collection<? extends String> list) {
        for(String l : list){
            add(l);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> list) {
        ArrayList<String> arr = new ArrayList<>(list);
        for (int i = arr.size() - 1; i >= 0 ; i--) {
            add(index, arr.get(i));
        }
        return true;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
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
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

//    public void add(String param){
//        for (int i = 0; i < 2; i++) {
//            list.add(param);
//        }
//    }
//
//    public void add(int index, String param){
//        if(index % 2 != 0){
//            for (int i = 0; i < 2; i++) {
//                list.add(index + 1, param);
//            }
//        } else{
//            for (int i = 0; i < 2; i++) {
//                list.add(index, param);
//            }
//        }
//    }
//
//    public void remove(String param){
//        for (int i = 0; i < 2; i++) {
//            list.remove(param);
//        }
//    }
//
//    public void remove(int index){
//        if(index % 2 != 0){
//            for (int i = 0; i < 2; i++, index--) {
//                list.remove(index);
//            }
//        } else{
//            for (int i = 0; i < 2; i++) {
//                list.remove(index);
//            }
//        }
//    }
//
//    public void get(int index){
//        list.get(index);
//    }
//
//    public void set(int index, String param){
//        if(index % 2 != 0){
//            for (int i = 0; i < 2; i++, index--) {
//                list.set(index, param);
//            }
//        } else{
//            for (int i = 0; i < 2; i++, index++) {
//                list.set(index, param);
//            }
//        }
//    }
//
//    public int size(){
//        return list.size();
//    }
//
//    public void addAll(Collection<? extends String> list){
//        for(String l : list){
//            add(l);
//        }
//    }
//
//    public void addAll(int index, Collection<? extends String> list){
//        ArrayList<String> arr = new ArrayList<>(list);
//        for (int i = arr.size() - 1; i >= 0 ; i--) {
//            add(index, arr.get(i));
//        }
//    }
//
//    public void clear(){
//        list.clear();
//    }
//
//    public void iterator(){
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            iterator.next();
//        }
//    }