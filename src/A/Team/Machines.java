package A.Team;

/**
 * Created by Christian Paredes on 10/26/2016.
 */
import java.util.Random;
import java.util.Scanner;

public class Machines {

    private String machineName;
    private int machineBalance;
    private int jackpotOdds;
    private int jackpotPayAmount;
    private int noJackPotsPaid;
    private int noRegularWinsPaid;
    private int regularWinOdds;
    private int regularPayout;
    private final int costToPlay = 1;
    private int machineTotalPlaysCount;
    Random Player = new Random();
    Random Slot = new Random();

    public Machines(String machineName, int machineBalance, int jackpotOdds, int jackpotPayAmount, int regularWinOdds, int regularPayout) {
        this.machineName = machineName;
        this.machineBalance = machineBalance;
        this.jackpotOdds = jackpotOdds;
        this.jackpotPayAmount = jackpotPayAmount;
        this.regularWinOdds = regularWinOdds;
        this.regularPayout = regularPayout;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public int getMachineBalance() {
        return machineBalance;
    }

    public void setMachineBalance(int machineBalance) {
        this.machineBalance = machineBalance;
    }

    public int getJackpotOdds() {
        return jackpotOdds;
    }

    public void setJackpotOdds(int jackpotOdds) {
        this.jackpotOdds = jackpotOdds;
    }

    public int getJackpotPayAmount() {
        return jackpotPayAmount;
    }

    public void setJackpotPayAmount(int jackpotPayAmount) {
        this.jackpotPayAmount = jackpotPayAmount;
    }

    public int getNoJackPotsPaid() {
        return noJackPotsPaid;
    }

    public void setNoJackPotsPaid(int noJackPotsPaid) {
        this.noJackPotsPaid = noJackPotsPaid;
    }

    public int getNoRegularWinsPaid() {
        return noRegularWinsPaid;
    }

    public void setNoRegularWinsPaid(int noRegularWinsPaid) {
        this.noRegularWinsPaid = noRegularWinsPaid;
    }

    public int getRegularWinOdds() {
        return regularWinOdds;
    }

    public void setRegularWinOdds(int regularWinOdds) {
        this.regularWinOdds = regularWinOdds;
    }

    public int getRegularPayout() {
        return regularPayout;
    }

    public void setRegularPayout(int regularPayout) {
        this.regularPayout = regularPayout;
    }

    public int getCostToPlay() {
        return costToPlay;
    }

    public int getMachineTotalPlaysCount() {
        return machineTotalPlaysCount;
    }

    public void setMachineTotalPlaysCount(int machineTotalPlaysCount) {
        this.machineTotalPlaysCount = machineTotalPlaysCount;
    }


    //*****************additional methods*****************************************************

    public String toString() {
        return "SlotMachine [machineName=" + machineName + ", machineBalance=" + machineBalance + ", jackpotOdds="
                + jackpotOdds + ", jackpotPayAmount=" + jackpotPayAmount + ", noJackPotsPaid=" + noJackPotsPaid
                + ", noRegularWinsPaid=" + noRegularWinsPaid + ", regularWinOdds=" + regularWinOdds + ", regularPayout="
                + regularPayout + ", costToPlay=" + costToPlay + ", machineTotalPlaysCount=" + machineTotalPlaysCount
                + ", RegularPlayOddsMatchCounter=" + ", JackpotPlaysOddsMatchCounter="
                + "]";
    }

    public void playMachine(Player player)
    {
        // if we have money play machine
        if(player.getMoneyBalance() > 0)
        {
            if(machineBalance < 1)
            {
                System.out.println("*******************************************************");
                System.out.println("THIS MACHINE IS OUT OF MONEY!");
                System.out.println("YOU CANNOT PLAY THIS MACHINE UNTIL JACKPOT IS REFILLED.");
                System.out.println("*******************************************************");
            } // end if

            else
            {
                machineTotalPlaysCount++ ; // increment machine total plays amount
                machineBalance++; // add cost to play money to machine total

                // jackpot payout win
                if(Player.nextInt(jackpotOdds) == Slot.nextInt(jackpotOdds)) {
                    player.setMoneyBalance(player.getMoneyBalance() - costToPlay); // cost of playing $1
                    player.setMoneyBalance(player.getMoneyBalance() + jackpotPayAmount);
                    machineBalance = machineBalance - jackpotPayAmount;
                    System.out.println("*******************************************************");
                    System.out.println("You won the Jackpot Payout of " + jackpotPayAmount);
                    System.out.println("*******************************************************");
                    System.out.println(machineName + " balance is: " + machineBalance);
                    System.out.println(machineName + " total plays: " + machineTotalPlaysCount);
                    System.out.println(machineName + " total plays: " + machineTotalPlaysCount);
                    System.out.println("*******************************************************");
                } // end if

                // regular payout win
                // skip this if jackpot won (above)
                else if (Player.nextInt(regularWinOdds) == Slot.nextInt(regularWinOdds)) {
                    player.setMoneyBalance(player.getMoneyBalance() - costToPlay); // cost of playing ($1)
                    player.setMoneyBalance(player.getMoneyBalance() + regularPayout);
                    System.out.println("*******************************************************");
                    System.out.println("         YOU WON THE REGULAR PAYOUT OF " + regularPayout);
                    System.out.println("*******************************************************");
                } // end else if

                // no wins
                else
                {
                    player.setMoneyBalance(player.getMoneyBalance() - costToPlay); // cost of playing ($1)
                    System.out.println("*******************************************************");
                    System.out.println("                YOU DID NOT WIN.                       ");
                    System.out.println("               PLEASE PLAY AGAIN!                      ");
                    System.out.println("*******************************************************");
                } // end else
            } // end if
        } // end if
        else
        {
            System.out.println("Player Balance is $0.00");
        }// end else
    } // end playMachine()
} // end SlotMachine class