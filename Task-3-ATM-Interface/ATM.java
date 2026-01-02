import java.util.Scanner ;

// class for bank account
class BankAccount
{
    double  bal ;   // balance variable

    BankAccount( double b )
    {
        bal = b ;
    }

    void deposit ( double amt )
    {
        if( amt > 0 )
        {
            bal = bal + amt ;
            System.out.println(" money added successfully ");
        }
        else
        {
            System.out.println(" wrong amount ");
        }
    }

    void withdraw( double amt )
    {
        if( amt > 0  &&  amt <= bal )
        {
            bal = bal - amt ;
            System.out.println(" take your cash ");
        }
        else
        {
            System.out.println(" not enough balance ");
        }
    }

    void checkBalance( )
    {
        System.out.println(" current balance is : " + bal );
    }
}

// ATM class
public class ATM
{
    public static void main( String args[] )
    {
        Scanner sc = new Scanner( System.in );

        BankAccount acc = new BankAccount( 5000 );   // starting balance

        int ch ;

        do
        {
            System.out.println("\n ATM MENU ");
            System.out.println("1 deposit");
            System.out.println("2 withdraw");
            System.out.println("3 check balance");
            System.out.println("4 exit");

            System.out.print(" enter choice : ");
            ch = sc.nextInt();

            if( ch == 1 )
            {
                System.out.print(" enter amount : ");
                double a = sc.nextDouble();
                acc.deposit( a );
            }
            else if( ch == 2 )
            {
                System.out.print(" enter amount : ");
                double a = sc.nextDouble();
                acc.withdraw( a );
            }
            else if( ch == 3 )
            {
                acc.checkBalance();
            }
            else if( ch == 4 )
            {
                System.out.println(" thank you ");
            }
            else
            {
                System.out.println(" wrong option ");
            }

        }while( ch != 4 );

        sc.close();
    }
}
