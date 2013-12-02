package org.pilercrane.model;

import org.pilercrane.exception.MovingException;

public class StoragePosition {
	private int rack = 0;	//Номер стеллажа
	private int shelf = 0;	//Номер полки
	private int cell = 0;	//Номер ячейки
	
	private Storage storage;

	public StoragePosition(Storage storage) {
		this.storage = storage;
	}

	public int getRack() {
		return rack;
	}

	public void setRack(int rack) throws MovingException {
		if(rack<0) {
			throw new MovingException("number of rack can't be under zero");
		} else if(rack > storage.getRacks()) {
			throw new MovingException("number of rack is too large");
		}
		this.rack = rack;
	}

	public int getShelf() {
		return shelf;
	}

	public void setShelf(int shelf) throws MovingException {
		if(shelf<0) {
			throw new MovingException("number of shelf can't be under zero");
		} else if(shelf > storage.getShelves()) {
			throw new MovingException("number of shelf is too large");
		}
		this.shelf = shelf;
	}

	public int getCell() {
		return cell;
	}

	public void setCell(int cell) throws MovingException {
		if(cell<0) {
			throw new MovingException("number of cell can't be under zero");
		} else if(cell > storage.getShelves()) {
			throw new MovingException("number of cell is too large");
		}
		this.cell = cell;
	}
	
	
	
	
	
}
