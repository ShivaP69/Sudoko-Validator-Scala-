
import scala.collection.mutable.ListBuffer


  def final_val(matrix: Array[Array[Int]]):Boolean= {
      for (i <- 0 until 9){
       var row = new ListBuffer[Int]()
       var cols=new ListBuffer[Int]()
       var block= new ListBuffer[Int]()
       for (j <- 0 until 9){  
          val r = i / 3 * 3 + j / 3
          val c = i % 3 * 3 + j % 3

           if(matrix(i)(j)!= 0){
                if(row.contains(matrix(i)(j))){
                    return false
                }
                row+=matrix(i)(j)
            }
          
            if (matrix(j)(i)!=0){
              if (cols.contains(matrix(j)(i))){
                  
               return false
              }
              cols+=matrix(j)(i)
            }
            
            if (matrix(r)(c)!=0) {
                if  (block.contains(matrix(r)(c))){
                    
                   return false
                }
                block+=matrix(r)(c)
            }    
                    
            
              
            }
       }
   return true
    }
    
  

  val matrix = Array(
    Array(0, vv , 0, 3, 0, 9, 0, 2, 6),
    Array(3, 8, 9, 4, 2, 0, 1, 5, 7),
    Array(4, 0, 6, 1, 0, 0, 0, 8, 9),
    Array(0, 1, 3, 7, 9, 8, 0, 0, 4),
    Array(0, 0, 8, 0, 0, 0, 5, 0, 0),
    Array(0, 6, 0, 0, 0, 3, 0, 0, 0),
    Array(0, 0, 1, 9, 3, 0, 0, 4, 0),
    Array(9, 3, 5, 6, 4, 0, 8, 0, 1),
    Array(0, 0, 2, 8, 7, 0, 0, 0, 5)
  )

  println(final_val(matrix))

/**
    def final_val(board: Array[Array[Int]]):Boolean= {
        for (i <- 0 until 9){
             type CHashSet = java.util.HashSet[Int]
             val (rSet, cSet, bSet) = (new CHashSet(), new CHashSet(), new CHashSet())
            for (j <- 0 until 9){
                val r = i / 3 * 3 + j / 3
                val c = i % 3 * 3 + j % 3
                if (board(i)(j) != 0 && !rSet.add(board(i)(j))) return false
                if (board(j)(i) != 0 && !cSet.add(board(j)(i))) return false
    
                if (board(r)(c) != 0 && !bSet.add(board(r)(c))) return false
              
               
                }
            }
        
         return true
    }
    
          

  val matrix = Array(
    Array(0, 5, 0, 3, 0, 9, 0, 2, 6),
    Array(3, 8, 9, 4, 2, 0, 1, 5, 7),
    Array(4, 0, 6, 1, 0, 0, 0, 8, 9),
    Array(0, 1, 3, 7, 9, 8, 0, 0, 4),
    Array(0, 0, 8, 0, 0, 0, 5, 0, 0),
    Array(0, 6, 0, 0, 0, 3, 0, 0, 0),
    Array(0, 0, 1, 9, 3, 0, 0, 4, 0),
    Array(9, 3, 5, 6, 4, 0, 8, 0, 1),
    Array(0, 0, 2, 8, 7, 0, 0, 0, 5)
  )

  println(final_val(matrix))

\**
