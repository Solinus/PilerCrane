package org.pilercrane.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.pilercrane.exception.MovingException;
import org.pilercrane.model.PilerCrane;
import org.pilercrane.model.Storage;

public class CraneMovingTest {
	@Test
	public void simpleMoveTest() throws MovingException {
		Storage storage = new Storage();
		PilerCrane crane = storage.getCrane();
		crane.moveTo(10, 20, 30);
		assertEquals(10,crane.getPosition().getRack());
		assertEquals(20,crane.getPosition().getShelf());
		assertEquals(30,crane.getPosition().getCell());
	}
	
	@Test(expected=MovingException.class)
	public void tooFarMoveTest() throws MovingException {
		Storage storage = new Storage();
		PilerCrane crane = storage.getCrane();
		crane.moveTo(10, 20, 300);
	}

}
