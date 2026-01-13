package StringMethods;

class StringOps{
static void ReplaceSpecial(String x) {
	System.out.println(x.replaceAll("[^a-zA-Z0-9]",""));
}
static void ReplaceNumbers(String x) {
	System.out.println(x.replaceAll("[0-9]", ""));
}
static void ReplaceNumberAndSpecial(String x) {
	System.out.println(x.replaceAll("[^A-Za-z]",""));
}
}

public class ReplaceFucntions {

	public static void main(String[] args) {
		String a = "Abhay@4758#0)bharti";
		System.out.println("Original String is --> "+a);
StringOps o = new StringOps();

System.out.print("String after Special Characters --> ");
o.ReplaceSpecial(a);
System.out.print("String after Number Replacing --> ");
o.ReplaceNumbers(a);
System.out.print("String after cleaning all  Replacing --> ");
o.ReplaceNumberAndSpecial(a);
	}

}
