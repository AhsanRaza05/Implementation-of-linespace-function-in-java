import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

class LineSpace{

	//BigDecimal totalEqualParts;
	static BigDecimal stepSize;
	
	static BigDecimal[] linespace(BigDecimal firstValue, BigDecimal lastValue){
		
		//totalEqualParts = new BigDecimal("100");
		
		return (linespace(firstValue,lastValue, 100));
		
	}
	
	static BigDecimal[] linespace(BigDecimal firstValue, BigDecimal lastValue, int totalEqualParts){
		
		stepSize = lastValue.subtract(firstValue);
		System.out.print("stepSize = %f\n".formatted(stepSize));
		
		BigDecimal x = new BigDecimal((totalEqualParts - 1) + "");
		System.out.print("x = %f\n".formatted(x));
		
		stepSize = stepSize.divide(x,5,BigDecimal.ROUND_HALF_UP);
		
		System.out.print("Step Size = %f\n\n".formatted(stepSize));
		
		BigDecimal arr[] = new BigDecimal[totalEqualParts];
		int j = 0;
		for(BigDecimal i = firstValue; i.compareTo(lastValue) < 0 || i.compareTo(lastValue) == 0;i = i.add(stepSize),j++){
			
			arr[j] = i;
			System.out.print(arr[j] + ", ");
		}	

		return arr;
	}
	
	public static void main(String args[]){
		
		linespace(new BigDecimal("10"),new BigDecimal("20"));
		System.out.println("\n");
		linespace(new BigDecimal("10"),new BigDecimal("20"),5);
	}

}