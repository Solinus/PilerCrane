package org.pilercrane.model;

import org.pilercrane.exception.MovingException;

public class PilerCrane {
	/**
	 * ��������� �����
	 */
	private StoragePosition position;
	
	private Storage storage; 	//�����, � �������� ���������� ����
	
	public PilerCrane(Storage storage) {
		this.storage = storage;
		this.position = new StoragePosition(storage);
	}
	
	public void moveTo(int rack, int shelf, int cell) throws MovingException {
		this.position.setRack(rack);
		this.position.setShelf(shelf);
		this.position.setCell(cell);
	}
	
	
	int boxesLoaded;	//���������� ����� �� �����
}
