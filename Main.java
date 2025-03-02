//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product p1 = new Movie("Hobal" , 450 , "Abdulaziz Alshlahi");
        System.out.println(p1);
        System.out.println("-----------------------------------");
        Product p2 = new Book("The Last Lecture" , 250 , "Jeffrey Zaslow");
        System.out.println(p2);

        //test set
        System.out.println("-----------------------------------");
        Movie m1 = new Movie();
        m1.setName("Born a KING");
        m1.setPrice(700);
        m1.setDirector("Agustí Villaronga");
        System.out.println(m1);
        System.out.println("-----------------------------------");

        //Q2:
        Movable mm1 = new MovablePoint(100,10,10,100);
        mm1.moveUp();
        mm1.moveDown();
        mm1.moveLeft();
        mm1.moveRight();
        System.out.println(mm1);


    }

}