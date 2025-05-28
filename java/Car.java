class Car {
    String make;
    int year;

    Car(String m, int y) {
        make = m;
        year = y;
    }

    void show() {
        System.out.println(make + " " + year);
    }

    public static void main(String[] args) {
        new Car("Toyota", 2022).show();
    }
}
