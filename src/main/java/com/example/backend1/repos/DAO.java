package com.example.backend1.repos;

import com.example.backend1.model.*;

import java.util.ArrayList;
import java.util.List;


public class DAO {

    public List<Book> getAllBooks(){
        List<Book> result = new ArrayList<>();
        result.add(new Book(1, "Bok A", "FörfA"));
        result.add(new Book(2, "Bok B", "FörfB"));
        result.add(new Book(3, "Bok C", "FörfC"));
        result.add(new Book(4, "Bok D", "FörfD"));
        result.add(new Book(5, "Bok E", "FörfE"));
        result.add(new Book(6, "Bok F", "FörfF"));
        result.add(new Book(7, "Bok G", "FörfG"));
        return result;
    }

    public List<Kompis> getAllKompis(){
        List<Kompis> result = new ArrayList<>();
        result.add(new Kompis(1, "Adam", "Agatan", "070-1111111"));
        result.add(new Kompis(2, "Badam", "Bgatan", "070-1112211"));
        result.add(new Kompis(3, "Cadam", "Cgatan", "070-1113311"));
        result.add(new Kompis(4, "Dadam", "Dgatan", "070-1114411"));
        result.add(new Kompis(5, "Eadam", "Egatan", "070-1115511"));
        result.add(new Kompis(6, "Fadam", "Fgatan", "070-1116611"));
        result.add(new Kompis(7, "Gadam", "Ggatan", "070-1117711"));
        return result;
    }
}
