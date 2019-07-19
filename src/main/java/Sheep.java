public class Sheep implements PrototypeCloner, ProductGetter {
    // The object Sheep needs cloner and cloning getter to be cloned
    // and delivered

    // The object Sheep has name
    private String name;
    public Sheep(String name){
        this.name = name;
    }

    // We need to copy the constructor here, which method
    // clone() needs
    public Sheep (Sheep clonedSheep) {
        this.name = clonedSheep.getName();
    }
    @Override
    public ProductGetter clone() {
        return new Sheep(this);
    }
    public String getName() {
        return name;
    }
}
