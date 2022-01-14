public class MyProgram
{
    public static void main(String[] args)
    {
        LehmanStudent saad = new LehmanStudent("Saad", "Ahmed", 12,"383818888");
        LehmanStudent luis = new LehmanStudent("Luis", "Castro", 12,"183782181");

        System.out.print("Number of students: " + LehmanStudent.getNumStudents());

    }

}
