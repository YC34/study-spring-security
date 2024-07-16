package com.example.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void calcu(){
		int[] a = new int[8];
		int n = 11;
		int i = a.length -1;
//		System.out.println(n);
//		System.out.println(i);
		while (n !=0){
			a[i] = n %2 ;
			System.out.println(i+ "번쨰 : "+ n%2);
			n /= 2 ;
			i--;
			System.out.println(i);
		}
		for (int j = 0; j <a.length ; j++) {
			System.out.printf("%d", a[j]);
		}

	}

}
