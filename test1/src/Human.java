public class Human {
    private int age;
    public String job;
    public Human(String x, int a){
        job = x;
        age = a;
    }
    @Sound(soundLevel = 60, description = "Хриплый голос")
    public void saySomething(){
        System.out.println("Моя работа " + job);
    }

}
