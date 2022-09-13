public class main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1100;
        int bonus;
        if (replenishment > 1000){
            bonus = replenishment / 100;
            System.out.println((balance + replenishment + bonus) + " баланс в сумме с бонусами");
            System.out.println("количество бонусов: " + bonus);
        } else {
            System.out.println (balance + replenishment);
        }

    }
}
