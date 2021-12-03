/*Campos Luna Luis Isael
 */
package QR;

public class Sumatori extends DataSet {
    double sumX, sumY, sumX2,sumX3, sumX4, sumXY, sumX2Y;
    public double sumX(){
       for(int i = 0;i<n; i++){
           sumX = x[i] + sumX;
       }
       return sumX;
    }
   
   public double sumY(){
       for(int i=0;i<n;i++){
           sumY = y[i] + sumY;
       }
       return sumY;
   }
   
    public double sumX2() {
        for (int i = 0; i<n;i++) {
            sumX2 = Math.pow(x[i], 2) + sumX2;
        }
        return sumX2;
    }
    
    public double sumX3() {
        for (int i = 0; i<n;i++) {
            sumX3 = Math.pow(x[i], 3) + sumX3;
        }
        return sumX3;
    }
    
    public double sumX4() {
        for (int i = 0; i<n;i++) {
            sumX4 = Math.pow(x[i], 4) + sumX4;
        }
        return sumX4;
    }
    
    public double sumXY() {
        for (int i = 0; i < n; i++) {
            sumXY = x[i] * y[i] + sumXY;
        }
        return sumXY;
    }
    
    public double sumX2Y() {
        for (int i = 0; i < n; i++) {
            sumX2Y = Math.pow(x[i], 2)* y[i] + sumX2Y;
        }
        return sumX2Y;
    }
}