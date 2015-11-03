package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void testInitialAreSellInAndQualityReduced()
	{
		Item item = new Item("Lame du Roi Déchu", 3200, 4);
		GildedRose.updateItem(item);
		assertEquals(item.getQuality(), 3);
		assertEquals(item.getSellIn(), 3199);
	}

	@Test
	public void isQualityReducedByTwoWhenSellInIsBelowZero()
	{
		Item item = new Item("Free Hugs", 0, 1);
		GildedRose.updateItem(item);
		if(item.getSellIn()<0)
			item.setQuality(item.getQuality()-1);
		assertEquals(item.getQuality(), -1);
		assertEquals(item.getSellIn(), -1);
		
	}
}