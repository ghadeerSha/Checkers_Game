import java.util.Scanner;

public class Board {

    public static void main(String[] args) {
        char[][] board = CheckerSupport.initBoard(8);
        CheckerSupport.display(board);

        String moves;
        String[] m;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("From: ");
            moves = input.nextLine().toUpperCase();
            m = moves.split(" ");

            if (m.length > 1) {
                String from = m[0];
                String to = m[1];
                char piece = CheckerSupport2.getElement(board, from);
                int fromRow = from.charAt(0) - 'A';
					int fromCol = from.charAt(1) - '1';
					int toRow = to.charAt(0) - 'A';
					int toCol = to.charAt(1) - '1';


					// Check if the move is valid 
					if (isValidMove(board, fromRow, fromCol, toRow, toCol)) {
						// Update the board with the moved piece
						board[toRow][toCol] = piece;
						// Empty the previous position
						board[fromRow][fromCol] = ' ';
					} else {
						// Invalid move, display an error message
						System.out.println("Invalid move. Please try again.");
					}
				

                CheckerSupport.display(board);
            }
        } while (!moves.equalsIgnoreCase("q"));

        input.close();
    }
		private static boolean isValidMove(char[][] board, int fromRow, int fromCol, int toRow, int toCol) {
		// Your existing code for checking the validity of the move...

		// Check if the move captures an opponent's checker
			int capturedRow = (fromRow + toRow) / 2; // Calculate the row of the captured checker
			int capturedCol = (fromCol + toCol) / 2; // Calculate the column of the captured checker
				if (board[capturedRow][capturedCol] != ' ') {
					// Capture the opponent's checker by removing it from the board
					board[capturedRow][capturedCol] = ' '; // Update the board to remove the captured checker
					return true; // Move is valid and captures an opponent's checker
				}
		return true; // Move is valid
		}
}