import java.util.HashSet;
import java.util.Scanner;
class DuplicateElements
{
	public static <T> void duplicates(T[] array)
	{
		HashSet<T> unique=new HashSet<>();
		HashSet<T> duplicate=new HashSet<>();
		for(T ch:array)
		{
			if(!unique.add(ch))
			{
				duplicate.add(ch);
			}
		}
		System.out.println("Duplicate elements:");
		if(duplicate.isEmpty())
		{
			System.out.println("No duplicates found");
		}	
		else
		{
			for(T ch:duplicate)
			{
				System.out.println(ch);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=s.nextLine();
		Character[] charArray=new Character[input.length()];
		for (int i = 0; i < input.length(); i++)
		{
            		charArray[i] = input.charAt(i);
        	}
       		duplicates(charArray);
	}
}
		