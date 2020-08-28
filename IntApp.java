import java.util.Arrays;

public class IntApp {

	public static void main(String[] args) {
		
		Integer[] data = { 100, 200, 300, 400, null };

		  System.out.print( "LastNull  --> " + Arrays.toString(data) );
	        data = methodA(data);
	        
	      System.out.println();
	      
	      System.out.print( "FirstNull --> " + Arrays.toString(data) );
	        data = methodA(data);
	}
	// the null is at the last position
	public static Integer[] methodA(Integer[] array){
		for (int i = array.length - 1; i > 0; ) {
            array[i--] = array[i];
            array[i] = null;
        }
        return array;
    }
	// switch null to the first position
	public static Integer[] methodB(Integer[] array){
		for (int i = 0; i < array.length; i++) {
			array[i++] = array[i];
			 array[i] = null;
		}
		return array;
			
		} 
}