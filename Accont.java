import java.text.DecimalFormat;
import java.util.Scanner;

class Accont
{
    private int accountNo;
    private int pinNo;
    public int selection;
    DecimalFormat moneyFormat = new DecimalFormat("###,##0.00");
    private double checkingBalance=0;
    private double savingBalance=0;
    Scanner in = new Scanner(System.in);

    public int getAccountNo() {
        return accountNo;
    }

    public int getPinNo() {
        return pinNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setPinNo(int pinNo) {
        this.pinNo = pinNo;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double clacSavingWithdraw(double amount) {
        savingBalance =savingBalance-amount;
        return savingBalance;
    }

    public double calcCheckingWihdraw(double amount) {
        checkingBalance = checkingBalance-amount;
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount) {
        savingBalance =savingBalance+amount;
        return savingBalance;
    }

    public double CalcCheckingDeposit(double amount) {
        checkingBalance = checkingBalance+amount;
        return checkingBalance;
    }

    public void getCheckingWithdrawInput()
    {
        System.out.println("Checking Account Balance : "+ moneyFormat.format(checkingBalance));
        System.out.println("Amount You want Withdraw Checking Account : ");
        double amount = in.nextInt();

        if((checkingBalance-amount)>=0)
        {
            calcCheckingWihdraw(amount);
            System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        }
        else
        {
            System.out.println("Negative Number Not Allowed");
        }
    }

    public void getCheckingDepositInput()
    {
        System.out.println("Checking Account Balance : "+moneyFormat.format(checkingBalance));
        System.out.print("Amount You want Deposit Checking Account : ");
        double amount = in.nextInt();

        if((checkingBalance+amount)>=0)
        {
            CalcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        }
        else
        {
            System.out.println("Negative Number Not Allowed");
        }
    }

    public void getSavingWithdrawInput()
    {
        System.out.println("Saving Account Balance : "+moneyFormat.format(savingBalance));
        System.out.println("Amount You want Withdraw Saving Account : ");
        double amount = in.nextInt();

        if((savingBalance-amount)>=0)
        {
            clacSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: "+ moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("Negative Number Not Allowed");
        }
    }

    public void getSavingDepositInput()
    {
        System.out.println("Saving Account Balance : "+moneyFormat.format(savingBalance));
        System.out.println("Amount You want Deposit Saving Account : ");
        double amount = in.nextInt();

        if((savingBalance+amount)>=0)
        {
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance: "+ moneyFormat.format(savingBalance));
        }
        else
        {
            System.out.println("Negative Number Not Allowed");
        }
    }
}
