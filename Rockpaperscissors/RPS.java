import java.util.Scanner;
class RPS {
    
    public static void RPSmethod() {
        Scanner sc= new Scanner(System.in);
         System.out.println("Good luck human");
        final int rock=1;
         final int paper=2;
         final int scissors=3;
         int replay=0;
         int win=0;
        int lose=0;
        int tie=0;
      while(replay==0) {
          int correct=0;
         
         System.out.println("What do you throw?  [1] Rock, [2] Paper, [3] Scissors");
        
         int PC= sc.nextInt(); 
         while(PC!=1 && PC!=2 && PC!=3) {
             System.out.println("Silly human. That isnt a correct value. Try again");
              System.out.println("What do you throw?  [1] Rock, [2] Paper, [3] Scissors");
               PC= sc.nextInt(); 
            }
        int CC= (int) (Math.random()*3)+1;
        
        
       
        if(PC==CC) {
            tie++;
            if(PC==rock) {
                System.out.print("You threw rock");
            }
            if(PC==paper) {
                System.out.print("You threw paper");
            }
            if(PC==scissors) {
                System.out.print("You threw scissors");
             
            }
            if(CC==rock) {
                System.out.println("I threw rock");
            }
            if(CC==paper) {
                System.out.println("I threw paper");
            }
            if(CC==scissors) {
                System.out.println("I threw scissors");
             
            }
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
         if(PC== scissors && CC==rock) {
            lose++;
            System.out.println("You threw: scissors I threw:rock ");
            System.out.println("Another victory for superior robot kind.");
        }
      if(PC== scissors && CC==paper) {
            win++;
            System.out.println("You threw: scissors I threw:paper. ");
        System.out.println("Savour your victory for now human.");
            
        }
       if(PC== rock && CC==scissors) {
            win++;
            System.out.println("You threw: rock I threw:scissors ");
            System.out.println("Savour your victory for now human.");
            
        }
        if(PC== paper && CC==rock) {
            win++;
            System.out.println("You threw: paper I threw: rock ");
            System.out.println("Savour your victory for now human.");
            
        }
        System.out.println("Play again?[Y/N]");
        String again= sc.next();
        if (again.equals("y")) {
          replay=0;
        } else if(again.equals("n")) {
             System.out.println("Good game. Thanks for playing");
             replay=1;
             System.out.println("***********************************");
             System.out.println("Wins: " +win);
             System.out.println("Losses: "+lose);
             System.out.println("Ties: "+tie);
        } 
    }
    }
   
    
}