package at.campus02.zam21.pr1;

public class BunnyApp {
    public static void main(String[] args) {
        System.out.println("we will do something important");
        Bunny bugs = new Bunny();
        Bunny roger = new Bunny();
        // class or instance attribute /methods
        bugs.name = "Bugs Bunny";
        bugs.jump(20.2);

        // static methods (we no longer can do this cause
        // we are in a differen class now)
        // jumpStatic(20.4);
        // this ist the same
        Bunny.jumpStatic(20.3);
        // to access class attribute
        // we need to specify name when,
        // it is a different class
        System.out.println(Bunny.speciesName);

    }
}
