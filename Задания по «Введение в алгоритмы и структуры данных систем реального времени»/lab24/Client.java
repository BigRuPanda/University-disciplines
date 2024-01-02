package lab24;

public class Client implements Chair{
    private final ChairFactory chairFactory;
    private String name;

    public Client(ChairFactory chairFactory, String name) {
        this.chairFactory = chairFactory;
        this.name = name;
    }

    public Chair setChair(ChairTypes type) {
        Chair chair = chairFactory.createChair(type);
        return chair;
    }

    @Override
    public void sit(Chair chair) {
        System.out.println("Сел на " + chair.GetType());
    }

    @Override
    public String GetType() {
        return null;
    }
}
