package A.Team;

/**
 * Created by Christian Paredes on 10/26/2016.
 */
public class Machines {
    private String machineName;
    private int machineBalance;
    private int noJackpotsPaid;
    private int jackPotOdds;
    private int jackpotPayAmount;
    private int noRegularWinsPaid;
    private int regularWinOdds;
    private int regularPayout;

    //CONSTRUCTOR
    public Machines(String machineName, int machineBalance, int noJackpotsPaid, int jackPotOdds, int jackpotPayAmount, int noRegularWinsPaid, int regularWinOdds, int regularPayout) {
        this.machineName = machineName;
        this.machineBalance = machineBalance;
        this.noJackpotsPaid = noJackpotsPaid;
        this.jackPotOdds = jackPotOdds;
        this.jackpotPayAmount = jackpotPayAmount;
        this.noRegularWinsPaid = noRegularWinsPaid;
        this.regularWinOdds = regularWinOdds;
        this.regularPayout = regularPayout;
    }
    //SETTERS AND GETTERS
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

    public int getNoJackpotsPaid() {
        return noJackpotsPaid;
    }

    public void setNoJackpotsPaid(int noJackpotsPaid) {
        this.noJackpotsPaid = noJackpotsPaid;
    }

    public int getJackPotOdds() {
        return jackPotOdds;
    }

    public void setJackPotOdds(int jackPotOdds) {
        this.jackPotOdds = jackPotOdds;
    }

    public int getJackpotPayAmount() {
        return jackpotPayAmount;
    }

    public void setJackpotPayAmount(int jackpotPayAmount) {
        this.jackpotPayAmount = jackpotPayAmount;
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

    //TOSTRING
    @Override
    public String toString() {
        return "Machines{" +
                "machineName='" + machineName + '\'' +
                ", machineBalance=" + machineBalance +
                ", noJackpotsPaid=" + noJackpotsPaid +
                ", jackPotOdds=" + jackPotOdds +
                ", jackpotPayAmount=" + jackpotPayAmount +
                ", noRegularWinsPaid=" + noRegularWinsPaid +
                ", regularWinOdds=" + regularWinOdds +
                ", regularPayout=" + regularPayout +
                '}';
    }

}
