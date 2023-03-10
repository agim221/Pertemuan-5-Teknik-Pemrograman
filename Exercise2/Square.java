package Exercise2;

public class Square extends Rectangle {
	public Square() {
		
	}
	
	public Square(double side) {
		super(side, side);
	}	
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
	}
	
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
	}
	
	@Override
	public void setLength(double side) {
		super.setWidth(side);
	}
	
	@Override
	public String toString() {
		return "A Square with side = " +this.getArea()+ ", which is a subclass of " +super.toString();
	}
}
