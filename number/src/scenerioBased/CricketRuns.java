package scenerioBased;

public class CricketRuns {

    public static void main(String[] args) {
        int[] runs={0,1,2,4,6,0,2,3};
        int[] Person1RunsIn4Matches={40,56,11,1};

        int dot=0,singles=0,boundary=0;
        for (int i=0;i<runs.length;i++){
            if (runs[i]==0){
                dot++;
            }
            else if(runs[i]==4||runs[i]==6){
                boundary++;
            }
            else {
                singles++;
            }
        }
        System.out.println("dot balls->"+dot);
        System.out.println("singles balls->"+singles);
        System.out.println("boundary balls->"+boundary);

        //average run by person 1

    }
}