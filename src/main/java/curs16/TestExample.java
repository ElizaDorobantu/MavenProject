package curs16;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.*;

public class TestExample {
	
	@Test (invocationCount = 4)
	//fara acest tag nu merge run decat din void main
	//@Test se poate folosi la metode dar si la clase
	public void printCeva() {
	System.out.println("TestNg print");
	}
	
	@RunMultipleTimes(howManyTimes = 2)
	public void printAltceva() {
		System.out.println("Custom print");
	}
	//executa metoda pe care o decoreaza inaintea celorlalte metode
	@BeforeClass
	public void setup() throws IllegalAccessException, InvocationTargetException {
		//obiect al clasei
		TestExample testExample = new TestExample();
		//citesc metodele clasei
		for (Method method : testExample.getClass().getDeclaredMethods()) {
			
			if(method.isAnnotationPresent(RunMultipleTimes.class)) { //verific dc exista adnotarea
				//dc exista creez obiect al adnotarii
				RunMultipleTimes annotation = method.getAnnotation(RunMultipleTimes.class);
			//pt numarul howManyTimes rulez metoda	
			for (int i=0;i<annotation.howManyTimes();i++) {	
				method.invoke(testExample);
				}
			}
		}
	}
}
