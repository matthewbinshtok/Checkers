import java.util.ArrayList;

public class Board {

    String[][] board = new String[8][8];
    ArrayList<Piece> pieces = new ArrayList<Piece>();

    public Board(){
	int squareCounter = 0;
	for (int row = 0; row < 8; row++){
	    for (int square = 0; square < 8; square++){
		if (squareCounter < 24 && (row+square)%2 == 0){
		    board[row][square] = "1";
		    pieces.add(new Piece("red",(row+1),(square+1)));
		    squareCounter++;
		}
		else if (squareCounter >= 40 && (row+square)%2 == 0){
		    board[row][square] = "2";
		    pieces.add(new Piece("black",(row+1),(square+1)));
		    squareCounter++;
		}
		else if ((row+square)%2 == 0) {
		    board[row][square] = "BLACK";
		    squareCounter++;
		}
		else{
		    board[row][square] = "WHITE";
		    squareCounter++;
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

    public void getPieces(){
	for (int i = 0; i < pieces.size(); i++){
	    Piece temp = pieces.get(i);
	    System.out.println(temp);
	    System.out.println(temp.updateMoves(board));
	}
    }

    public static void main( String[] args ){
	Board test = new Board();
	test.toBoard();
	test.getPieces();
    }

}//end class
