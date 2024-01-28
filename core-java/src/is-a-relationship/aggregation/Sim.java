package aggregation;

public class Sim {
    String operatorName;
    String bandWidth;
    Sim(){

    }
    Sim(String op,String bw){
        this .operatorName=op;
        this.bandWidth=bw;
    }
    //behaviour
    public void detailsOfSim(){
        System.out.println("The operator is "+operatorName);
        System.out.println("The bandWidth is "+bandWidth);
    }
}