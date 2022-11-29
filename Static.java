public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SchoolName = "WER";
 
        Student s2 = new Student();
        System.out.println(s2.SchoolName);   
        
        Student s3 = new Student();
        s3.SchoolName = "ABC";
        System.out.println(s2.SchoolName);   
    }
}

class Student 
{
    static int returnPrecentage(int math, int phy, int che)
    {
        return (math+phy+che)/3;
    }
    String name;
    int roll;

    static String SchoolName;

    void getName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return this.name;
    }
}
