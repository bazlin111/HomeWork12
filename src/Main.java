

public class Main {
    public static void main(String[] args) {
        Author chuckPalanic = new Author("Chuck", "Palanic");
        Book fightClub = new Book("Fight Club", chuckPalanic, 1996);
        Author carlosCastaneda = new Author("Carlos", "Castaneda");
        Book fireFromWithin = new Book(" Fire From Within", carlosCastaneda, 1984);

//        System.out.println(book.getName()+" "+book.getYearPublishing()+ " " +book.getAuthorName());
        System.out.println(" Книга 1 - " + fightClub.getName());
        System.out.println(" Автор 1 - " + chuckPalanic.getFirstName()+ " " + chuckPalanic.getLastName());
        System.out.println(" Книга 2 - " + fireFromWithin.getName());
        System.out.println(" Автор 2 - " + carlosCastaneda.getFirstName()+ " "+ carlosCastaneda.getLastName());
    }
}