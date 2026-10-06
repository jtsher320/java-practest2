
record Book(String title, int pages, int year) {}

void main()
{
   var books = VList.of( // inferred type for ’books’ var(iable): VList<Book>
            new Book("The Martian", 220, 2019), // <- book (not film) version!
            new Book("Project Hail Mary", 410, 2023), // <- ditto!
            new Book("Biological War: A Scenario", 432, 2026), // <- (scary.. don’t read)
            new Book("Dust", 416, 2013) // <- eh
    );

    // a ):
    var filtered = books.filter( b -> b.pages >= 300);

    // b):
    var mapped = books.map( b -> new Book(b.title(), b.pages + 10, b.year()) );
    IO.println("transformed books (each has pg ct + 10)");
    //for (var book : mapped) {
    //    IO.println(book);
    //}
    // c)
    //var all2020OrLater = books.filter(b -> b.year() >= 2020);
    //var all2020OrLaterTitles = all2020OrLater.map(b -> b.title());
    var all2020OrLater = books.filter(b -> b.year() >= 2020).map(b -> b.title());
}

