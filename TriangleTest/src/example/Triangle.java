package example;

public class Triangle {
	double a, b, c ;
	public Triangle(double a,double b, double c) {
		this.a = a ;
		this.b = b ;
		this.c = c ;
	}
	
	public boolean isValid() {
		if(hasAllPositiveSides()) {
			return false ;
		}
		if(hasTwoSidesGreaterThanTheOther()) {
			return true ;
		}
		return false ;
	}

	private boolean hasTwoSidesGreaterThanTheOther() {
		return (a+b>c)&&(b+c>a)&&(c+a>b);
	}

	private boolean hasAllPositiveSides() {
		return a<=0||b<=0||c<=0;
	}
	public boolean isIsosceles() {
		if(a==b&&b==c) {
			return false ;
		}
		if(a==b||b==c||a==c) {
			return true ;
		}
		return false ;
	}	
	public boolean isEquilateral() {
		if(a==b&&b==c) {
			return true ;
		}
		return false ;
	}

	public boolean isScalene() {
		if(isValid()==false) {
			return false ;
		}
		if(a!=b&&b!=c&&c!=a) {
			return true;
		}
		return false ;
	}
}
