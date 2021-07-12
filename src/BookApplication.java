public class BookApplication {
    public static void main(String[] args){
        //printing using setter and get_display_text
        Book harry_potter = new Book();
        harry_potter.set_author("J.K. Rowling");
        harry_potter.set_title("Harry Potter and the Philosopher's Stone");
        harry_potter.set_description("Harry Potter goes to wizard school and does stuff");
        harry_potter.set_price(20.00);
        harry_potter.set_is_in_stock(true);
        harry_potter.get_display_text();

        //printing using getter
        System.out.printf("\n\nAuthor: %s, \nTitle: %s \nDescription: %s\n\n", harry_potter.get_author(), harry_potter.get_title(), harry_potter.get_description());

        //printing assigning values and printing using overloaded constructor
        Book lord_of_the_rings = new Book("J.R.R Tolkien", "Lord of the Rings: The Fellowship of the ring", "There is this ring and stuff happens", 20.00, true);
        lord_of_the_rings.get_display_text();
    }
}
