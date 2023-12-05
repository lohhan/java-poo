package exception.Account;

public class Application {
    public static void main(String[] args) {
        
        try {
            Account a = new Account("Lohhan", 2500, 800);      
            a.deposit(500);    
            System.out.println(a.toString()); 
            a.withdraw(340);
            System.out.println(a.toString());
            a.withdraw(950);
            System.out.println(a.toString());

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
