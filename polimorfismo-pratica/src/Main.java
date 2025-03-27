import model.Employee;
import model.Manager;
import model.Salesman;

public class Main {
    public static void main(String[] args) {
        //Employee manager = new Manager();
        printEmplyee(new Manager());
        printEmplyee(new Salesman());

    }

    public static void printEmplyee(Employee employee){

        System.out.printf("=====%s======", employee.getClass().getCanonicalName());
        switch (employee){
            case Manager manager -> {
                manager.setCode("123");
                manager.setSalary(5000);
                manager.setName("João");
                manager.setLogin("joao");
                manager.setPassword("123456");


                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());
                System.out.println(manager.getFullSalary(500));
            }
            case Salesman salesman -> {
                System.out.println(salesman.getClass().getCanonicalName());
                salesman.setCode("456");
                salesman.setSalary(2800);
                salesman.setName("Lucas");
                salesman.setSoldAmount(1000);
                salesman.setPercentPerSold(10);

                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getCode());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
            }
        }
        System.out.println(employee.getFullSalary());
    }
}