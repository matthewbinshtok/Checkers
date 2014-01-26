import java.util.ArrayList;

public class Player {

    private String _side;
    private String _name;
    private ArrayList<Piece> _mypieces;
    private ArrayList<Move> _mymoves;

    public Player( String side, String name, ArrayList<Piece> pieces ){
	_side = side;
	_name = name;
	_mypieces = pieces;
	_mymoves = new ArrayList<Move>();
	genMoves();
    }

    public void genMoves(){
	_mymoves.clear();
	for (int i = 0; i < _mypieces.size(); i++){
    	    Piece temp = _mypieces.get(i);
	    Coordinate origin = temp.getPosition();
	    if (temp.hasMoves()){
		for (Coordinate destination: temp.getMoves()){
		    _mymoves.add(new Move(origin, destination));
		}
	    }
	}
    }

    public static void main( String[] args ){
	Board setup = new Board();
	setup.toBoard();
	ArrayList<Piece> hispieces = setup.getPieces("red");
	Player Matthew = new Player( "red", "Matthew", hispieces);
	for (Move i: Matthew._mymoves){
	    System.out.println(i);
	}
    }

}
