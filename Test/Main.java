public class Main {
    public static void main(String[] args) {
        Person Max = new Person("Max", 23);
        Max.setAge(25);
        String name = Max.getName();
        int age = Max.getAge();
        System.out.println(name + " is " + age + " yo.");
    }
}
