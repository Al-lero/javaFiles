package Things;

public class LivingThings extends Things {
    private Plants plants;
    private Animals animals;

    public void movement(String where) {
        System.out.println("moving to where");
    }

    public void Respiration(String how){}

    public void nutrient(String withWhat){
        System.out.println("Nutrient with what");
    }

    public void irritability(String how){
        System.out.println("Every one gets irritated");
    }

    public void growth(String with){
        System.out.println("food for growth");

    }

    public void Excretion(String how){
        System.out.println("Everyone does");

    }

    public void reproduces(String yes){
        System.out.println("producing fish");
    }

    public void death(String when){
        System.out.println("End Journey");
    }


}
