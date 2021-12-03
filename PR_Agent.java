//Campos Luna Luis Isael
package QR;

import jade.core.*;
import jade.core.behaviours.OneShotBehaviour;

public class PR_Agent extends Agent{
    
    protected void setup(){
        
        System.out.println("\nAgente "+getLocalName()+", ejecutandose:");
        addBehaviour(new MyOneShotBehaviour());
        
    }//Fin protected void setup
    
    private class MyOneShotBehaviour extends OneShotBehaviour{
        
        @Override
        public void action(){
            Polynomial_Regression PR = new Polynomial_Regression();
            System.out.println("sumX: "+ PR.sumX());
            System.out.println("sumY: "+PR.sumY());
            System.out.println("sumX2: "+PR.sumX2());
            System.out.println("sumX3: "+PR.sumX3());
            System.out.println("sumX4: "+PR.sumX4());
            System.out.println("sumXY: "+PR.sumXY());
            System.out.println("sumX2Y: "+PR.sumX2Y());
            System.out.println("SSE: "+PR.SSE());
            System.out.println("SST: "+PR.SST());
            System.out.println("R2: "+PR.R2());
            System.out.println("determinante: " + PR.getDeterminante());
            System.out.println("a: "+ String.format("%.4f", PR.geta()));
            System.out.println("b: "+ String.format("%.4f", PR.getb()));
            System.out.println("c: "+ String.format("%.4f", PR.getc()));
            //System.out.println(PR.a()+" x^2 - "+PR.b()+" x + "+PR.c());
            
        }//Fin public void action
    
        @Override
        public int onEnd(){
            
            myAgent.doDelete();
            return super.onEnd();
            
        }//Fin public int onDelete
        
    }//Fin private class MyOneShotBehaviour
    
}//Fin public class Gradiente

