import java.util.Scanner;
class RPS {
    
    public static void RPSmethod(int PC) {
        int CC= (int) (Math.random()*3)+1;
        int win=0;
        int lose=0;
        int tie=0;
        final int rock=1;
         final int paper=2;
         final int scissors=3;
        if(PC==CC) {
            tie++;
            System.out.println("You threw "+PC+ "I threw: " +CC);
            System.out.println("A draw... this game is dumb.");
        }
        if(PC== rock && CC==paper) {
            lose++;
            System.out.println("You threw: rock I threw: Paper");
            System.out.println("Another victory for superior robot kind.");
        }
        if(PC== paper && CC==scissors) {
            lose++;
            System.out.println("You threw: paper I threw:scissors ");
            System.out.println("Another victory for superior robot kind.");
        }
         if(PC== paper && CC==scissors) {
            lose++;
            System.out.println("You threw: paper I threw:scissors ");
            System.out.println("Another victory for superior robot kind.");
        }
         if(PC== scissors && CC==rock) {
            lose++;
            System.out.println("You threw: scissors I threw:rock ");
            System.out.println("Another victory for superior robot kind.");
        }
      if(PC== scissors && CC==paper) {
            win++;
            System.out.println("You threw: scissors I threw:paper. ");
        System.out.println("Savour your victory for now human. Lock your windows.");
            
        }
       if(PC== rock && CC==scissors) {
            win++;
            System.out.println("You threw: paper I threw:scissors ");
            System.out.println("Savour your victory for now human. Lock your windows.");
            
        }
    }
    public static void RPSstart() {
         Scanner sc= new Scanner(System.in);
         System.out.println("Good luck human");
        final int rock=1;
         final int paper=2;
         final int scissors=3;
         
         System.out.println("What do you throw?  [1] Rock, [2] Paper, [3] Scissors");
        
         int pick= sc.nextInt(); 
         RPSmethod(pick);
    }
    
}