// Program to find the difference between the square of sums and the sum of squares  
object sumOfSquares
{ 
    // Main Method  
    def main(args: Array[String])  
    { 
        var sum=0;
		var sumOfSquares=0;
		var squareOfSums=0;
		//Calculate sum of squares
		for(w <- 1 until 11)
		{
			sumOfSquares = sumOfSquares + (w * w);
		}
		//Calculate square of sums
		for(w <- 1 until 11)
		{
			squareOfSums = squareOfSums + w;
		}
		
		squareOfSums = (squareOfSums*squareOfSums);
		//Calculate the difference
		sum = (squareOfSums - sumOfSquares);
		//print result
		println(sum);
		  
    } 
}