package A.Team;

import java.util.Random;

public class Machines {

    private String machineName;
    private double machineBalance;
    private int jackpotOdds;
    private double jackpotPayAmount;
    private int noJackPotsPaid;
    private int noRegularWinsPaid;
    private int regularWinOdds;
    private double regularPayout;
    private int costToPlay = 1;
    private int machineTotalPlaysCount;
    Random Player = new Random();
    Random Slot = new Random();

    public Machines(String machineName, double machineBalance, int jackpotOdds, double jackpotPayAmount, int regularWinOdds, double regularPayout) {
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

    public double getMachineBalance() {
        return machineBalance;
    }

    public void setMachineBalance(double machineBalance) {
        this.machineBalance = machineBalance;
    }

    public int getJackpotOdds() {
        return jackpotOdds;
    }

    public void setJackpotOdds(int jackpotOdds) {
        this.jackpotOdds = jackpotOdds;
    }

    public double getJackpotPayAmount() {
        return jackpotPayAmount;
    }

    public void setJackpotPayAmount(double jackpotPayAmount) {
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

    public double getRegularPayout() {
        return regularPayout;
    }

    public void setRegularPayout(double regularPayout) {
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

    public void playMachine(Player player) {
        // if we have money play machine
        boolean jackWin = (Player.nextInt(jackpotOdds) == Slot.nextInt(jackpotOdds));
        boolean regWin = (Player.nextInt(regularWinOdds) == Slot.nextInt(regularWinOdds));

        if(player.getMoneyBalance() > 0) {
            if((jackWin && (machineBalance < jackpotPayAmount))|| (regWin && (machineBalance < regularPayout))) {
                System.out.println("*******************************************************");
                System.out.println("THIS MACHINE IS OUT OF MONEY!");
                System.out.println("YOU CANNOT PLAY THIS MACHINE UNTIL JACKPOT IS REFILLED.");
                System.out.println("*******************************************************");
            } // end if

            else {
                machineTotalPlaysCount++ ; // increment machine total plays amount
                machineBalance++; // add cost to play money to machine total

                // jackpot payout win
                if(jackWin) {
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
                else if (regWin) {
                    player.setMoneyBalance(player.getMoneyBalance() - costToPlay); // cost of playing ($1)
                    player.setMoneyBalance(player.getMoneyBalance() + regularPayout);
                    System.out.println("*******************************************************");
                    System.out.println("         YOU WON THE REGULAR PAYOUT OF " + regularPayout);
                    System.out.println("*******************************************************");
                } // end else if

                // no wins
                else {
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