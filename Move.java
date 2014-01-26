public class Move{

    private Coordinate _origin;
    private Coordinate _destin;
    private String _code;

    public Move( Coordinate origin, Coordinate destination ){
	_origin = origin;
	_destin = destination;
	genCode();
    }

    public void genCode(){
	_code = _origin.toString() + _destin.toString();
    }

    public String toString(){
	return _code;
    }    

    public static void main( String[] args ){
	Coordinate x = new Coordinate(3,1);
	Coordinate y = new Coordinate(4,2);
	Move test = new Move( x,y );
	System.out.println(test);
    }

}
