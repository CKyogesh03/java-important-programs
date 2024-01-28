package more_programs;
public class Check_Duck_Number {

    static boolean duck(int n){
        while(n>0){
            if(n%10==0)
                return true;
            n=n/10;
        }
        return false;
    }

    public static void main(String args[]){
        duck(0015032);
        duck(001532);

    }

}
