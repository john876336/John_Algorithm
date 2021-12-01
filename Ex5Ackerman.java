package dataStructure;

public class Ex5Ackerman {

//	A(m,n) = {
//	           n+1 when m=0
//	           A(m-1,1) when n=0
//	           A(m-1,A(m,n-1))
//	         }
	//EX: A(1,1) = A(0,A(1,0)) = A(0,A(0,1)) = A(0,2) = 3
	//EX: A(2,2) = A(1,A(2,1)) = A(1,A(1,A(2,0))) = A(1,A(1,A(1,1))) = A(1,A(1,A(0,A(1,0)))) = A(1,A(1,A(0,A(0,1))))
	//			 = A(1,A(1,A(0,2))) = A(1,A(1,3)) = A(1,A(0,A(1,2))) = A(1,A(0,A(0,A(1,1))))
	//¤wª¾ A(1,1) = 3
	//¬G A(1,A(0,A(0,A(1,1)))) = A(1,A(0,A(0,3))) = A(1,A(0,4)) = A(1,5) = A(0,A(1,4)) = A(0,A(0,A(1,3)))
	//						  = A(0,A(0,A(0,A(1,2)))) = A(0,A(0,A(0,A(0,A(1,1))))) = A(0,A(0,A(0,A(0,3))))
	// 						  = A(0,A(0,A(0,4))) = A(0,A(0,5)) = A(0,6) = 7
	
	//commom EX: A(2,2) = 7 , A(2,1) = 5 , A(2,3) = 9 ,A(1,2) = 4
	
	   public static long ackermann(long m, long n) {
		      if (m == 0) return n + 1;
		      if (n == 0) return ackermann(m - 1, 1);
		      return ackermann(m - 1, ackermann(m, n - 1));
		   }

		   public static void main(String[] args) {
		      long M = Long.parseLong(args[0]);
		      long N = Long.parseLong(args[1]);
		      System.out.println(ackermann(M, N));
		   }


}
