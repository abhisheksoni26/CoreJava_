package JavaInheritance.MaggieProgram;

public class Maggie {
    protected String name = "Maggie";
    protected String Mrp = "12Rs";

    public void TagLine(){
        System.out.println("Taste me Best");
    }

}

class Recipe extends Maggie{
    RecipeOfMaggie myrecipe = new RecipeOfMaggie();
    private String recipe = myrecipe.getSteps();

    public static void main(String[] args) {
        Recipe myobj = new Recipe();

        System.out.println("Product Name : " + myobj.name);
        System.out.println("Price : " + myobj.Mrp);
        myobj.TagLine();
        System.out.println("Recipe : " + myobj.recipe);
    }
}
