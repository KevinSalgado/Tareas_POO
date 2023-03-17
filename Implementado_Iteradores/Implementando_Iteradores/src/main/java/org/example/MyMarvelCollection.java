package org.example;

import java.util.Iterator;



public class MyMarvelCollection implements Iterable<Film> {
    private Film [] films;
    public MyMarvelCollection (Film [] films) {
        this.films = films;
    }

    public void add (Film film) {
        for (int i = 0; i < films.length; i++) {
            if (films [i] == null) {
                films [i] = film;
                break;
            }
        }
    }

    public Film get (int index) {
        return films [index];
    }

    @Override
    public Iterator<Film> iterator () {
        return new MyMarvelCollectionIterator (films);

    }
}

