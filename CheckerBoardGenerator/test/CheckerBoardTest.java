import static org.junit.Assert.*;

import javax.crypto.AEADBadTagException;

import org.junit.Before;
import org.junit.Test;


public class CheckerBoardTest {
	BoardGenerator boardGenerator;

	@Before
	public void assemble()
	{
		boardGenerator = new BoardGenerator();
	}
	@Test
	public void sizeLessThanZeroThenEmptyString() {
		//act
		String result = boardGenerator.generate(-1);
		//assert
		
		assertEquals("", result);
	
	}
	
	@Test 
	public void leftCornerOfTheBoardIsR()
	{
		//act
		String result =boardGenerator.generate(1);
		//assert
		
		assertEquals("[r]\n", result);
		
		
	}
	
	@Test
	public void whenSizeTwoBoardIsR_B_B_R()
	{
		//act
		String result =boardGenerator.generate(2);
		//assert
		assertEquals("[r][b]\n[b][r]\n", result);
		
	}
	
	@Test
	public void whenSizeThreeBoardIsR_B_R_B_R_B()
	{
		
		//act
		String result =boardGenerator.generate(3);
		//assert
		assertEquals("[r][b][r]\n[b][r][b]\n[r][b][r]\n", result);
	}

}
