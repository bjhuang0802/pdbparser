import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
	private Scanner input;
	
	public void openFile()
	{
		try
		{
			input = new Scanner(new File("Mb_HE.pdb"));
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			System.err.println("Error opening file.");
			System.exit(1);
			
		}
	}
	
	public void readRecords()
	{
		pdbRecord record = new pdbRecord("",0,"","","",0,0.0,0.0,0.0,0.0,0.0,"","");
		System.out.printf("%-6s%-4s%-10s%-8s%-6s%-6s%-6s%-6s%-6s%-6s%-2s\n","type","rid","atomname","rtype","chain","x","y","z","occ","beta","mol","atype");
		
		try
		{
			while(input.hasNext())
			{
				record.setRecord(input.next(),input.nextInt(),input.next(),input.next(),input.next(),input.nextInt(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.next(),input.next());
				if((record.getatomname()).equals("CA")){
				  System.out.printf("%-6s%-4d%-8s\n",record.getresname(),record.getresid(),record.getatomname());
				}
			}
		}
		catch(NoSuchElementException elementException)
		{
			System.err.println("File improperly formed.");
			input.close();
			System.exit(1);
		}
		catch(IllegalStateException stateException)
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
