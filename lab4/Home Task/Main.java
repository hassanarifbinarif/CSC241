class Main {

  public static void main(String[] args) {

  
    // Create cylinder object from class Cylinder
    Cylinder cylinder = new Cylinder();

    // Setting Values
    cylinder.setRadius(10f);
    cylinder.setHeight(20f);

    // Getting Values
    System.out.println(cylinder.getHeight());
    System.out.println(cylinder.getRadius());

    //print Details
    cylinder.displayInfo();


    //calling each constructor/method at least once
    Cylinder cylinder1 = new Cylinder(2f);
    System.out.println(cylinder1.getHeight());
    System.out.println(cylinder1.getRadius());

    Cylinder cylinder2 = new Cylinder(2f, 3f);
    System.out.println(cylinder2.getHeight());
    System.out.println(cylinder2.getRadius());

  }
}
