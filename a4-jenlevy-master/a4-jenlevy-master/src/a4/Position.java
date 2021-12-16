package a4;


/* 
 * Position
 * Represents an integer (x,y) position on a grid.
 *  
 * getX()
 *   Retrieves x coordinate of the position
 *  
 * getY()
 *   Retrieves y coordinate of the position
 *   
 * getManhattanDistanceTo(Position p)
 *   Calculates the "Manhattan" distance between two positions.
 *   The Manhattan distance is simply the absolute difference in x positions
 *   summed with the absolute difference in y positions.
 */

public interface Position {
	int getX();
	int getY();
	default int getManhattanDistanceTo(Position p) {
		// TODO Auto-generated method stub
		int xDistance = getX()-p.getX();
		if(xDistance<0) {
			xDistance = xDistance *(-1);
		}
		int yDistance = getY()-p.getY();
		if(yDistance<0) {
			yDistance=yDistance *(-1);
		}
		return xDistance + yDistance;

	}
	
}
