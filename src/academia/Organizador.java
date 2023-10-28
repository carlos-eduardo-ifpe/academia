package academia;

import java.util.LinkedList;
import java.io.*;
public class Organizador {
	public LinkedList<Membro> readFile(){
		LinkedList<Membro> m = new LinkedList();
		String lineRead;
		String[] splitLine;
		Membro mem;
		try (BufferedReader reader = new BufferedReader(new
				FileReader("Membros.csv")))
		{
			lineRead = reader.readLine();
			while (lineRead != null)
			{
				splitLine = lineRead.split(", ");
				if (splitLine[0].equals("S"))
				{
	mem = new MembroSingular('S', Integer.parseInt(splitLine[1]),
			splitLine[2], Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
				}else
				{
					mem = new MultiMembros('M', Integer.parseInt(splitLine[1]),
							splitLine[2], Double.parseDouble(splitLine[3]),
							Integer.parseInt(splitLine[4]));
				}
				m.add(mem);
				lineRead = reader.readLine();
			}
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		return m;
	}
	public void appendFile(String mem){
try (BufferedWriter writer = new BufferedWriter(new FileWriter("Membros.csv",
true)))
{
writer.write(mem + "\n");
}
catch (IOException e)
{
System.out.println(e.getMessage());
}
}
	public void overwriteFile(LinkedList<Membro> m){
		String s;
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("Membros.temp",
				false))){
			for (int i=0; i< m.size(); i++)
			{
				s = m.get(i).toString();
				writer.write(s + "\n");
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		try{
			File f = new File("Membros.csv");
			File tf = new File("Membros.temp");
			f.delete();
			tf.renameTo(f);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
