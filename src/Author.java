
class Author extends Writer
{

    Author() {
        super(10);
        System.out.println("Author constructpr called");
    }

    public static void write()
    {
        System.out.println("Writing book");
    }
}