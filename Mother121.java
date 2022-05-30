class Mother121
{
    public static void show()
    {
        System.out.println("Hello World");
    }
}
class Child121 extends Mother121
{
    public static void show()
    {
        System.out.println("Hello JUET");
    }
}
class Application
{
    public static void main()
    {
        Mother121 m1 = new Child121();
        m1.show();
    }
}