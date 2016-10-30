package A.Team;
import java.util.Scanner;

public class Player {

    private Name name;
    private Date DOB;
    private double moneyBalance;

    public Player(){
        name = new Name();
        DOB = new Date();
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public double getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(double moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name=" + name +
                ", DOB=" + DOB +
                ", moneyBalance=" + moneyBalance +
                '}';
    }

    public void addNewPlayer(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter player's first name: ");
        name.setFirstName(input.next());

        System.out.println("Enter player's middle initial: ");
        name.setMiddleInitial(input.next().charAt(0));

        System.out.println("Enter player's last name: ");
        name.setLastName(input.next());

        System.out.println("Enter player's year of birth: ");
        DOB.setYear(input.nextInt());

        System.out.println("Enter player's month of birth: ");
        DOB.setMonth(input.nextInt());

        System.out.println("Enter player's day of birth: ");
        DOB.setDay(input.nextInt());

        System.out.println("Enter player's starting money: ");
        setMoneyBalance(input.nextInt());
    }

    public void loadVera(){
        name.setFirstName("Vera");
        name.setMiddleInitial('J');
        name.setLastName("Smith");
        name.setSuffix("Esq.");
        setMoneyBalance(100);
    }
}
