public class Die {
    int sideUp;

    public int getSideUp() {
        return sideUp;
    }

    void roll() {
        sideUp = (int) (Math.random() * 6) + 1;
        //getSideUp();
    }

    public static void main(String[] args) {
        DieDemo demo = new DieDemo();
        demo.rundie();
        
    }
}

class DieDemo{
    public void rundie(){

        //For Die 1 
        Die die1 = new Die();
        die1.roll();
        int num1 = die1.getSideUp();
        System.out.println("Side up on die 1: " + num1);

        // For die 2
        Die die2 = new Die();
        die2.roll();
        int num2 =die2.getSideUp();
        System.out.println("Side up on die 2: " + num2);

        System.out.println(num1 + num2);

    }
}
