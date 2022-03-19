package ls.wip.com;


import java.io.IOException;

import java.util.Collections;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Read {
	public static void main(String[] args){
		
		List<String> lines = readFileIntoList("start.txt", "/practice/stark.txt");
		
		
		for(String lus : lines) {
			System.out.println(lus);
		}
	}
	private static List<String> readFileIntoList(String filen, String path) {
	
		List<String> lines = Collections.emptyList();
	try {
	lines = Files.readAllLines(Paths.get(path+filen), StandardCharsets.UTF_8);
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return lines;
	}
}
