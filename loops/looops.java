public class looops {
  public static void main(String[]args){

    //while loop: it is used to execute a block of code repeatedly as long as a specified condition is true. The syntax of a while loop is as follows:
    int i = 1;
    while(i<=5){
      System.out.println(i);
      i++;
      
    }
    System.out.println("while loop executed");

    //do while loop: it is similar to a while loop, but the block of code is executed at least once, even if the condition is false. The syntax of a do-while loop is as follows:
    int j = 1;
    do{
      System.out.println(j);
      j++;
      
    } while(j<=5);
    System.out.println("do while loop executed");

    //for loop: it is used to execute a block of code a specified number of times. The syntax of a for loop is as follows:
    for(int k = 1;k<=5;k++){
      System.out.println(k);
     
    }
     System.out.println("for loop executed");
  }
}
