public class Piece {
    
    private String _side;
    private Coordinate _position;

    public Piece( String side ){
	_side = side;
	//updateMoves();
    }

    public Piece( String side, int x, int y ){
	_side = side;
	_position = new Coordinate(x,y);
	//updateMoves();
    }

    public boolean updateMoves(){
	return true;
    }

    public String toString(){
	return _side + " " + _position;
    }

}//end class
	
