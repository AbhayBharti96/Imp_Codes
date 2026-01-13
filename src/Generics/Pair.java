package Generics;
/* Naming Conventions:
 * E: Element(Used in Collections)
 * K: Key(Used in Maps)
 * V: Value(Used in Maps)
 * N:Number
 */








public class Pair<K, V> {
	private K key;
	private V value;

	Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public static void main(String[] args) {
		Pair<String, Integer> p = new Pair<>("Age", 30);
		System.out.println(p.getKey());
		System.out.println(p.getValue());
	}

}
