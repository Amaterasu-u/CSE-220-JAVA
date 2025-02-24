import java.util.*;


public class oop_prac_4 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the number of customers: ");
        int n = cin.nextInt();
        cin.nextLine();
        Account [] ob = new Account[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the Account number: ");
            String acc = cin.nextLine();
            System.out.println("Enter the Balance: ");
            double bal = cin.nextDouble();
            cin.nextLine();
            ob[i] = new Account(acc, bal);
        }

        for(int i=0;i<n;i++){
            ob[i].ShowBankBalance();
        }

        System.out.println("Enter your account number to deposit or withdraw money: ");
        String accno = cin.nextLine();
        boolean flag = true;
        for(int i=0;i<n;i++){
            if(ob[i].getacc().equals(accno)){
                System.out.println("Enter 1 to deposit and 2 to withdraw ");
                int k = cin.nextInt();
                cin.nextLine();
                if(k==1){
                    System.out.println("Enter the amount to deposit: ");
                    double amount = cin.nextDouble();
                    cin.nextLine();
                    ob[i].deposit(amount);
                    ob[i].ShowBankBalance();
                    flag=true;
                    break;
                }
                else if(k==2){
                    System.out.println("Enter the amount to withdraw: ");
                    double amount = cin.nextDouble();
                    cin.nextLine();
                    ob[i].withdraw(amount);
                    ob[i].ShowBankBalance();
                    flag=true;
                    break;
                }
                else{
                    System.out.println("Invalid choice");
                    break;
                }
            }
            else{
                flag=false;
            }
        }
        if(flag==false){
            System.out.println("Account not found");
        }
    }
}


class Account{
    private String acc;
    private double balance;

    public
    Account(String a , double b){
        acc = a;
        balance = b;
    }
public String getacc(){
    return acc;
}
    void deposit(double a){
        balance +=a;
    }

    void withdraw(double a){
        if(a>balance){
            System.out.println("Tui Gorib");
        }
        else{
            balance -=a;
        }
    }

    void ShowBankBalance(){
        System.out.println("Account number: "+acc + " Has balance of taka: " + balance);
    }
}