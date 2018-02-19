package by.it.malaschenok.lesson06;

public class Dog {
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Dog(String name, int weight, int age, double power ) {
        this.weight = weight;
        this.power = power;
        this.age = age;
        this.name = name;
    }

    private int weight;
    private double power;

    private int age;
    private String name;

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Dog() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return      "Кличка: "+name+". Возраст: "+age;
    }

    boolean win(Dog otherDog) {
        double myChance = 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
        double otherChance = 0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        return myChance>otherChance;
    }

}
