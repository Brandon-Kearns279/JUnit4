/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit4;

/**
 *
 * @author Brandon Kearns
 */
public class Triangle {
	float base, height, hypo;
	public Triangle(){
		base = 3;
		height = 4;
		hypo = 5;
                
                superTest(base, height, hypo);
	}
		
	public Triangle(float b, float h, float hy){
		base = b;
		height = h;
		hypo = hy;
                
                superTest(b, h, hy);
	}
	
	public boolean isRightTriangle(){
		if(Math.sqrt(base * base + height * height) == hypo){
			return true;
		}
		else{
			return false;
		}
	}
	
	public float calcArea(){
		return ((base * height) / 2); //Formula was wrong, fixed. 
	}
	
	public float calcPerimeter(){
		return (base + height + hypo); 
                //Formula was wrong, wasn't adding the height
	}
        
        public void superTest(float b, float h, float hy) {
            if (b < 1 || b > 200) {                     
                    throw new IllegalArgumentException("Value b is out of range of permitted values");
                } else if (h < 1 || h > 200) {
                    throw new IllegalArgumentException("Value h is out of range of permitted values");
                } else if (hy < 1 || hy > 200) {
                    throw new IllegalArgumentException("Value hy is out of range of permitted values");
                }
                
                if (b > h + hy || h > b + hy || hy > b + h) {
                    throw new IllegalArgumentException("Not a triangle");
                } else if (b == h && h == hy) {
                    System.out.println("That is an Equilateral!");                    
                } else if (b == h && b != hy || b == hy && h != hy || h == hy && h != b) {
                    System.out.println("That is an Isosceles!");                    
                } else if(b != h && b != hy && h != hy) {
                    System.out.println("That is an Scalene");                    
                }
        }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHypo() {
        return hypo;
    }

    public void setHypo(float hypo) {
        this.hypo = hypo;
    }
        
        
        
}

