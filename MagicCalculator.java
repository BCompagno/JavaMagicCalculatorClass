package javaCalculator;

public class MagicCalculator extends JavaCalculator {
	
	
    // Square root method
    public double squareRoot(int num) {
        return Math.sqrt(num);
    }

    // Sin method
    public double sin(double num) {
        return Math.sin(num);
    }

    // Cosine method
    public double cos(double num) {
        return Math.cos(num);
    }

    // Tangent method
    public double tan(double num) {
        return Math.tan(num);
    }

    // Factorial method
    public long factorial(int num) {
    	if(num < 0) {
    		return 1;
    	}
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}