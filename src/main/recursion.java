package main;

public class recursion {
   /* public static void countDown(int number){
        if(number==1){
            System.out.println("1");
            return;
        }
        System.out.println(number);
        countDown(number-1);
    }*/

  /* public static int sum(int num){
       if(num==1){
           return 1;
       }
       return num +sum(num-1);
   }*/

  private static int factorial(int num){
      if(num==1){
          return 1;
      }
      return num*factorial(num-1);

  }

  private static int fabonacci(int n){
if(n==0){
    return 0;
}
if(n==1){
    return 1;
}
return fabonacci(n-1)+fabonacci(n-2);
  }

    public static void main(String[] args) {

        //countDown(4);
       //int a = sum(4);
        //System.out.println(a);
        int b = factorial(20);
        System.out.println(b);
        for (int i=0;i<15;i++){
            System.out.println(fabonacci(i));
        }

    }

}
