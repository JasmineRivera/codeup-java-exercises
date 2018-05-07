package movies;

public class Movie {
    private String name;
    private String category;

    public void setName(String name) {
        if (name.isEmpty()) System.out.println("That is invalid!");
        else this.name = name;
    }
    public void setCategory(String category) {
        if (category.isEmpty()) System.out.println("That is invalid!");
        else this.category = category;
    }

}

