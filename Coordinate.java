//Class to accurately relay position of the piece.

public class Coordinate {

    private int _row;
    private int _col;
    private String square;
    private static final String COLUMNS = "ABCDEFGH";

    public Coordinate( int row, int col ){
	_row = row;
	_col = col;
	updateSquare();
    }

    public String toString(){
	updateSquare();
	return square;
    }

    public String updateSquare(){
	square = COLUMNS.substring(_col-1, _col);
	square += _row;
	return square;
    }
    
    public int getRow(){
	return _row;
    }
    
    public int getCol(){
	return _col;
    }

    public int setRow( int x ){
	_row = x;
	updateSquare();
	return _row;
    }
    
    public int setCol( int y ){
	_col = y;
	updateSquare();
	return _col;
    }

    public static void main( String[] args ){
	Coordinate bob = new Coordinate(1,5);
	System.out.println(bob.getRow());
	System.out.println(bob.getCol());
	System.out.println(bob);
	System.out.println(bob.setRow(5));
	System.out.println(bob.setCol(1));
	System.out.println(bob);
    }
}

    
    
    
