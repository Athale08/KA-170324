package appPages;

public class Simple {


    public void sumOfTwoNums(int a , int b){
        System.out.println(a+b);
    }

    public void diffOfTwoNums(int a, int b){

        sumOfTwoNums(a,b);
        System.out.println(a-b);
    }


    public static void main(String[] args) {

        Simple s= new Simple();

        s.diffOfTwoNums(4,5);
    }

}
