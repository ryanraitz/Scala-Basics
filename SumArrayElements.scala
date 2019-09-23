//Program that calculates the sum of numbers declared in an array

object SumArray {
    
   def main(args: Array[String]) {
       
      var numbers = Array(5,10,15,20);
      var N:Int=0;
      
      //print all array elements
      println("Array elements: ");
      for ( N <- numbers ) 
	  {
         println(N);
      }
      //calculate the sum of all array elements
      var sum: Int=0;
      for ( N <- numbers ) 
	  {
         sum+=N;
      }      
      println("Sum of array elements: "+sum);

   }
}