package com;

public class Main {

    public static void main(String[] args) {

        double[][] dataSet = new double[][]{
                {651,23},
                {762,26},
                {856,30},
                {1063,34},
                {1190,43},
                {1298,48},
                {1421,52},
                {1440,57},
                {1518,58}
        };
        
		double x = 0.0;
		
		if (args.length > 0) {
			try {
				x = Double.parseDouble(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Argument [" + args[0] + "] must be a number.");
				System.exit(1);
			}
		}

        SLR slr = new SLR(dataSet);

        System.out.println("Y = " + slr.beta0() + " + "+ slr.beta1() + "(" + x + ")");
        System.out.println("Y = " + slr.predictY(x));
    }
}