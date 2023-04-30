package operators;


public class Operator {

	public static void main(String[] args) {
		//Arithmatic Operators
		//Relational Operator
		//Logical Operator
		//Bitwise Operator
		//Shift Operator
		//Unary Operator
		//Assignment Operator
		//Ternary Operator
		
		//Aritmatic Operator:operand
		int a = 20;
		int b = 20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);//quotient
		System.out.println(a%b);//remainder
		
		//Unary:increment /decrement
		//++ =+1 a++ = a = a+1
		
		int c =10;
		int d = c++;
//		d = c;
//		c = c+1
		System.out.println(c+" "+d);
		
		
		int e = 10;
		int f = ++e;
		
		System.out.println(e +" "+f);
		
		
		//Relational Operator:boolean
		int x = 20;
		int y = 30;
		
		System.out.println(x<y);//true
		System.out.println(x>y);//false
		System.out.println(x==y);//false
		System.out.println(x!=y);//true
		System.out.println(x>=y);//false
		System.out.println(x<=y);//true
		
		
		//Logical Operators:&& || !
		 // combine the conditions
		//truth table
		
		int m=10;
		int n=40;
		
		System.out.println((m>n)&&(m==n));
		System.out.println((m<n)||(m==n));//false || false
        System.out.println(!(m<n));
        
        System.out.println(!(!(m<n) && (m>n)));
        
        
        //Bitwise operator:& |
        
        int s = 10;//1010
        int t = 20;//10100
        System.out.println(s & t);
        System.out.println(s | t);
        System.out.println(s ^ t);
        
        //Shift operator:
        //left shift: number *2^bit-shift = 30 * 2^2 = 60
        int j = 30;
      //  System.out.println(j<<2);
        
        //right shift:number /2^bit shift = 30 /2^1 = 30/2=15
        System.out.println(j>>1);
        
        
        //Assignment operator:
        // = ==
        int j1=10;
        int sum=10;
        sum = sum +10;
        sum += 10;//compound statement
        
        //-=  *=  /=  %=
        
        //Ternary:
        //condition ? stat1 : stat2
        int num1 = 10;
        int num2 = 20;
        if(num1>num2){
        	System.out.println(num1+" is greater");
        	
        }else{
        	System.out.println(num2 + " is greater");
        }
        
        int res = (num1 > num2)? num1:num2;
        System.out.println(res + "is greater");
        
        
	}

}