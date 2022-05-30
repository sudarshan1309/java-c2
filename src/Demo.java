import java.sql.SQLOutput;
import java.util.Scanner;
public class Demo{
    int roll;
    String name;
    String address;
    int marks;
    public void setData(){
        Scanner scObj=new Scanner(System.in);

        System.out.println("Enter the Roll Number:-");
        roll=scObj.nextInt();

        System.out.println("Enter the name of the student");
        name=scObj.nextLine();

        System.out.println("Type the address");
        address=scObj.nextLine();

        System.out.println("Enter the  marks");
        marks = scObj.nextInt();
    }
//    public void cal(){
//        totalmarks=
//    }
    public void cal(){

    }
    public void display(){
        System.out.println("Roll="+roll);
        System.out.println("name="+name);
        System.out.println("address="+address);
        System.out.println("Marks="+marks);
    }
    public static void main(String[] args){
        Demo  objS=new Demo();
        objS.setData();
//        objS.cal();
    }
}
