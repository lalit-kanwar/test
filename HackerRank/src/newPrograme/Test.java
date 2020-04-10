package newPrograme;

class Test {
	public static void main(String[] args) {

		String s1 = "lalit";
		String s2 = "kanwer";
		StringBuilder sb = new StringBuilder();
		int a = s1.length();
		int b = s2.length();

		String s5 = null;
		int len = 0;
		if (a > b) {
			len = b;
		} else {
			len = a;
		}

		for (int i = 0; i < len; i++) {

			String s3 = Character.toString(s1.charAt(i));
			String s4 = Character.toString(s2.charAt(i));
			sb.append(s3 + s4);

		}
		System.out.println(sb);
	}
}