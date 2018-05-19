package may;

public class GetLongPrefix {

		static int SIZE = 26;

		static class TrieNode {
			TrieNode children[] = new TrieNode[SIZE];
			boolean isEndOfWord;

			TrieNode() {
				isEndOfWord = false;
				for (int i = 0; i < SIZE; i++) {
					children[i] = null;
				}
			}

		};

		static TrieNode root;

		static void insert(String key) {
			int length = key.length();
			int index;

			TrieNode pcrawl = root;
			for (int i = 0; i < length; i++) {
				index = key.charAt(i) - 'a';

				if (pcrawl.children[index] == null) {
					pcrawl.children[index] = new TrieNode();
				}
				pcrawl = pcrawl.children[index];
			}
			pcrawl.isEndOfWord = true;
		}

		static boolean search(String key) {
			boolean result = true;
			int index;
			int length = key.length();
			TrieNode pcrawl = root;

			for (int i = 0; i < length; i++) {
				index = key.charAt(i) - 'a';
				if (pcrawl.children[index] == null) {
					return false;
				}
				pcrawl = pcrawl.children[index];
			}

			result = pcrawl != null && pcrawl.isEndOfWord;
			return result;
		}

		
		public static void main(String[] args) {

			root = new TrieNode();
			insert("are");
			insert("area");
			insert("caterer");
			insert("basement");
					
			System.out.println(search("are"));
			
			
		}
}
