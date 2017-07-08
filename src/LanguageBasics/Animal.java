package LanguageBasics;

// Marking a class as abstract means that it contains abstract methods that
// must be defined in a child class. Similar to interfaces, abstract classes
// cannot be instantiated, but instead must be extended and the abstract
// methods defined. Different from interfaces, abstract classes can contain a
// mixture of concrete and abstract methods. Methods in an interface cannot
// have a body, unless the method is static, and variables are final by default,
// unlike an abstract class. Also abstract classes CAN have the "main" method.
public abstract class Animal
{
    public abstract void makeSound();

    // Method can have a body
    public void eat()
    {
        System.out.println("I am an animal and I am Eating.");
        // Note: We can access private variable here.
        age = 30;
    }

    // No need to initialize, however in an interface
    // a variable is implicitly final and hence has
    // to be initialized.
    private int age;

    public void printAge()
    {
        System.out.println(age);
    }

    // Abstract classes can have main function.
    public static void main(String[] args)
    {
        System.out.println("I am abstract");
    }
}
