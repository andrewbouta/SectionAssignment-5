import java.lang.*;
import java.awt.Point;


public class TechSquadAssignment2_Point {
	
	 double x;
	 double y;
	
	
	public TechSquadAssignment2_Point() {
		x = 0.0;
		y = 0.0;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	
	public boolean equals(Point P) {
		if (this.x == P.x && this.y == P.y) {
			
		} 
			
			
	}

	@Override
	public String toString() {
		return "TechSquadAssignment2_Point [x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
