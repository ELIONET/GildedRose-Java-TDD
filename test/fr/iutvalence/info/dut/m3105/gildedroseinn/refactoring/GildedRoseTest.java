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
		GildedRose.updateItem(item);
		assertEquals(item.getQuality(), 3);
		assertEquals(item.getSellIn(), 3199);
	}

	@Test
	public void isQualityReducedByTwoWhenSellInIsBelowZero()
	{
		Item item = new Item("Free Hugs", 0, 1);
		GildedRose.updateItem(item);
		//The next test does the following line false.
		//assertEquals(item.getQuality(), -1);
		assertEquals(item.getSellIn(), -1);	
	}
	
	@Test
	public void isQualityAlwaysAboveZero(){
		Item item = new Item("Free Hugs", 0, 1);
		GildedRose.updateItem(item);
		assertEquals(item.getQuality(), 0);
		assertEquals(item.getSellIn(), -1);
	}
	
	@Test
	public void doesAgedBrieQualityIncrease(){
		Item agedBrie = new Item("Holy Aged Brie", 999, 10);
		GildedRose.updateItem(agedBrie);
		assertEquals(agedBrie.getQuality(), 11);
		assertEquals(agedBrie.getSellIn(), 998);
	}
}