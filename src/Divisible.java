public class Divisible {
    //Result function with N
    static void result(int N){
        //iterate from 200 to N
        for(int num = 200; num < 300; num++){
            //Short-circuit operator is used
            if(num % 5 == 0 && num % 7 == 0)
                System.out.print(num + " ");
        }
    }
    public static void main(String[] args){
        //input goes here
        int N = 300;

        //Calling function
        result(N);
    }
}
