package com;

public class SLR {
    private double[][] dataSet;
    private double sumX, sumY, sumXSqr, sumXY, x;
    private int n;

    public SLR(double[][] iDataSet, double iX) {
        dataSet = iDataSet;
        x = iX;
        n = iDataSet.length;

        for (double[] doubles : iDataSet) {
            sumX += doubles[1];
            sumY += doubles[0];
            sumXSqr += doubles[1] * doubles[1];
            sumXY += doubles[1] * doubles[0];
        }
    }


    public double beta0(){
        return (sumXSqr * sumY - sumX * sumXY) /
                (n * sumXSqr - Math.pow(sumX, 2));
    }
    public double beta1(){
        return (n * sumXY - sumX * sumY) /
                (n * sumXSqr - Math.pow(sumX, 2));
    }

    public double predictY() {
        return beta0() + beta1() * x;
    }

}