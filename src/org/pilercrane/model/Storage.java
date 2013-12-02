package org.pilercrane.model;

public class Storage {
	private final int racks = 10;
	private final int shelves = 20;
	private final int cellsInShelf=100;
	Cell[][][] cells = new Cell[racks][shelves][cellsInShelf];
	
	PilerCrane crane = new PilerCrane(this);

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
}
