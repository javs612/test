import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import org.junit.*;

public class main {

	@Test
	public void main() throws IOException {
		// TODO Auto-generated method stub
		
		
		BufferedWriter bfw = new BufferedWriter(new FileWriter("output.txt"));
		bfw.write("Hello!");
		
		bfw.close();
		
		FileReader fis = new FileReader("output.txt");
		BufferedReader bfr = new BufferedReader(fis);
		
		String textRead= bfr.readLine();
		
		bfr.close();
		
		Assert.assertTrue(textRead.contains("Hello!"));

	}

}
