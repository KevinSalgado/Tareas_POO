package org.example;

import java.util.Iterator;

public class MyMarvelCollectionIterator implements Iterator<Film> {
    private int index=0;

    private final Film [] films;
    public MyMarvelCollectionIterator (Film [] films) {
        this.films = films;
    }
    public void indice(){
        this.index++;
    }

    @Override
    public boolean hasNext() {
        if(films[this.index]==null){
            return false;
        }
        else {
            return true;
        }

    }

    @Override
    public Film next() {
        if(!hasNext())
            return null;
        else{
            return films[this.index++];
        }

    }
}
