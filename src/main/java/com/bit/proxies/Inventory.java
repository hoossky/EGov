package com.bit.proxies;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.function.Function;
@Component
public class Inventory<T> {
    private ArrayList<T> inventory;
    // add, get(i), get(list), clear, size, newInventory
    public Inventory(){inventory = new ArrayList<>();}
    public void add(T t){inventory.add(t);}
    public T get(int i){
        Function<Integer, T> f = inventory::get; // f = p -> inventory.get(p)
        return f.apply(i);
    }
    public ArrayList<T> get(){return inventory;}

    public int size(){return inventory.size();}
    public void clear(){inventory.clear();}
    public void newInventory(){inventory = new ArrayList<>();}
}
