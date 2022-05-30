/*class Mother
{
    void show()
    {
        System.out.println("Hello World");
    }
}*/
class Child extends Mother
{
    void show()
    {
        System.out.println("Hello Juet");
    }
}
class Application
{
    public static void main()
    {
        Mother m1 = new Child();
        m1.show();
    }
}