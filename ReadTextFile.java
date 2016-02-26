import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile
{
	private Scanner input;
	
	public void openFile()
	{
		try
		{
			input = new Scanner(new File("xxx.pdb"));
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			System.err.println("Error opening file.");
			System.exit(1);
			
		}
	}
	
	public void readRecords()
	{
		pdbRecord record = new pdbRecord();
		System.out.printf("%-6s%-4s%-6s%-4s%-2s%-6s%-6s%-6s%-6s%-6s%-2s","type","aid","atype","rtype","chain","x","y","z","occ","beta","mol","atype");
		
		try
		{
			while(input.hasNext())
			{
				record.setRecord(input.next(),input.nextInt(),input.next(),input.next(),input.next(),input.nextInt(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.next(),input.next());
			}
		}
		catch(NoSuchElementException elementException)
		{
			System.err.println("File improperly formed.");
			input.close();
			System.exit(1);
		}
		catch(IllegalStateExceptionstateException)
		{
			System.err.println("Error reading from file.");
			System.exit(1);
		}
	}
	public void closeFile()
	{
		if(input != null)
			input.close();
	}
}