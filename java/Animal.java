class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        new Animal().sound();
        new Dog().sound();
    }
}
