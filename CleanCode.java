
//java program to Convert an array to reduced form
import java.util.ArrayList;
import java.util.Collections;
public class CleanCode
{
 public static void getIndexOfArray(int []array , int []resultantArray)
 {
 int arrayLength = array.length;
 //creating temp arr for finding the index of it's sorted order without affecting the  given array
 ArrayList<Integer> tempArray = new ArrayList<Integer>(arrayLength);
 for(int index=0;index<arrayLength;index++)  
  tempArray.add(array[index]);
 //sort the temporary array
 Collections.sort(tempArray);  
 //getting the index of given array elements
 for(int index=0;index<arrayLength;index++){
    resultantArray[index] = tempArray.indexOf(array[index]);
 }
  
 }
public static void main(String args[])
 {


  int array[] = {5,10,40,30,20};
  int arrayLength = array.length;
  int resultArray[] = new int[arrayLength];
  System.out.println("Enterd array is : ");
  for(int index=0;index<arrayLength;index++)
  {
    System.out.println(array[index]);

  }
   
  //calling the method to get the index

  getIndexOfArray(array,resultArray);    
  System.out.println("Output : ");
  for(int index = 0; index < arrayLength; index++)
    {
        System.out.println(resultArray[index]);
    }
   

 }
}