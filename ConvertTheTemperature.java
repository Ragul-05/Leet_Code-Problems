class Solution {
    public double[] convertTemperature(double celsius) {
        double kel = 0;
    	double fah = 0;
    	kel =  celsius + 273.15;
    	fah = celsius * 1.80 + 32.00;
    	return new double[]{kel, fah};
    }
}