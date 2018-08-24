import java.util.HashSet;
import java.util.Set;


public class Name {
	private final String siteName;
	public Name(String name)
	{
		this.siteName = name;
	}
	
	public static void main(String[] args)
	{
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("abcd"));
		System.out.println(s.contains(new Name("abcd")));
	}
}
