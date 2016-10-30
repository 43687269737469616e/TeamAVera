package A.Team;
import java.util.Scanner;

public class Player {

    private Name name;
    private Date DOB;
    private double moneyBalance;
    private static int numOfPlayers = 1; // Vera makes default of 1

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

    public static int selectPlayer(Player slotPlayers[])
    {
        int result = 0;
        Scanner input = new Scanner(System.in);

        // list players
        for(int i=0;i<Player.numOfPlayers;i++)
        {
            System.out.println((i+1) + ". " + slotPlayers[i].getName().getFirstName() + " " + slotPlayers[i].getName().getMiddleInitial() + " " + slotPlayers[i].getName().getLastName() + " " + slotPlayers[i].getName().getSuffix());
        }

        // select player number from list
        System.out.print("Choose number of player to load: ");
        result = input.nextInt();
        result = result - 1; // converts selection from list to index number of player

        return result;
    }

    public static void addNewPlayer(Player slotPlayers[])
    {
        if(Player.numOfPlayers == 50)
        {
            System.out.println("Max players is 50. You cannot add more players");
        }

        else
        {
            Player.numOfPlayers++;
            Scanner input = new Scanner(System.in);

            System.out.println("Enter player's first name: ");
            slotPlayers[numOfPlayers - 1].name.setFirstName(input.nextLine());

            System.out.println("Enter player's middle initial: ");
            String holder = input.nextLine();
            if(holder.length() != 0) {
                holder = holder.toUpperCase();
                slotPlayers[numOfPlayers - 1].name.setMiddleInitial(holder.charAt(0));
            }
            else slotPlayers[numOfPlayers - 1].name.setMiddleInitial('\0');

            System.out.println("Enter player's last name: ");
            slotPlayers[numOfPlayers - 1].name.setLastName(input.nextLine());

            System.out.println("Enter player's suffix: ");
            slotPlayers[numOfPlayers - 1].name.setSuffix(input.nextLine());

            System.out.println("Enter player's year of birth: ");
            slotPlayers[numOfPlayers - 1].DOB.setYear(input.nextInt());

            System.out.println("Enter player's month of birth: ");
            slotPlayers[numOfPlayers - 1].DOB.setMonth(input.nextInt());

            System.out.println("Enter player's day of birth: ");
            slotPlayers[numOfPlayers - 1].DOB.setDay(input.nextInt());

        }
    }

    public void loadVera(){
        name.setFirstName("Vera");
        name.setMiddleInitial('J');
        name.setLastName("Smith");
        name.setSuffix("Esq.");
        setMoneyBalance(100);
    }
}
