package com.company;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

       // Предположим, дан список поступивших в библиотеку книг. Если пришло несколько экземпляров одной и той же книг,
        // в списке присутствует соответствующее количество одинаковых записей. Необходимо сформировать Map<Book, Integer>,
        // где ключ это книга, значение, сколько раз она встречается в списке, т.е. сколько пришло экземпляров.


        Author a1 = new Author("Avtor","11");
        Author a2 = new Author("Avtor","22");
        Author a3 = new Author("Avtor","33");
        Author a4 = new Author("Avtor","44");
        Author a5 = new Author("Avtor","55");

        ArrayList<Author> AllAuthors = new ArrayList<>();
        AllAuthors.add(a1);
        AllAuthors.add(a2);
        AllAuthors.add(a3);
        AllAuthors.add(a4);
        AllAuthors.add(a5);

        ArrayList<Author> GroupAuthor2 = new ArrayList<>();
        GroupAuthor2.add(a1);
        GroupAuthor2.add(a2);

        ArrayList<Author> GroupAuthor3 = new ArrayList<>();
        GroupAuthor3.add(a1);
        GroupAuthor3.add(a3);

        ArrayList<Author> GroupAuthor4 = new ArrayList<>();
        GroupAuthor4.add(a1);
        GroupAuthor4.add(a4);

        ArrayList<Author> GroupAuthor5 = new ArrayList<>();
        GroupAuthor5.add(a1);
        GroupAuthor5.add(a5);

        ArrayList<Author> GroupAuthor6 = new ArrayList<>();
        GroupAuthor6.add(a5);


        ArrayList<Book> SpBook = new ArrayList<>();
        Book b1 = new Book("Произведение1",AllAuthors,"10001");
        Book b2 = new Book("Произведение2",GroupAuthor2,"10002");
        Book b3 = new Book("Произведение3",GroupAuthor3,"10003");
        Book b4 = new Book("Произведение4",GroupAuthor4,"10004");
        Book b5 = new Book("Произведение5",GroupAuthor5,"10005");
        Book b6 = new Book("Произведение6",GroupAuthor6,"10006");
        Book b7 = new Book("Произведение7",GroupAuthor6,"10007");


        SpBook.add(b1);
        SpBook.add(b2);
        SpBook.add(b3);
        SpBook.add(b4);
        SpBook.add(b5);
        SpBook.add(b6);
        SpBook.add(b7);
        SpBook.add(b2);
        SpBook.add(b2);
        SpBook.add(b3);
        SpBook.add(b2);
        SpBook.add(b6);



        Map<Book, Integer> map = new HashMap<>();

        for (Book bb: SpBook) {
            //if not find book
            if (map.get(bb)==null) {
                map.put(bb,1);
            }
            else {
               int newint = map.get(bb) + 1;
                map.put(bb,newint);
            }
        }

        //print
        Set<Map.Entry<Book, Integer>> element = map.entrySet();
        for(Map.Entry<Book, Integer> pair: element)  {
            System.out.println( pair.getKey() + ", количество экземпляров " + pair.getValue());
        }
    }
}
