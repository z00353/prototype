// Here Professor Hojo clones sheeps instead of SOLDIERs :)
public class FF7ProfessorHojo {
    private ProductGetter productGetter;
    private PrototypeCloner prototypeCloner;

    // Professor Hojo uses prototype cloner machine
    public FF7ProfessorHojo(PrototypeCloner prototypeCloner) {
        this.prototypeCloner = prototypeCloner;
    }

    // The process
    public String operation() {
        productGetter = prototypeCloner.clone();
        return "Hojo is cloning: " + prototypeCloner.getClass()
                .getSimpleName() + ".\n" +
        productGetter.getName() +" object created.";
    }
}
