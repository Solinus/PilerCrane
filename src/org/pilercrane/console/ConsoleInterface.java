package org.pilercrane.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.pilercrane.model.Storage;

public class ConsoleInterface {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello!\nThis is program that can move piler crane and manipulate loads at the storage\r\n");
		System.out.println("Please enter your query");
		
		Storage storage = new Storage();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("$:");
			String query = br.readLine();
			
			if(query.equals("exit")) {
				System.out.println("Bye.");
				break;
			}
			storage.executeQuery(query);
			
		}
	}
}
