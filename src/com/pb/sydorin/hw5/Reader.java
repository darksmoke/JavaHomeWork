package com.pb.sydorin.hw5;


public class Reader {


//        - takeBook, который будет принимать переменное количество объектов класса Book.
//    Выводит на консоль сообщение
//"Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
//
//    Аналогичным образом перегрузить метод returnBook().
//    Должно быть 3 метода returnBook() которые выводит на консоль сообщения:
//            - "Петров В. В. вернул 3 книги"
//            - "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
//            - "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".

    private int numberTicket;
    private int countBook;
    private String fio;
    private String faculty;
    private String dateBirthday;
    private String phone;
    private String bookTitle;
    private String books;

    public Reader(int numberTicket, String fio, String faculty, String dateBirthday, String phone) {
        this.numberTicket = numberTicket;
        this.fio = fio;
        this.faculty = faculty;
        this.dateBirthday = dateBirthday;
        this.phone = phone;
    }


    public int getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(int numberTicket) {
        this.numberTicket = numberTicket;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) { this.fio = fio; }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCountBook() {
        return countBook;
    }

    public void setCountBook(int countBook) {
        this.countBook = countBook;
    }

    String getReadersInfo() {
        return "ФИО: " + fio + ", Факультет: " + faculty + ", Дата рождения: " + dateBirthday + ", Телефон: " + phone;
    }

    public void takeBook(int countBook) {
        this.countBook += countBook;
        System.out.println(fio + " взял " + this.countBook + " книгу(и).");
    }

    public void takeBook(String... bookTitle) {
        System.out.println(this.fio + " взял книги: ");
        for (String book : bookTitle) {
            System.out.println("- " + book);
        }
    }

    public void takeBook(Book... book) {
        System.out.println(book[0]);
    }


    public void returnBook(int countBook) {
        this.countBook -= countBook;
        System.out.println(fio + " вернул " + this.countBook + " книгу(и).");
    }

    public void returnBook(String... bookTitle) {
        System.out.println(this.fio + " вернул книги: ");
        for (String book : bookTitle) {
            System.out.println("- " + book);
        }
    }

    public void returnBook(Book... book) {
        System.out.println(book[0]);
    }

}
