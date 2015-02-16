package demo;

import java.util.Arrays;
import java.util.Stack;

import javax.validation.constraints.AssertTrue;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootTestApplication.class)
@WebAppConfiguration
public class SpringBootTestApplicationTests {

	/*
	@Test
	public void contextLoads() {
		
		//System.out.println( "aaa" );
		
		int[] number_arr = new int[10];
		
		for(int i=0;i<number_arr.length;i++){
			number_arr[i] = i;	
		}
		
		for( int num : number_arr ){
			
			System.out.println( "num : " + num );
			
		} 
		
		
		
		//int[] number_arr_new = new int[20];
		
		//System.arraycopy(number_arr, 0, number_arr_new, 0,  Math.min(number_arr.length, number_arr_new.length) );
		
		
		int[] number_arr_new = Arrays.copyOf(number_arr, 20);
		
		for( int num_new : number_arr_new ){
			
			System.out.println( "num_new : " + num_new );
			
		}
		
		
	}
	*/
	
	
	
	@Test
	public void stackTest(){
		
		
		Miro miro = new Miro();
		
		Assert.assertEquals(miro.start(), true);
		
		
		
		
	}
	
	

}
