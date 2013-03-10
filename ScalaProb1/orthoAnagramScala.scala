object Test {
   def main(args: Array[String]) {
    orthogonalAnagram("dbca");
   }
   
   
  def orthogonalAnagram(args:String* ) = {
  var myString = "dbca"
         var i : Int = 0;
      for( arg <- args ){
         println("Arg value[" + i + "] = " + arg );
         i = i + 1;
      }
      
      //turns string into array
      val arr = myString.toCharArray
 
    //println(arr(0))
  
   //used for debug purpose
   for ( x <- arr.sorted ) {
         println( x )
      }

      val sortedArr = arr.sorted //sorts the array

      val sortedLength = sortedArr.length //gets length of sorted array
      println(" ");
      println("Displays the length of Array");
      println(sortedLength)//prints length of sorted array
      
      //List work better than Arrays
      var myLength = List('d','b','c','a');
      var mySort = myLength.sorted
      
      println(myLength)
      println(mySort)
      
            
      println(myLength(0))
      println(mySort(0))


      println()
      println()
      var a = 0
      var b = 0
      var myNewList = Array(sortedLength)
      for(a <- mySort){
    	//println(a)
    	if(a == myLength(b))
    	{
    	 // a << mySort(b+1)
    	  println("a is = " + a + " and myLength("+b+") is equal to "+ myLength(b))
    	  b= b+1
    	  a << mySort(b)
    	}
    	
    	else
    	{
    	  a << mySort(b);
    	  println("not a is = " + a + " and myLength("+b+") is equal to "+ myLength(b)) 
    	  // println(a);
    	  b= b+1
    	}
    	
    	
      }
       
 
      
  }
}
