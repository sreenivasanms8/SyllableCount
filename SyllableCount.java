import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class SyllableCount {

	public static void main(String[] args) throws FileNotFoundException {
		
		File text = new File("C:\\text.txt");
		
		@SuppressWarnings("resource")
		Scanner Sc = new Scanner(text);
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		int index = 0;
		
		while(Sc.hasNext()) {
			map.put(index, Sc.next().toLowerCase());
			index++;
		}
		
		for(int i = 0; i < map.size(); i++) {
		
		char[] indWord = map.get(i).toCharArray();

		int counter = 0;
		
			for(int j = 0; j <indWord.length; j++) {
				
				if ((indWord[j] == 'a') || (indWord[j] == 'e') || (indWord[j] == 'i') || (indWord[j] == 'o') || (indWord[j] == 'u') || (indWord[j] == 'y')) {
					counter++;
				}
				
					if ((j+1) < indWord.length) {
						if (((indWord[j] == 'a') || (indWord[j] == 'e') || (indWord[j] == 'i') || (indWord[j] == 'o') || (indWord[j] == 'u') || (indWord[j] == 'y')) && 
							((indWord[j+1] == 'a') || (indWord[j+1] == 'e') || (indWord[j+1] == 'i') || (indWord[j+1] == 'o') || (indWord[j+1] == 'u') || (indWord[j+1] == 'y'))) {
							counter--;
						}
					}
			}
		
		System.out.println("'"+ map.get(i)+"' has a syllable count of "+ counter);
			
		}
	
	}

}
