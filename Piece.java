public class Piece {
    
    //private String _type;
    private String _side;
    private ArrayList() moves;
    private int _position;

    public Piece( String side, int position ){
	_side = side;
	_position = position;
	updateMoves();
    }

    // Chess Constructor
    // public Piece( String type, String side, int position ){
    // 	_type = type;
    // 	_side = side;
    // 	_position = position;
    // 	updateMoves();
    // }

    public boolean updateMoves(){
	return true;
    }

    public boolean moveTo( int position ){
	_position = position;
	return true;
    }

}//end class
	
