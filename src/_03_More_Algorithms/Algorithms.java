package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1 + " x " +num2 + " = " + num1*num2;
    }
    
    public static boolean isPrime(int num) {
    	
    	for(int i = 2; i<num; i++) {
    		if(num%i == 0&& num!=2) {
    			return false;
    		}
    	}
    	return true;
    }
    public static boolean isSquare(int num) {
    	for(int i = 0; i<=num; i++) {
    		if(i*i == num) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static boolean isCube(int num) {
    	for(int i = 0; i<num; i++) {
    		if(i*i*i == num) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	for(int i = 0; i<eggs.size(); i++) {
    		if(eggs.get(i).equals("cracked")) {
    			return i;
    		}
    	}
        return -1;
    }
    
    public static int countPearls(List<Boolean> oysters) {
    	int num = 0;
    	for(int i = 0; i<oysters.size(); i++) {
    		if(oysters.get(i) == true) {
    			num++;
    		}
    	}
    	return num;
    }
    
    public static double findTallest(List<Double> peeps) {
		double tallest = 0.0;
		for(int i = 0; i<peeps.size(); i++) {
			if(peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
    }
    
    public static String findLongestWord(List<String> words) {
    	String longestWord = "";
    	for(int i = 0; i<words.size(); i++) {
    		if(words.get(i).length()>longestWord.length()) {
    			longestWord = words.get(i);
    		}
    	}
    	return longestWord;
    }
    
    public static boolean containsSOS(List<String> message) {
    	for(int i = 0; i<message.size(); i++) {
    		if(message.get(i).equals("... --- ...")) {
    			return true;
    		}
    	}
    	return false;

    }
    
    public static List<Double> sortScores(List<Double> results) {
    	double stored = 0.0;
    	for(int i = 0; i<results.size(); i++) {
    		for(int k = 0; k<results.size() -1; k++) {
    			if(results.get(k) > results.get(k+1)) {
    				stored = results.get(k);
    				results.set(k, results.get(k+1));
    				results.set(k+1, stored);
    			}
    		}
    	}
    	return results;
    }
    
    public static List<String> sortDNA(List<String> sequence){
    	String stored = "";
    	for(int i = 0; i<sequence.size(); i++) {
    		for(int k = 0; k<sequence.size()-1; k++) {
    			if(sequence.get(k).length() > sequence.get(k+1).length()) {
    				stored = sequence.get(k);
    				sequence.set(k, sequence.get(k+1));
    				sequence.set(k+1, stored);
    			}
    		}
    	}
    	return sequence;
    }
    
    public static List<String> sortWords(List<String> words){
    	String stored = "";
    	for(int i = 0; i<words.size(); i++) {
    		for(int k = 0; k<words.size()-1; k++) {
    			if(words.get(k).compareTo(words.get(k+1)) >0) {
    				stored = words.get(k);
    				words.set(k, words.get(k+1));
    				words.set(k+1, stored);
    			}
    		}
    	}
    	return words;
    }
}
