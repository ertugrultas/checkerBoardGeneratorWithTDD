
public class BoardGenerator {

	public String generate(int size) {
		if(size <0)return "";
		String result ="";
		for(int i =0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{				
				result+= i%2==j%2?"[r]":"[b]";
				
			}
			result+="\n";
			
		}
		
		return result;
	}

}
