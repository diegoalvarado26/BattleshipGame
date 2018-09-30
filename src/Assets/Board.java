package Assets;

public class Board {

	//-------------------//
	// Instance variable //
	//-------------------//
	
	private static final int DEFAULT_POINTS = 12;
    private int points;
    private int side;
    
  
    //--------------//
    // Constructors //
    //--------------//
    
    public Board() {				//default constructor
    	points = DEFAULT_POINTS;
    }
    
    public Board(int points) {
    	this.points = points;
    }
    
    public int getPoints() {
    	return points;
    }
    
}
