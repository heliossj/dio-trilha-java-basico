import model.Iphone;

public class Main {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.setModel("XR");
        iphone.setReleasedYear(2015);

        System.out.println(iphone.getModel());
        System.out.println(iphone.getReleasedYear());
        

    }
}
