// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");

class TrieNode {
    // Initialize your data structure here.
    public TrieNode[] children;
    public int val;
    public TrieNode() {
        children = new TrieNode[26];
        val = -1;
    }

}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        insertHelper(root,word,0);
    }
    private TrieNode insertHelper(TrieNode root, String word, int d){
        if(root == null) root = new TrieNode();
        if(d == word.length()) {
            root.val = 1;
            return root;
        }
        int index = word.charAt(d)-'a';
        root.children[index] = insertHelper(root.children[index],word,d+1);
        return root;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode target = searchHelper(root,word,0);
        return target == null ? false: target.val != -1;
    }
    private TrieNode searchHelper(TrieNode root, String word, int d){
        if(root == null || d == word.length()) return root;
        int index = word.charAt(d)-'a';
        return searchHelper(root.children[index],word,d+1);
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode target = searchHelper(root,prefix,0);
        if(target == null) return false;
        if(target.val != -1) return true;
        for(int i=0;i<26;i++){
            if(target.children[i] != null) return true;
        }
        return false;
    }
}