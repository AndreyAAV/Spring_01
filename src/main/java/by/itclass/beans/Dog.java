package by.itclass.beans;

public class Dog {
    private String name;



    public Dog() {
        System.out.println("default");
    }

    public Dog(String name) {
        System.out.println("params");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
