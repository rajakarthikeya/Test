
public class DisplayPattern {

	public static void main(String[] args) throws Exception{
		int k = 5;
		String emptyStr = "";
		
		for (int i = 1; i < k; i++) {
			emptyStr = generateSpaces(i);
			String rowToPrint = "";
			for (int j = i; j <= k; j++) {
				rowToPrint += j;
			}
			System.out.println(emptyStr + rowToPrint);
		}
		emptyStr = generateSpaces(k);
		System.out.println(emptyStr + k);
		for (int i = 1; i < k; i++) {
			emptyStr = generateSpaces(k-i);
			String rowToPrint = "";
			for (int j = k - i; j <= k; j++) {
				rowToPrint += j;
			}
			System.out.println(emptyStr+ rowToPrint);
		}
		
		System.out.println(args[0]+" "+ args[1]);
		
		throw new Exception();
	}
	private static String generateSpaces(int count) {
		String s = "";
		for (int z = 1; z < count; z++) {
			s += " ";
		}
		return s;
	}
}
