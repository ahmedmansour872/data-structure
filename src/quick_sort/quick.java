package quick_sort;
public class quick {
	
	public static void main(String[] args) {
		 int [] arr ={1,5,9,2,4,3,7};
	              quick_sort( arr, 0, arr.length-1);
	               System.out.println("\nafter sort ");
	              for(int i=0;i<arr.length;i++)
	                     System.out.print(arr[i]+" "); 
	               System.out.println();}
   public  static int partition(int []list,int first ,int last){
	        int privot= list[first];
	        int low =first+1;
	        int high =last;
	        while(high>low) {                  
	                     while (high>low&&list[low]<=privot)
	                            low++;
	                      while (high>low&&list[high]>privot)
	                            high--;               
	                      if(high>low){
	                int item  = list[low];
	                 list[low]=list[high];
	                 list[high]=item;
	                      }}	                      
	                      while( high>first&&list[high]>privot) 
	                             high--;
                              if(privot>list[high]){
	                             list[first]=list[high];
	                             list[high]=  privot;                        
	                             return high ;
	                         } else 
	                     return first;}
	       public static void  quick_sort(int []list,int first ,int last)
	       {      if(last>first){
	              int privotindex = partition(list,first , last);
	              quick_sort(list,first ,privotindex-1 );
	              quick_sort( list, privotindex+1 , last);}}}