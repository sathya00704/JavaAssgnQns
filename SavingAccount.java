import java.util.*;

abstract class Account
{
    int accid, custid=123;//Only one account number 123 is given
    float balance=0;
    abstract int deposit(int accid);
    abstract int withdraw(int accid);
}

class SavingAccount extends Account
{
    Scanner obj = new Scanner(System.in);
    int deposit(int accid)
    {
        if(accid==custid)
        {
        float depamt;
        System.out.println("Enter the amount to be deposited=");
        depamt = obj.nextFloat();
        balance=balance+depamt;
        System.out.println("Amount deposited !!");
        return 1;
        }
        else
        {
            System.out.println("Invalid Account Number");
            return -1;
        }
    }

    int withdraw(int accid)
    {
        if(accid==custid)
        {
        float wdamt;
        System.out.println("Enter the amount to be withdrawn=");
        wdamt = obj.nextFloat();
        if(wdamt>balance)
        {
            System.out.println("Insufficient balance !!");
            return -1;
        }
        else
        {
            balance=balance-wdamt;
	        System.out.println("Amount Withdrawn !!");
            return 1;
        }
        }
        else
        {
            System.out.println("Invalid Account Number");
            return -1;
        }
    }

    int checkBalance(int accid)
    {
        if(accid==custid)
        {
        System.out.print("Balance available=");
        System.out.println(balance);
        return 1;
        }
        else
        {
            System.out.println("Invalid Account Number");
            return -1;
        }
    }

    public static void main(String args[])
    {
        Scanner obj1 = new Scanner(System.in);
        SavingAccount acc = new SavingAccount();
        int accid,choice;

        System.out.print("You can enter only once... Enter your account number=");
        accid  = obj1.nextInt();//Inputting account number
        System.out.println("1.Deposit   2.Withdraw   3.Check Balance    4.Exit");
        System.out.println("Enter your choice:");
        choice = obj1.nextInt();

        do{
            if(choice==1)
            {
                acc.deposit(accid);
            }
            else if(choice==2)
            {
                acc.withdraw(accid);
            }
            else if(choice==3)
            {
                acc.checkBalance(accid);
            }
            else
            {
                System.out.println("Wrong choice");
            }

	        System.out.println("1.Deposit   2.Withdraw   3.Check Balance    4.Exit");
        	System.out.println("Enter your choice:");
            choice = obj1.nextInt();
        }while(choice!=4);
    }
}
