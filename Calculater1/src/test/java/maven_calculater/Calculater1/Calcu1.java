package maven_calculater.Calculater1;

import java.util.Scanner;

import org.junit.Test;

public class Calcu1 {
	@Test
	
	public void calcuTest() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Add:1\n"+"Sub:2\n"+"Mul:3\n"+"Div:4\n");
		System.out.println("Enter Your Choice\n");
		int n=sc.nextInt();
		System.out.println("Enter 1st number\n");
		int t1=sc.nextInt();
		System.out.println("Enter 2nd number\n");
		int t2=sc.nextInt();
		Test2 ob1=new Test2(t1,t2);
		if(n>=1 && n<5) {
		    int[] ch= {
			        	ob1.add(t1,t2),ob1.sub(t1,t2),ob1.multiply(t1,t2),ob1.division(t1,t2)
			 	
	     	};
		System.out.println("Result :"+ch[n-1]);
		}
		else {
			System.out.println("Invalid Input");
		}
	}
  }

