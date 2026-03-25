class bankaccount {
        String holdername;
        double balance;

        bankaccount(String holdername) {
                this.holdername = holdername;
                balance = 1000;
        }

        bankaccount(String holdername, int balance) {
                this.holdername = holdername;
                this.balance = balance;
        }

        void display() {
                System.out.println("name " + holdername);
                System.out.println("balance " + balance);
        }

}

public class bank {
        public static void main(String[] args) {
                bankaccount b1 = new bankaccount("akshita");
                bankaccount b2 = new bankaccount("aksita", 40000);
                b1.display();
                b2.display();
        }

}