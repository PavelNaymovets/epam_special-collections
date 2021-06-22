package com.efimchick.ifmo.collections;

import java.sql.SQLOutput;
import java.util.*;

class PairStringList  {
    public List<String> list = new ArrayList<>();

    public void add(String param){
        for (int i = 0; i < 2; i++) {
            list.add(param);
        }
    }

    public void add(int index, String param){
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

    public void remove(String param){
        for (int i = 0; i < 2; i++) {
            list.remove(param);
        }
    }

    public void remove(int index){
        if(index % 2 != 0){
            for (int i = 0; i < 2; i++, index--) {
                list.remove(index);
            }
        } else{
            for (int i = 0; i < 2; i++) {
                list.remove(index);
            }
        }
    }

    public void get(int index){
        list.get(index);
    }

    public void set(int index, String param){
        if(index % 2 != 0){
            for (int i = 0; i < 2; i++, index--) {
                list.set(index, param);
            }
        } else{
            for (int i = 0; i < 2; i++, index++) {
                list.set(index, param);
            }
        }
    }

    public int size(){
        return list.size();
    }

    public void addAll(Collection<? extends String> list){
        for(String l : list){
            add(l);
        }
    }

    public void addAll(int index, Collection<? extends String> list){
        ArrayList<String> arr = new ArrayList<>(list);
        for (int i = arr.size() - 1; i >= 0 ; i--) {
            add(index, arr.get(i));
        }
    }

    public void clear(){
        list.clear();
    }

    public void iterator(){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            iterator.next();
        }
    }

    @Override
    public String toString() {
        return String.valueOf(list);
    }
}
