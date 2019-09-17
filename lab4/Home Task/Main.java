class Main {

  public static void main(String[] args) {

  
    // Create cylinder object from class Cylinder
    Cylinder cylinder1 = new Cylinder();

    // Setting Values
    cylinder1.setRadius(10f);
    cylinder1.setHeight(20f);

    // Getting Values
    System.out.println(cylinder1.getHeight());
    System.out.println(cylinder1.getRadius());

    //print Details
    cylinder.displayInfo();

    // 
    Cylinder cylinder2 = new Cylinder(2f);
    cylinder2.displayInfo();

    Cylinder cylinder3 = new Cylinder(2f, 3f);
    cylinder3.displayInfo();

  }
}
