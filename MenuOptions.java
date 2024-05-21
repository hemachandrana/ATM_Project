import javax.swing.*;
import javax.swing.text.html.parser.Entity;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MenuOptions extends Accont
{
    Scanner in = new Scanner(System.in);
    HashMap<Integer,Integer> data = new HashMap<>();

    public void getLogin()
    {
        int x=1;

        do
        {
            try {
                data.put(902547, 2000);
                data.put(807239, 2020);

                System.out.println("Welcome To HDFC-ATM");
                System.out.print("Enter your Account Number: ");
                setAccountNo(in.nextInt());
                System.out.print("Enter Your Pin Number: ");
                setPinNo(in.nextInt());
            }

            catch(Exception e)
            {
                System.out.println("Enter Only Numbers!");
                x=2;
            }

            for (Map.Entry<Integer,Integer> entry: data.entrySet())
            {
                if(entry.getKey()==getAccountNo() && entry.getValue() == getPinNo())
                {
                    getAccountType();
                }

            }



        }while (x==1);
    }

    public void getAccountType()
    {
        System.out.println("Select the Account You Want : ");

        System.out.println("Enter 1 : Checking Account");
        System.out.println("Enter 2 : Saving Account");
        System.out.println("Enter 3 : Exit");

        selection = in.nextInt();

        switch (selection)
        {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                exit();
                break;
            default:
                System.out.println("Enter the given Input");
                getAccountType();
        }
    }

    public void getChecking()
    {
        System.out.println("Enter 1 : View Balance");
        System.out.println("Enter 2 : Withdraw Money");
        System.out.println("Enter 3 : Deposit Money");
        System.out.println("Enter 4 : Exit");

        selection = in.nextInt();

        switch (selection)
        {
            case 1:
                cheackingViewBalance();
                break;
            case 2:
                getCheckingWithdrawInput();
                break;
            case 3:
                getCheckingDepositInput();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Enter the Giving Input");
                getChecking();
        }
    }

    public void getSaving()
    {
        System.out.println("Enter 1 : View Balance");
        System.out.println("Enter 2 : Withdraw Money");
        System.out.println("Enter 3 : Deposit Money");
        System.out.println("Enter 4 : Exit");

        selection = in.nextInt();

        switch (selection)
        {
            case 1:
                savingViewBalance();
                break;
            case 2:
                getSavingWithdrawInput();
                break;
            case 3:
                getSavingDepositInput();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Enter the Giving Input");
                getSaving();
        }
    }

    public void cheackingViewBalance()
    {
        System.out.println("Your Account Balance is: "+getCheckingBalance());
        getAccountType();
    }
    public void savingViewBalance()
    {
        System.out.println("Your Account Balance is: "+getSavingBalance());
        getAccountType();
    }

    public void exit()
    {
        System.out.println("Thank You for Using This ATM Byee..");
    }
}