//Campos Luna Luis Isael
package QR;

public class Polynomial_Regression extends Sumatori {
    
    public double getDeterminante(){
        
        Double determinante = (sumX2*sumX2*sumX2)+(sumX*sumX*sumX4)+
        (n*sumX3*sumX3)-(sumX4*sumX2*n)-(sumX3*sumX*sumX2)-(sumX2*sumX3*sumX);
        
        return determinante;
        
    }
    
    public double geta(){
        
        Double a = (sumY*sumX2*sumX2) + (sumXY*sumX3*n) + (sumX2Y*sumX*sumX) - 
                (sumXY*sumX*sumX2) - (sumY*sumX3*sumX) - (sumX2Y*sumX2*n);
    
        double geta = a / getDeterminante();
        
        return geta;
    }

    public double getb(){
        Double b = n* sumX2Y * sumX3 - sumX * sumX2 * sumX2Y + (sumX2 * sumX2) 
        * sumXY + sumX * sumX4 * sumY - n * sumX4 * sumXY - sumX2 * sumX3 * sumY;
        double getb = b / getDeterminante();
        
        return getb;
        
    }

    public double getc(){
    
        Double c= (sumX2 * sumX2 * sumX2Y) - (sumX * sumX2Y * sumX3) +  
        (sumX * sumX4 * sumXY) + ( sumX3 * sumX3 * sumY) - (sumX2 * sumX4 * sumY) - (sumX2 * sumX3 * sumXY);
        double getc = c / getDeterminante();
        
        return getc;
     }
    
    public double SSE(){
        double sse=0;
        for(int i=0;i<n;i++){
            sse+=Math.pow((y[i] - geta() * Math.pow(x[i],2) - getb()*x[i] - getc()),2);
        }
    return sse;
    }
    
    public double SST(){
        double media=0,sst=0;
        for(int i=0;i<n;i++){
            media+=y[i];
        }
        media=media/n;
        
        for(int i=0;i<n;i++){
            sst+=Math.pow((y[i]-media),2);
        }
        return sst;
    }
    
    public double R2(){
        return (1-(SSE()/SST()));
    }
}
