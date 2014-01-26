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

    public ArrayList updateMoves( Board board ){
        return moves;
    }

    //helper function to avoid getting offboard coordinates
    public boolean onBoard( int row, int col ){
	return (row >= 0 && col >= 0);
    }

    public boolean validMove( int row, int col){
	return true;
    }

    public String toString(){
	return _side + " " + _position;
    }

}//end class
	
