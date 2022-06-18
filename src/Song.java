// Liana Wu
// 6.17.2022
// CSE142
// Take-home Assessment #1
//
// A program that produces as output a cumulative song in which successive verses build on previous verses
// In particular, we will produce the song "There Was an Old Woman Who Swallowed a Fly."

public class Song {

    public static void main(String[] args) {
        flyLines();
        System.out.println();

        spiderLines();
        System.out.println();

        birdLines();
        System.out.println();

        catLines();
        System.out.println();

        dogLines();
        System.out.println();

        customLines();
        System.out.println();

        horseLines();
    }

    // Display lines regarding the fly
    public static void flyLines() {
        System.out.println("There was an old woman who swallowed a fly.");
        System.out.println("I don't know why she swallowed that fly,");
        System.out.println("Perhaps she'll die.");
    }

    // Display lines regarding the spider
    public static void spiderLines() {
        System.out.println("There was an old woman who swallowed a spider,");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        flyLines();
    }

    // Display lines regarding the bird
    public static void birdLines() {
        System.out.println("There was an old woman who swallowed a bird,");
        System.out.println("How absurd to swallow a bird.");
        spiderLines();
    }

    // Display lines regarding the cat
    public static void catLines() {
        System.out.println("There was an old woman who swallowed a cat,");
        System.out.println("Imagine that to swallow a cat.");
        birdLines();
    }

    // Display lines regarding the dog
    public static void dogLines() {
        System.out.println("There was an old woman who swallowed a dog,");
        System.out.println("What a hog to swallow a dog.");
        catLines();
    }

    // Display the custom lines
    public static void customLines() {
        System.out.println("There was an old woman who swallowed a Pacman.");
        System.out.println("Whoa, at least it wasn't an actual man.");
        dogLines();
    }

    // Display lines regarding the horse
    public static void horseLines() {
        System.out.println("There was an old woman who swallowed a horse,");
        System.out.println("She died of course.");
    }
}
