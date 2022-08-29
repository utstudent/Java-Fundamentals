package labs_examples.objects_classes_methods.labs.objects;

public class PlaneController {

    public static void main(String[] args) {

        PowerPlant powerPlant = new PowerPlant("Honda", 2000, "Toyota");
        Wing wing = new Wing("Titanium", 100);
        LandingGear landingGear = new LandingGear(8,1,99);
        Fuselage fuselage = new Fuselage(130, 16, 20);
        Airplane myAirplane = new Airplane(10000, 95000, "Black", fuselage, landingGear, wing, powerPlant);

        myAirplane.setPlaneColor("White");
        System.out.println("The planes new color is " + myAirplane.getPlaneColor());

        System.out.println(myAirplane);


        Airplane onePlane = new Airplane(50000, 25000, "White");
        Airplane twoPlane = new Airplane(fuselage, landingGear, wing, powerPlant);

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(onePlane);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(twoPlane);
    }
}
