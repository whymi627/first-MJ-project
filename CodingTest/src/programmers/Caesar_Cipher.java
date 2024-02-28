package programmers;

public class Caesar_Cipher {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("a@B# z", 4));
		

	}

}

class Solution {
	private char push(char c, int n) {
		if(!Character.isAlphabetic(c))return c;
		
		int offset = Character.isUpperCase(c) ? 'A' : 'a';
		System.out.println(offset);
		int position = c - offset;
		System.out.println(position);
		
		position = (position + n) % ('Z' - 'A' + 1); // ��ȯ������ 0~ 25 // 26��
		System.out.println(position);
		System.out.println((char)(position + offset));
		
		return (char)(position + offset); // n��ū �̵��� ���ڷ� ��ȯ!!
	}
	
	public String solution(String s, int n) {
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			sb.append(push(c, n));
			System.out.println(sb.toString());
		}
		
		return sb.toString();
	}
}
