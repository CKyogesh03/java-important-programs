package aggregation;

public class Mobile {
    String name;
    int price;
    int ram;
    String color;
    Sim slot1; //has-a relationship
    Sim slot2; //has-a relationship
    Earphone earphone; //has-a relationship
    //constructor
    Mobile(){
        //LI
    }

    public Mobile(String name, int price,int ram, String color) {
        this.name = name;
        this.price = price;
        this.ram=ram;
        this.color = color;
    }
    //methods

    public void insertSim1(Sim s1){  //lazy instantiation //aggregation
        if(slot1==null){
            slot1=s1;
            System.out.println("Sim inserted successfully in slot 1");
        }
        else
            System.out.println("Already sim exist in slot 1");
    }
    public void insertSim2(Sim s2){  //lazy instantiation
        if(slot2==null){
            slot2=s2;
            System.out.println("Sim inserted successfully in slot 2");
        }
        else
            System.out.println("Already sim exist in slot 2");
    }
    public void removeSim1(){
        if (slot1!=null){
            String simName=this.slot1.operatorName;
            slot1=null;
            System.out.println(simName+" Sim is removed successfully from slot 1");
        }
        else
            System.out.println("no sim is present in slot 1 to remove ");
    }
    public void removeSim2(){
        if (slot2!=null){
            String simName=this.slot2.operatorName;
            slot2=null;
            System.out.println(simName+" Sim is removed successfully from slot 2");
        }
        else
            System.out.println("no sim is present in slot 2 to remove ");
    }
    public void connectEarphone(Earphone e){
        if(earphone==null){
            this.earphone=e;
            System.out.println(e.name+" Earphone connected successfully");
        }
        else
            System.out.println(earphone.name+" Earphone is Already connected");
    }
    public void removeEarphone(){
        if (earphone!=null){
            String earphoneName=this.earphone.name;
            earphone=null;
            System.out.println(earphoneName+ " Earphone is removed successfully");
        }
        else
            System.out.println("no earphone is present to remove");
    }
}