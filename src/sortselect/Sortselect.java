 
package sortselect; 
public class Sortselect { 
       public static void main(String[] args) {
              double [] arr ={1,5,9,2,4,3,7};
              selectsort(arr);
              for(int i=0;i<arr.length;i++)
                     System.out.println(arr[i]+" ");
             
       }
       public static void selectsort(double []list){
            for(int i =0;i< list.length;i++){
                
                     double min =list[i];
                     int minindex=i;
                     for(int j =i+1;j<list.length ;j++)
                            if(min> list[j]){
                               min = list[j];
                               minindex=j;
                        }
                     
                     if(minindex!=i){
                       double temp=   list[i];  
                      list[i]=list[minindex];
                      list[minindex]=temp;
                     
                     }
              
              }
       
       
       
       }
       
}
