package labs_examples.exception_handling.labs;

public class GasTankEmptyException extends Exception{

    @Override
    public String toString() {
        return "The gas tank is not enough";
    }
}
