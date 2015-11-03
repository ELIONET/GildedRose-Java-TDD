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
		Item copyItem = item;
		copyItem.setQuality(3);
		copyItem.setSellIn(3199);
		GildedRose.updateItem(item);
		item.setQuality(item.getQuality()-1);
		item.setSellIn(item.getSellIn()-1);
		assertEquals(item, copyItem);
	}

}