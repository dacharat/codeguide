package codeguide.ISPpractice;

/**
 * Find Square Area.
 * 
 * @author Dacharat Pankong
 *
 */
//TODO implement Shape interface.
public class Square{
	
	public int side;
	
	/**
	 * Square have side.
	 * 
	 * @param side of square.
	 */
	public Square(int side){
		this.side = side;
	}
	
	/**
	 * Calculate square area.
	 * 
	 * @return square area.
	 */
	public double findArea(){
		return Math.pow(this.side,2);
	}
	
	/**
	 * Return Area.
	 * 
	 * @return Area of square.
	 */
	public String toString(){
		return "Square area is " + this.findArea();
	}
}
