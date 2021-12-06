package by.itclass;

public class Person1 {
    private Dog dog;

    public Person1() {
        dog = new Dog("Dog1");
    }


    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dog=" + dog +
                '}';
    }
}
