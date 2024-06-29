package tries;

public class TrieDriver {

	public static void main(String[] args) {
		Trie tr = new Trie();
		tr.buildDictionary("idris idpos idpas car cat can");
//		tr.trieDisplay(tr.root);
		tr.findSimilar("id");
	}
}
