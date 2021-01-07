 
package insertionsort; 
public class Insertionsort {
 
       public static void main(String[] args) {
                 int arr[]={2,6,5,7,1,0,8,9,4,11,21,13,17,3,4,15,44,69,55,75};
              System.out.println("before     ");
              for(int y =0 ; y< arr.length;y++)
              {
                     System.out.print(arr[y]+"  ");
              
              }
              insertionsort(arr);
               System.out.println("\nafter     ");
              for(int y =0 ; y< arr.length;y++)
              {
                     System.out.print(arr[y]+"  ");
              
              }
       }
     static void insertionsort (int a[]){
         
              int key ;
              for(int i=1;i<a.length;i++){
                     key=a[i];
                    int j=i-1;
                  while(j>=0 && a[j]>key){
                   a[j+1]=a[j];
                    j=j-1;
                   a[j+1]=key;
                  }
              
              }
       
       }
}
