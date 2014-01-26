import java.util.ArrayList;

public class Piece {
    
    private String _side;
    private Coordinate _position;
    private ArrayList<Coordinate> moves;

    public Piece( String side ){
	_side = side;
	moves = new ArrayList<Coordinate>();
	//updateMoves();
    }

    public Piece( String side, int x, int y ){
	_side = side;
	_position = new Coordinate(x,y);
	moves = new ArrayList<Coordinate>();
	//updateMoves();
    }

    public ArrayList updateMoves( String[][] setup ){
        int row = _position.getRow()-1;
	int col = _position.getCol()-1;
        for (int i = 0; i < 8; i++){
	    for (int j = 0; j < 8; j++){
		if (validMove(setup,row,col,i,j)){
		    moves.add(new Coordinate((i+1),(j+1)));
		}
	    }
	}
	return moves;
    }

    //helper function to avoid getting offboard coordinates
    public boolean onBoard( int row, int col ){
	return (row >= 0 && col >= 0);
    }

    public boolean validMove( String[][] setup, int row, int col, int i, int j){
	//SCENARIO 1: Spot is 1 square away diagonally, and has no piece. WORKING
	if (setup[(i)][(j)].equals("BLACK") && Math.abs(row-i) == 1 && Math.abs(col-j) == 1){
	    return true;
	}
	return false;
    }

    public String toString(){
	return _side + " " + _position;
    }


}//end class
	
