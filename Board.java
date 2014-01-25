import java.util.ArrayList;

public class Board {

    String[][] board = new String[8][8];
    ArrayList<Piece> pieces = new ArrayList<Piece>();

    public Board(){
	int initCounter = 0;
	for (int row = 0; row < 8; row++){
	    for (int square = 0; square < 8; square++){
		if (initCounter < 12 && (row+square)%2 == 0){
		    board[row][square] = "1";
		    pieces.add(new Piece("white"));
		    initCounter++;
		}
		else if (initCounter >= 20 && (row+square)%2 == 0){
		    board[row][square] = "2";
		    pieces.add(new Piece("black"));
		    initCounter++;
		}
		else if ((row+square)%2 == 1) {
		    board[row][square] = "WHITE";
		}
		else{
		    board[row][square] = "BLACK";
		    initCounter++;
		}
		
	    }
	}
    }

    public void toBoard(){
	String boardStr = "";
    	for (int row = 0; row < 8; row++){
	    String rowStr = (row+1) + ": ";
    	    for (int square = 0; square < 8; square++){
		if (board[row][square].equals("WHITE")){
		    rowStr += "W";
		}
		else if (board[row][square].equals("BLACK")){
		    rowStr += "B";
		}
		else if (board[row][square].equals("1")){
		    rowStr += "1";
		}
		else if (board[row][square].equals("2")){
		    rowStr += "2";
		}
    	    }
	    boardStr = (rowStr + '\n') + boardStr;
    	}
	System.out.println(boardStr);
    }

    public static void main( String[] args ){
	Board test = new Board();
	test.toBoard();
	// Object[][] bored = test.board;
	// printBoard(bored);
    }

}//end class
