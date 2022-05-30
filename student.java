public class student
{
    int id;
    char name;
    student()
    {
        System.out.println("this is a default constructor");
    }
    student(int i, char n)
    {
        id = i;
        name = n;
    }
    public static void main(String[] args)
    {
        student s = new student();
        System.out.println("\n default constructor values:\n");
        System.out.println("student Id: "+s.id+"\n Student name: "+s.name);
        System.out.println("\n Parameterized construtor values:\n");
        student student = new student(10, 'D');
        System.out.println("Stedent Id : "+ student.id + "\n Student Name :"+student.name);
    }
}