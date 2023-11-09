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
package com.shinoow.abyssalcraft.common.items;

import java.util.Set;

import com.google.common.collect.Sets;
import com.shinoow.abyssalcraft.api.block.ACBlocks;
import com.shinoow.abyssalcraft.common.blocks.BlockACStone;
import com.shinoow.abyssalcraft.common.blocks.BlockACStone.EnumStoneType;
import com.shinoow.abyssalcraft.common.blocks.IngotBlock;
import com.shinoow.abyssalcraft.common.blocks.IngotBlock.EnumIngotType;
import com.shinoow.abyssalcraft.init.BlockHandler;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

public class ItemEthaxiumPickaxe extends ItemACPickaxe {

	private static Set<Block> effectiveBlocks = Sets.newHashSet(ACBlocks.ethaxium_brick, ACBlocks.ethaxium_pillar, ACBlocks.ethaxium_brick_fence, ACBlocks.ethaxium_brick_slab, BlockHandler.ethaxiumslab2,
			ACBlocks.ethaxium_brick_stairs, ACBlocks.materializer, ACBlocks.dark_ethaxium_brick, ACBlocks.dark_ethaxium_pillar, ACBlocks.dark_ethaxium_brick_stairs, ACBlocks.dark_ethaxium_brick_slab,
			BlockHandler.darkethaxiumslab2, ACBlocks.dark_ethaxium_brick_fence);

	public ItemEthaxiumPickaxe(ToolMaterial mat, String name)
	{
		super(mat, name, 8, TextFormatting.AQUA);
	}

	@Override
	public float getDestroySpeed(ItemStack stack, IBlockState state)
	{
		if(effectiveBlocks.contains(state.getBlock()) || state == ACBlocks.ingot_block.getDefaultState().withProperty(IngotBlock.TYPE, EnumIngotType.ETHAXIUM)
				|| state == ACBlocks.stone.getDefaultState().withProperty(BlockACStone.TYPE, EnumStoneType.ETHAXIUM))
			return efficiency * 10;
		if (state.getBlock().isToolEffective("pickaxe", state))
			return efficiency;
		return super.getDestroySpeed(stack, state);
	}
}
