/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2024 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.common.structures.overworld;
import java.util.Random;

import com.shinoow.abyssalcraft.api.block.ACBlocks;
import com.shinoow.abyssalcraft.lib.ACConfig;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AChouse1 extends StructureDarklandsBase {

	@Override
	public boolean generate(World world, Random random, BlockPos pos) {

		pos = pos.add(-3, 1, -4);

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		if(ACConfig.darkstone_brick_slab)
			world.setBlockState(new BlockPos(i + 0, j + 0, k + 1), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
		world.setBlockState(new BlockPos(i + 0, j + 0, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 0, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 0, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 0, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 0, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 0, k + 7), getBrick(random), 2);
		if(ACConfig.darkstone_brick_slab) {
			world.setBlockState(new BlockPos(i + 0, j + 0, k + 8), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 1), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
		}
		world.setBlockState(new BlockPos(i + 0, j + 1, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 1, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 1, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 1, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 1, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 1, k + 7), getBrick(random), 2);
		if(ACConfig.darkstone_brick_slab) {
			world.setBlockState(new BlockPos(i + 0, j + 1, k + 8), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
			world.setBlockState(new BlockPos(i + 0, j + 2, k + 1), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
		}
		world.setBlockState(new BlockPos(i + 0, j + 2, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 2, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 2, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 2, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 2, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 2, k + 7), getBrick(random), 2);
		if(ACConfig.darkstone_brick_slab) {
			world.setBlockState(new BlockPos(i + 0, j + 2, k + 8), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
			world.setBlockState(new BlockPos(i + 0, j + 3, k + 1), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
		}
		world.setBlockState(new BlockPos(i + 0, j + 3, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 3, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 3, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 3, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 3, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 3, k + 7), getBrick(random), 2);
		if(ACConfig.darkstone_brick_slab) {
			world.setBlockState(new BlockPos(i + 0, j + 3, k + 8), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
			world.setBlockState(new BlockPos(i + 0, j + 4, k + 1), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
		}
		world.setBlockState(new BlockPos(i + 0, j + 4, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 4, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 4, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 4, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 4, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 0, j + 4, k + 7), getBrick(random), 2);
		if(ACConfig.darkstone_brick_slab)
			world.setBlockState(new BlockPos(i + 0, j + 4, k + 8), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
		world.setBlockState(new BlockPos(i + 1, j + 0, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 0, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 0, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 0, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 0, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 0, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 0, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 0, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 1, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 1, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 1, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 1, k + 4), Blocks.AIR.getDefaultState(), 2);
		if(ACConfig.darkstone_brick_stairs)
			world.setBlockState(new BlockPos(i + 1, j + 1, k + 5), ACBlocks.darkstone_brick_stairs.getStateFromMeta(2), 2);
		world.setBlockState(new BlockPos(i + 1, j + 1, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 1, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 1, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 2, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 2, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 2, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 2, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 2, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 2, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 2, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 7), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 4, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 4, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 4, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 4, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 4, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 4, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 4, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 1, j + 4, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 0, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 0, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 0, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 0, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 0, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 0, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 0, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 0, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 1, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 1, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 1, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 1, k + 4), Blocks.AIR.getDefaultState(), 2);
		if(ACConfig.darkstone_brick_stairs)
			world.setBlockState(new BlockPos(i + 2, j + 1, k + 5), ACBlocks.darkstone_brick_stairs.getStateFromMeta(2), 2);
		world.setBlockState(new BlockPos(i + 2, j + 1, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 1, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 1, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 2, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 2, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 2, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 2, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 2, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 2, k + 7), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 2, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 7), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 4, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 4, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 4, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 4, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 4, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 4, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 4, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 2, j + 4, k + 8), getBrick(random), 2);
		if(ACConfig.darkstone_brick_stairs)
			world.setBlockState(new BlockPos(i + 3, j + 0, k + 0), ACBlocks.darkstone_brick_stairs.getStateFromMeta(2), 2);
		world.setBlockState(new BlockPos(i + 3, j + 0, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 3, j + 0, k + 2), ACBlocks.stone.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 0, k + 3), ACBlocks.stone.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 0, k + 4), ACBlocks.stone.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 0, k + 5), ACBlocks.stone.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 0, k + 6), ACBlocks.stone.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 0, k + 7), ACBlocks.stone.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 0, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 3, j + 1, k + 1), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 1, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 1, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 1, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 1, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 1, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 1, k + 7), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 1, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 3, j + 2, k + 1), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 2, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 2, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 2, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 2, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 2, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 2, k + 7), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 2, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 1), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 7), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 3, j + 4, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 3, j + 4, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 3, j + 4, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 3, j + 4, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 3, j + 4, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 3, j + 4, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 3, j + 4, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 3, j + 4, k + 8), getBrick(random), 2);
		if(ACConfig.darkstone_brick_stairs)
			world.setBlockState(new BlockPos(i + 4, j + 0, k + 0), ACBlocks.darkstone_brick_stairs.getStateFromMeta(2), 2);
		world.setBlockState(new BlockPos(i + 4, j + 0, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 4, j + 0, k + 2), ACBlocks.stone.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 0, k + 3), ACBlocks.stone.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 0, k + 4), ACBlocks.stone.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 0, k + 5), ACBlocks.stone.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 0, k + 6), ACBlocks.stone.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 0, k + 7), ACBlocks.stone.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 0, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 4, j + 1, k + 1), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 1, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 1, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 1, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 1, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 1, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 1, k + 7), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 1, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 4, j + 2, k + 1), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 2, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 2, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 2, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 2, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 2, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 2, k + 7), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 2, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 1), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 7), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 4, j + 4, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 4, j + 4, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 4, j + 4, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 4, j + 4, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 4, j + 4, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 4, j + 4, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 4, j + 4, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 4, j + 4, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 0, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 0, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 0, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 0, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 0, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 0, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 0, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 0, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 1, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 1, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 1, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 1, k + 4), Blocks.AIR.getDefaultState(), 2);
		if(ACConfig.darkstone_brick_stairs)
			world.setBlockState(new BlockPos(i + 5, j + 1, k + 5), ACBlocks.darkstone_brick_stairs.getStateFromMeta(2), 2);
		world.setBlockState(new BlockPos(i + 5, j + 1, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 1, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 1, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 2, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 2, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 2, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 2, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 2, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 2, k + 7), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 2, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 7), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 4, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 4, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 4, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 4, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 4, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 4, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 4, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 5, j + 4, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 0, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 0, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 0, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 0, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 0, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 0, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 0, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 0, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 1, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 1, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 1, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 1, k + 4), Blocks.AIR.getDefaultState(), 2);
		if(ACConfig.darkstone_brick_stairs)
			world.setBlockState(new BlockPos(i + 6, j + 1, k + 5), ACBlocks.darkstone_brick_stairs.getStateFromMeta(2), 2);
		world.setBlockState(new BlockPos(i + 6, j + 1, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 1, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 1, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 2, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 2, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 2, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 2, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 2, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 2, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 2, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 3, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 3, k + 2), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 3, k + 3), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 3, k + 4), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 3, k + 5), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 3, k + 6), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 3, k + 7), Blocks.AIR.getDefaultState(), 2);
		world.setBlockState(new BlockPos(i + 6, j + 3, k + 8), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 4, k + 1), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 4, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 4, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 4, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 4, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 4, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 4, k + 7), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 6, j + 4, k + 8), getBrick(random), 2);
		if(ACConfig.darkstone_brick_slab)
			world.setBlockState(new BlockPos(i + 7, j + 0, k + 1), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
		world.setBlockState(new BlockPos(i + 7, j + 0, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 0, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 0, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 0, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 0, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 0, k + 7), getBrick(random), 2);
		if(ACConfig.darkstone_brick_slab) {
			world.setBlockState(new BlockPos(i + 7, j + 0, k + 8), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
			world.setBlockState(new BlockPos(i + 7, j + 1, k + 1), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
		}
		world.setBlockState(new BlockPos(i + 7, j + 1, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 1, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 1, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 1, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 1, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 1, k + 7), getBrick(random), 2);
		if(ACConfig.darkstone_brick_slab) {
			world.setBlockState(new BlockPos(i + 7, j + 1, k + 8), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
			world.setBlockState(new BlockPos(i + 7, j + 2, k + 1), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
		}
		world.setBlockState(new BlockPos(i + 7, j + 2, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 2, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 2, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 2, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 2, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 2, k + 7), getBrick(random), 2);
		if(ACConfig.darkstone_brick_slab) {
			world.setBlockState(new BlockPos(i + 7, j + 2, k + 8), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
			world.setBlockState(new BlockPos(i + 7, j + 3, k + 1), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
		}
		world.setBlockState(new BlockPos(i + 7, j + 3, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 3, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 3, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 3, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 3, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 3, k + 7), getBrick(random), 2);
		if(ACConfig.darkstone_brick_slab) {
			world.setBlockState(new BlockPos(i + 7, j + 3, k + 8), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 1), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
		}
		world.setBlockState(new BlockPos(i + 7, j + 4, k + 2), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 4, k + 3), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 4, k + 4), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 4, k + 5), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 4, k + 6), getBrick(random), 2);
		world.setBlockState(new BlockPos(i + 7, j + 4, k + 7), getBrick(random), 2);
		if(ACConfig.darkstone_brick_slab)
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 8), ACBlocks.darkstone_brick_slab.getStateFromMeta(5), 2);
		world.setBlockState(new BlockPos(i + 1, j + 2, k + 7), Blocks.REDSTONE_TORCH.getStateFromMeta(5), 2);
		world.setBlockState(new BlockPos(i + 2, j + 2, k + 2), Blocks.REDSTONE_TORCH.getStateFromMeta(3), 2);
		world.setBlockState(new BlockPos(i + 5, j + 2, k + 2), Blocks.REDSTONE_TORCH.getStateFromMeta(3), 2);
		world.setBlockState(new BlockPos(i + 6, j + 2, k + 7), Blocks.REDSTONE_TORCH.getStateFromMeta(5), 2);

		return true;
	}
}
