// import java.lang.*;

class reverse {

		public static void main(String[] args)
		{

			String name = "alex";
			char[] charArray = name.toCharArray();
			System.out.println("Reverse: "+name);
			System.out.print("Reversed: ");
			for(int i=charArray.length - 1; i>=0;i--)
			{	
				System.out.print(charArray[i]);
			}

		}


}
