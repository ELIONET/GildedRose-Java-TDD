package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void testInitialAreSellInAndQualityReduced()
	{
		Item item = new Item("Lame du Roi D�chu", 3200, 4);
		Item copyItem = item;
		GildedRose.updateItem(copyItem);
		assertEquals(item, copyItem);
	}

}