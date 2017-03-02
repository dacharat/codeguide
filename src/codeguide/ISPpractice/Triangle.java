package codeguide.ISPpractice;

/**
 * Find Area of Triangle.
 * 
 * @author Dacharat Pankong
 *
 */
//TODO implement Shape interface.
public class Triangle{
	
	public int height;
	
	public int base;
	
	/**
	 * Triangle have height and base.
	 * 
	 * @param height of triangle.
	 * @param base of triangle.
	 */
	public Triangle(int height, int base){
		this.height = height;
		this.base = base;
	}
	
	/**
	 * Calculate Triangle area.
	 * 
	 * @return Triangle area.
	 */
	public double findArea(){
		return (this.height*this.base)/2;
	}
	
	/**
	 * Return Area.
	 * 
	 * @return Area of triangle.
	 */
	public String toString(){
		return "Triangle area is " + this.findArea();
	}
}
