public class MyHcf {
    public static void main(String[] args){
        int a = 120, b = 160, i, hcf = 0;

        for(i = 1; i <= a || i <= b; i++){
            if(a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println("HCF of given two numbers is: " + hcf);
    }
}
