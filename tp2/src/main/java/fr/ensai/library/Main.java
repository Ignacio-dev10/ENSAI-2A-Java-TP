package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());

        Library MyLibrary = new Library("MyLibrary");

        MyLibrary.loadBooksFromCSV("books.csv");

        MyLibrary.displayItems();

        Magazine NationalGeographic = new Magazine(
                "0027-9358",
                "National Geographic",
                786,
                2024,
                120);

        Magazine Science = new Magazine(
                "0036-8075",
                "Science",
                6594,
                2024,
                98);

        MyLibrary.addItem(NationalGeographic);
        MyLibrary.addItem(Science);

        MyLibrary.displayItems();

    }
}