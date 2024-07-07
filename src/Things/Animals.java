package Things;

public class Animals extends LivingThings {
    private Vertebrate vertebrate;
    private NonVertebrate nonVertebrate;

    public void movement(){
        System.out.println("Move");
    }

    @Override
    public void reproduces(String yes) {
        super.reproduces(yes);
    }

    @Override
    public void nutrient(String withWhat) {
        super.nutrient(withWhat);
    }

    @Override
    public void irritability(String how) {
        super.irritability(how);
    }

    @Override
    public void growth(String with) {
        super.growth(with);
    }

    @Override
    public void Excretion(String how) {
        super.Excretion(how);
    }

    @Override
    public void Respiration(String how) {
        super.Respiration(how);
    }

    @Override
    public void death(String when) {
        super.death(when);
    }
}
