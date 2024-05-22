import java.util.Scanner;

public class fgfg {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Enter an option (ex: 1 ): ");
            System.out.println("MENU");
            System.out.println("Options: \n 1: Developer name\n 2: How to play\n 3: Play game\n 4: EXIT\n");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Developer is Ghadeer");
                    break;
                case 2:
                    System.out.println("how to play: two players each player chooses which letter they want and start the game\neach letter "
                            + "can only move diagonally onto an unoccupied area.\nthe letters can only can only move forward towards each other.\n"
                            + "you can also 'jump' which means to jump over your apponents letter which captures the opponents letter and removes\n"
                            + "it from bored, player must always jump if they can. if a player reaches the other side of the opponents board the letter\n"
                            + "will become a king, a king can move backwards and forward. last person who removes all opponent's letters or opponent cant make any move YOU WINS");
                    break;
                case 3:
                    System.out.println("Playing");
                    Board.main(args);
                    break;
                case 4:
                    System.out.println("Exiting program");
                    System.exit(0);
                    break;
            }
        } while (menu != 4);

        System.out.println();
    }
}