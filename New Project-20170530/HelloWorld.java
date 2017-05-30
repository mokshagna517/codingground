public class HelloWorld{
   static int temp,min;
     public static void main(String []args){
       int[] a=new int[]{8,1,5,0,94,-4,-2100,-50};
       for(int i=0;i<a.length-1;i++){
           min=i;
           for(int j=i+1;j<a.length;j++){
               if(a[j]<a[min]){
                   min=j;
               }
           }
           temp=a[i];
           a[i]=a[min];
           a[min]=temp;
       }
       for( int k=0;k<a.length;k++){
           System.out.print(a[k]+" ");
       }
     }
}
