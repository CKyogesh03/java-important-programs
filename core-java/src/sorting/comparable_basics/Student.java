package sorting.comparable_basics;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString(){ //object class toString() method
        return id+"->"+name;
    }
    @Override
    public int compareTo(Student o) { // Object o= every student object one by one
        Student s=(Student)o; //downcasting
        if (s.id==id){
            return 0;
        }
        else if(s.id<id){
            return 1;
        }
        else {
            return -1;
        }
    }
    public static void main(String args[]){
        Student s1= new Student(1,"cholan");
        Student s2= new Student(2,"ajay");
        Student s3= new Student(3,"yogesh");
        Student s4= new Student(4,"vasanth");

        ArrayList al=new ArrayList();
        al.add(s4);
        al.add(s2);
        al.add(s1);
        al.add(s3);
        System.out.println("before sort: "+al);
        Collections.sort(al);
        System.out.println("after sort: "+al);
    }


}