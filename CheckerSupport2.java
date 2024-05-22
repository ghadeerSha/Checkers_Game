
public class CheckerSupport2 {
	public static char getElement(final char [][]board, String location) {
		int row = location.charAt(0) - 'A';
   		int col = location.charAt(1) - '1';
   			return board[row][col];
	}

}
