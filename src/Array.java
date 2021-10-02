
import java.util.*;
public class Array {
	static int [] array;  //array
	static int size;      //size increases as elements are filled in the array.	
	
	public Array(){
		array=new int[100]; //length of array = 100
		size=0;
	}

	//function to get values from the user.
	static public void getValues(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of values to insert:");
		int numofElem = input.nextInt(); //number of elements to insert.
		for(int i=0;i<numofElem;i++){
			System.out.println("Enter the num"+i+":");
			insert(input.nextInt(),i);
		}
	} 
	
	//function to insert elements in the array.
	static public void insert(int number,int position){
		for(int i=size-1;i>=position;i--){
			array[i+1]=array[i];
		}
		array[position]=number;
		size++;
	}

	//function to delete elements from the array.
	static public void delete(int position){
		for(int i=position;i<size-1;i++){
			array[i]=array[i+1];
		}
		size--;
	}

	//function to display the array.
	static public void display(){
		for(int i=0;i<size;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	//function to do Linear Search on the array.
	static public boolean linearSearch(int number){
		for(int i=0;i<size;i++){
			if(number==array[i]){
				return true;
			}
		}
		return false;
	}

	//fuction to sort the array.
	static public void bubbleSort(){
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-i-1;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	static public int getAt(int index)
	{
		return array[index];
	}
				
	
	//function to to Binary Search on the array.
	static public boolean binarySearch(int number,int low, int high){
		if(low>high){
			return false;
		}
		int mid=low + (high-low)/2;
		if(array[mid]==number){
			return true;
		}
		if(array[mid]>number){
			return binarySearch(number,low,mid-1);
		}
		else{
			return binarySearch(number,mid+1,high);
		}
	}
}