public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 50;
        int height = 164;
        float index = service.calculate(weight, height);


    System.out.println(index);
    }
}
