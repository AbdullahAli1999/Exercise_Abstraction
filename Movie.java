public class Movie extends Product{
    private String director;
    public Movie(){

    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return getPrice() * 0.85;
    }

    @Override
    public String toString() {
        return "Movie{" + "\nName : "+getName()+
                "\ndirector='" + director + "\nPrice : " + getPrice() +"\nAfter discount by 15% : "+ getDiscount()+
                 '}';
    }
}
