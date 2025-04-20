public abstract class Person
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    protected abstract void displayRole();

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}