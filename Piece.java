public class Piece {
    
    private String _side;

    public Piece( String side ){
	_side = side;
	//updateMoves();
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

    // public boolean moveTo( int position ){
    // 	_position = position;
    // 	return true;
    // }

    public String toString(){
	return _side;
    }

    public static void main( String[] args ){
	// Piece bob = new Piece("black");
	// System.out.println(bob);
    }

}//end class
	
