package rvt;

class Books {
    String name;
    int pages;
    String author;

   
    public Books(String name, int pages, String author) {
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public String getInfo() {
        return "Gramata: " + name + ", lapaspuses " + pages + ", Autors: " + author;
    }
}

class BooksDemo {
    public static void main(String[] args) {
        Books gramata_1 = new Books("White Nights" , 120, "Fyodor Dostoevsky");
        Books gramata_2 = new Books("War and Peace" , 1225, "Leo Tolstoy");

        // Izvada info
        System.out.println(gramata_1.getInfo());
        System.out.println(gramata_2.getInfo());
    }
}