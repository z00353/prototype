public class ClonerApp {
    public static void main(String[] args) {
        // Here we create professor Hojo (Client object)
        // and configuring it with prototype object

        FF7ProfessorHojo ff7ProfessorHojo = new FF7ProfessorHojo(new Sheep("Sheep Dolly"));
        // Calling the professor to work
        System.out.println(ff7ProfessorHojo.operation());
    }
}
