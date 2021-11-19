package com.pb.sydorin.hw5;

public class Library {
//    Класс Library используется как демонстрация работы классов Book и Reader.
//    Имеет метод main() в котором создается массивы объектов Book и Reader, по 3 или более элементов в каждом.
//    Выполняются такие действия:
//    - печатаются все книги.
//    - печатаются все читатели.
//    - демонстрируется работа всех вариантов методов takeBook() и returnBook().

    public static void main(String[] args) {
        Book book1 = new Book("Биография Петра", "Петро И. И.", 2017);
        Book book2 = new Book("Ораньжевая страсть","Сидоров А. Н.", 2015);
        Book book3 = new Book("Шапка и орел","Рахманова О. Ю.", 2010);

        Reader reader1 = new Reader(101, "Смирнов А. А.",  "Экономический", "18/09/1999", "+380671231122");
        Reader reader2 = new Reader(102, "Алексеенко П. Н.",  "Биологический", "03/11/2001", "+380501231155");

        System.out.println(book1.getBookInfo());
        System.out.println(book2.getBookInfo());
        System.out.println(book3.getBookInfo());

        System.out.println(reader1.getReadersInfo());
        System.out.println(reader2.getReadersInfo());

        reader1.takeBook(3);
        reader1.returnBook(2);
        reader1.takeBook(1);

        reader2.takeBook(5);
        reader2.returnBook(2);
        reader2.takeBook(2);

        reader1.takeBook(book1.getBookTitle(), book2.getBookTitle(), book3.getBookTitle());
        reader1.takeBook(book1.getBookTitle(), book2.getBookTitle());
        reader1.takeBook(book1.getBookInfo(), book2.getBookInfo());

        reader2.returnBook(book1.getBookTitle(), book2.getBookTitle(), book3.getBookTitle());
        reader2.returnBook(book1.getBookTitle(), book2.getBookTitle());
        reader2.returnBook(book1.getBookInfo(), book2.getBookInfo());

    }
}
