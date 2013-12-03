package org.pilercrane.model;

public class Storage {
	private final int racks = 10;
	private final int shelves = 20;
	private final int cellsInShelf=100;
	Cell[][][] cells = new Cell[racks][shelves][cellsInShelf];
	
	PilerCrane crane = new PilerCrane(this);
	
	public Storage() {
		fillStorage();
	}

	public PilerCrane getCrane() {
		return crane;
	}

	public int getRacks() {
		return racks;
	}

	public int getShelves() {
		return shelves;
	}

	public int getCellsInShelf() {
		return cellsInShelf;
	}
	
	public void executeQuery(String query) {
		System.out.println(query);
	}
	
	private void fillStorage() {
		for(int i = 0;i<racks;i++) {
			for(int j = 0;j<shelves;j++) {
				for(int k = 0;k<cellsInShelf;k++) {
					cells[i][j][k].setBoxes((int) Math.random()*20);  
				}
			}
		}
	}
}
