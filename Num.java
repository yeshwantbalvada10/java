import java.util.Scanner;
class Num{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int  v= sc.nextInt();
   if(v<0){
    System.out.println("number is negative");
} else if(v==0){
    System.out.println("zero");
}
  else {
    System.out.println("number is positive");
}
    
      
}

}