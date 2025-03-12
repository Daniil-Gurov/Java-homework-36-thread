package dz3;

import java.util.Comparator;
import java.util.List;

public class Student {

    private String name;
    private List<Book> books;

    public Student(String name, List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return String.format("Студент{имя='%s', книги=%s}", name, books);
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", List.of(
                        new Book("Book 1", 300, 2001),
                        new Book("Book 2", 150, 1999),
                        new Book("Book 3", 200, 2005),
                        new Book("Book 4", 400, 2010),
                        new Book("Book 5", 250, 2003))),
                new Student("Bob", List.of(
                        new Book("Book 6", 100, 2002),
                        new Book("Book 7", 300, 2000),
                        new Book("Book 8", 200, 2015),
                        new Book("Book 9", 350, 2008),
                        new Book("Book 10", 450, 1995))),
                new Student("Max", List.of(
                        new Book("Book 11", 150, 2001),
                        new Book("Book 12", 250, 2004),
                        new Book("Book 13", 200, 2012),
                        new Book("Book 14", 400, 2007),
                        new Book("Book 15", 500, 1993)))
        );

        students.stream()
                .flatMap(student -> student.getBooks().stream())  //получение книг студентов
                .sorted(Comparator.comparingInt(Book::getPages))  //сортировка по страницам
                .distinct()   //удаление дубликатов
                .filter(book -> book.getYear() > 2000) //год больше 2000
                .limit(3)   //ограничение в 3 элемента
                .map(Book::getYear)  //получение годов выпуска
                .findFirst()  //получение первого элемента
                .ifPresentOrElse(  //условие и вывод
                        year -> System.out.println("Год выпуска найденной книги: " + year),
                        () -> System.out.println("Книга отсутствует")
                );

        // Выводим студентов
        students.forEach(System.out::println);
    }
}

