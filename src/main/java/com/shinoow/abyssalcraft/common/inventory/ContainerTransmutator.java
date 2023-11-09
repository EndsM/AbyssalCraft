/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2023 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * 
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.common.inventory;

import com.shinoow.abyssalcraft.api.recipe.TransmutatorRecipes;
import com.shinoow.abyssalcraft.common.blocks.tile.TileEntityTransmutator;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerTransmutator extends Container {

	private TileEntityTransmutator tileTransmutator;
	private int lastProcessTime;
	private int lastBurnTime;
	private int lastItemBurnTime;

	public ContainerTransmutator(InventoryPlayer par1InventoryPlayer, TileEntityTransmutator par2TileEntityTransmutator)
	{
		tileTransmutator = par2TileEntityTransmutator;
		addSlotToContainer(new Slot(par2TileEntityTransmutator, 0, 56, 17));
		addSlotToContainer(new Slot(par2TileEntityTransmutator, 1, 56, 53));
		addSlotToContainer(new SlotTransmutator(par1InventoryPlayer.player, par2TileEntityTransmutator, 2, 116, 35));
		int i;

		for (i = 0; i < 3; ++i)
			for (int j = 0; j < 9; ++j)
				addSlotToContainer(new Slot(par1InventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));

		for (i = 0; i < 9; ++i)
			addSlotToContainer(new Slot(par1InventoryPlayer, i, 8 + i * 18, 142));
	}

	@Override
	public void addListener(IContainerListener listener)
	{
		super.addListener(listener);
		listener.sendWindowProperty(this, 0, tileTransmutator.transmutatorProcessTime);
		listener.sendWindowProperty(this, 1, tileTransmutator.transmutatorBurnTime);
		listener.sendWindowProperty(this, 2, tileTransmutator.currentItemBurnTime);
	}

	@Override
	public void detectAndSendChanges()
	{
		super.detectAndSendChanges();

		for (int i = 0; i < listeners.size(); ++i)
		{
			IContainerListener icrafting = listeners.get(i);

			if (lastProcessTime != tileTransmutator.transmutatorProcessTime)
				icrafting.sendWindowProperty(this, 0, tileTransmutator.transmutatorProcessTime);

			if (lastBurnTime != tileTransmutator.transmutatorBurnTime)
				icrafting.sendWindowProperty(this, 1, tileTransmutator.transmutatorBurnTime);

			if (lastItemBurnTime != tileTransmutator.currentItemBurnTime)
				icrafting.sendWindowProperty(this, 2, tileTransmutator.currentItemBurnTime);
		}

		lastProcessTime = tileTransmutator.transmutatorProcessTime;
		lastBurnTime = tileTransmutator.transmutatorBurnTime;
		lastItemBurnTime = tileTransmutator.currentItemBurnTime;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int par1, int par2)
	{
		if (par1 == 0)
			tileTransmutator.transmutatorProcessTime = par2;

		if (par1 == 1)
			tileTransmutator.transmutatorBurnTime = par2;

		if (par1 == 2)
			tileTransmutator.currentItemBurnTime = par2;

		if (par1 == 3)
			tileTransmutator.transmutatorProcessTime = par2;
	}

	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer)
	{
		return tileTransmutator.isUsableByPlayer(par1EntityPlayer);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	{
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = inventorySlots.get(par2);

		if (slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (par2 == 2)
			{
				if (!mergeItemStack(itemstack1, 3, 38, true))
					return ItemStack.EMPTY;

				slot.onSlotChange(itemstack1, itemstack);
			}
			else if (par2 != 1 && par2 != 0)
			{
				if (!TransmutatorRecipes.instance().getTransmutationResult(itemstack1).isEmpty())
				{
					if (!mergeItemStack(itemstack1, 0, 1, false))
						return ItemStack.EMPTY;
				}
				else if (TileEntityTransmutator.isItemFuel(itemstack1))
				{
					if (!mergeItemStack(itemstack1, 1, 2, false))
						return ItemStack.EMPTY;
				}
				else if (par2 >= 3 && par2 < 30)
				{
					if (!mergeItemStack(itemstack1, 30, 38, false))
						return ItemStack.EMPTY;
				}
				else if (par2 >= 30 && par2 < 39 && !mergeItemStack(itemstack1, 3, 29, false))
					return ItemStack.EMPTY;
			}
			else if (!mergeItemStack(itemstack1, 3, 38, false))
				return ItemStack.EMPTY;

			if (itemstack1.isEmpty())
				slot.putStack(ItemStack.EMPTY);
			else
				slot.onSlotChanged();

			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;

			slot.onTake(par1EntityPlayer, itemstack1);
		}

		return itemstack;
	}
}
