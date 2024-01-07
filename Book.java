public class Book {


    public String title;

    public String author;

    public int publisherYear;






    public Book(String title,String author,int publisherYear)
    {   this.title=title;
        this.author=author;
        this.publisherYear=publisherYear;

    }

    public Book() {
        this.title=title;
        this.author=author;
        this.publisherYear=publisherYear;
    }

    }



    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }
    public int getPublisherYear()
    {
        return publisherYear;
    }




    //
    public void setTitle(String title)
    {
        this.title=title;
    }

    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setPublisherYear(int publisherYear)
    {
        this.publisherYear=publisherYear;
    }
    public String toString()
    {
        return "The details of the book are: " + title + ", " + author + ",  " + publisherYear + "" ;
    }

    public void GetInformation() {
    }

    public class Title implements Comparable< Title > {
        @Override
        public int compareTo(Title 0) {
            return this.title.compareTo(0.title);
}


//Компораторы:
Comporator<Book>byTitle = (b1, b2)->b1.getTitle().compareTo(b2.getTitle());
Comporator<Book>byPublisherYear = (b1, b2)->b1.getPublisherYear().compareTo(b2.getPublisherYear());