package lab24;

public class MagicChair implements Chair{
    @Override
    public void sit(Chair chair) {
        System.out.println("Magic");
    }

    @Override
    public String GetType() {
        return "Magic";
    }
}
