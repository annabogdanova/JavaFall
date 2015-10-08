package Genome;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Genome {

	public static int GENOME_SIZE = 20;
	public static char[] letters = { 'A', 'C', 'G', 'T' };

	char[] sequence;

	public void generateSequence() {
		Random random = new Random();
		sequence = new char[GENOME_SIZE];

		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = letters[random.nextInt(letters.length)];
			System.out.print(sequence[i]);
		}
		System.out.println();		
	}
	
	public void searchDuplicatesSorting(char[] data, int M) {
		Map<Integer, String> words = new TreeMap<Integer, String>();

		
		for (int i = 0; i < data.length - M + 1; i++) {
			String word = new String(data, i, M);
			words.put(i, word);
		}

		System.out.println("WORDS\n" + words);
		for(Map.Entry<Integer, String> itemI : words.entrySet()){
			for(Map.Entry<Integer, String> itemJ : words.entrySet()){
				if (itemI.getValue().equals(itemJ.getValue()) & itemI.getKey() < itemJ.getKey())
	        	   System.out.printf("Match: %s  at %d and %d\n", itemI.getValue(), itemI.getKey(), itemJ.getKey());
	        }
		}
	}

	public static void main(String[] args) {

		Genome genome = new Genome();

		System.out.println("Generating");
		genome.generateSequence();

		System.out.println("Searching");
		genome.searchDuplicatesSorting(genome.sequence, 2);
		
	}

}
