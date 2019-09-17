class Main {

  public static void main(String[] args) {

    // Create cylinder object from class Cylinder
    Cylinder cylinder = new Cylinder();

    // Setting Values
    cylinder.setRadius(10f);
    cylinder.setHeight(20f);

    // Getting Values
    System.out.println(cylinder.getHeight());
    System.out.println(cylinder.getHeight());

    //print Details
    cylinder.displayInfo();

  }
}
