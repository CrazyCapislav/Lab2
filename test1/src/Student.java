public class Student extends Human{
    public String university;
    public Student(String u, String x, int a){
        super(x, a);
        university = u;
    }

    @Override
    @Sound(soundLevel = 40, description = "СПБ")
    public void saySomething()
    {
        System.out.println("Я учусь в " + university);
    }
}