package selection_sort;
public class selection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr ={1,5,9,2,4,3,7};     
        selection5(arr);
        for(int i=0;i<arr.length;i++)
               System.out.println(arr[i]+" "); }
public static void selection5(int x[]) {

	for(int i=0;i<x.length;i++) {
		int min=x[i];
		int indexmin=i;
		for(int j=i+1;j<x.length;j++) {
			if(min>x[j]) {
				min=x[j];
				indexmin=j;
			}
		}
		if(indexmin!=i) {
			x[indexmin]=x[i];
			x[i]=min;
			
		}
	}
	/*	for (int i = 0 ; i < x.length ; i++){
        int currentMin = x[i];
        int CurrentMinIN = i ;
        for (int j = i+1 ; j < x.length ; j++){
            if (currentMin > x[j]){
                currentMin = x[j];
                CurrentMinIN = j ;
            }
        }
        if (CurrentMinIN != i){
            x[CurrentMinIN] = x[i];
            x[i] = currentMin ;
        }}*/
	}}