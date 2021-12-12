package week3.day1;

public class Pc extends Computer 
{
		public void PcSize(int size) 
		{
			System.out.println("PC's size"+ "=" +size);

		}

		public static void main(String[] args)
		{
			Pc sel = new Pc();
			sel.computerModel("=" +"HP");
			sel.PcSize(27);
		}
}