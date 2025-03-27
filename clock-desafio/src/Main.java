import model.BRLClock;
import model.Clock;
import model.USClock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Clock brlclock = new BRLClock();
        brlclock.setSecond(0);
        brlclock.setMinutes(0);
        brlclock.setHour(23);
        System.out.println(brlclock.getTime());

        //System.out.println(new USClock().convert(brlclock).getTime());
    }
}