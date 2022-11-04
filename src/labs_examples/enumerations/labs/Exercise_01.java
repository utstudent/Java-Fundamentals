package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class...
 */

enum Continent {
    EUROPE (738),
    ASIA(4581),
    NORTH_AMERICA(579),
    SOUTH_AMERICA(422),
    AFRICA(1216),
    OCEANIA(38);
    private final int population;
    Continent(int population) {
        this.population = population;
    }
    public int getPopulation(){
        return this.population;
    }
}
class main {
    public static void main(String[] args) {

        Continent thisContinent = Continent.EUROPE;

        if (thisContinent.equals(Continent.EUROPE)){
            System.out.println("We are in Europe with a population of " + Continent.EUROPE.getPopulation() + " Million!");
        }
    }
}



