class Name{
  public static void main(String args[]){
   int[] array1 = new int[10]; 
   int length = array1.length;
   int firstvalue=1;
     for(int i=0;i<10;i++){
     array1[i] = firstvalue;
     firstvalue = firstvalue+2;
      
         
}
     for(int i=0;i<10;i++){
         System.out.println(array1[i]);
}
}
}