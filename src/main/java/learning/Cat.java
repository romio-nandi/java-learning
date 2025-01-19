package learning;

public class Cat extends AnimalInheritence {
@Override
    void makeSound() {
        System.out.println("bark");
    }

    public static void main(String[] args) {
        Cat c=new Cat();

        c.makeSound();
    }
}
