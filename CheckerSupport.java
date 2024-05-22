
public class CheckerSupport {
	
	public static char [][] initBoard(int size) {
		char [][]board = new char [size][size];
		char []token = {'s','w'};
		for (int r = 0; r < size; r++) {
			for(int c = 0; c < size; c++) {
				if ((r <= 2) || ( r >= 5)) {
					if (((r % 2 == 0) && (c % 2 != 0)) || ((r % 2 != 0) && (c % 2 == 0))) {
						board [r][c] = token [r/5];
					} else {
						board [r][c] = ' ';
					}
				} else {
					board [r][c] = ' ';
				}
			}
		}
	
	
		return board;
}		
	
	public static void display (final char [][]board) {
		char []letter = {'A','B','C','D','E','F','G','H'};
		
		System.out.printf("\n%4s"," ");
		for (int c = 0; c < board.length; c++)
			System.out.printf(" %2d  ", (c+1));
		System.out.printf("\n%4s%s\n"," ","======================================");
		
		for (int r = 0; r < board.length; r++) {
			System.out.printf("%2c ", letter[r]);
			for (int c = 0; c < board.length; c++) {
				System.out.printf("|%2c |", board[r][c]);
			}
			System.out.println();
			System.out.printf("%4s%s\n"," ","======================================");
		}
	}
}