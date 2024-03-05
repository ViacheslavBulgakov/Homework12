import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Author kafka = new Author("Франц", "Кафка");
        Book masterYmargarita = new Book("Мастер и Маргарита", bulgakov, 1992);
        Book castle = new Book("Замок", kafka, 2002);

        System.out.println("Книга - " + masterYmargarita.getTitle() + " Год издания - " + masterYmargarita.getYearPublication() + " Автор - " +
                bulgakov.getName() + " " + bulgakov.getSurname());

        System.out.println(masterYmargarita);

        System.out.println("Книга - " + castle.getTitle() + " Год издания - " + castle.getYearPublication() + " Автор - " +
                kafka.getName() + " " + kafka.getSurname());

        System.out.println(castle);

        castle.setYearPublication(1995);

        System.out.println("Книга - " + castle.getTitle() + " Год издания - " + castle.getYearPublication() + " Автор - " +
                kafka.getName() + " " + kafka.getSurname());

        System.out.println(castle);

        Book masterYmargarita2 = new Book("Мастер и Маргарита", bulgakov,1983);

        System.out.println(masterYmargarita.equals(masterYmargarita2));

        System.out.println(masterYmargarita2.hashCode() == masterYmargarita.hashCode());

    }
}