public class Main {

    public static void main(String[] args) {

        int check = 500;
        int incomingAmount = 1200;
        int bonusPerson = 0;
        int totalCheck = check + incomingAmount;


        if (incomingAmount > 1000) {
            bonusPerson = incomingAmount / 100;
        }
        totalCheck = totalCheck + bonusPerson;

        System.out.println(" Ваш счет: " + totalCheck + " рублей  Ваш бонус: " + bonusPerson + " рублей ");


    }
}
