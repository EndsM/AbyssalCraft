/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2025 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.common.blocks;

import com.shinoow.abyssalcraft.lib.ACTabs;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockCrystalCluster2 extends BlockACBasic {

	public static final PropertyEnum<EnumCrystalType2> TYPE = PropertyEnum.create("type", EnumCrystalType2.class);

	public BlockCrystalCluster2() {
		super(Material.ROCK, 4.0F, 8.0F, SoundType.GLASS);
		setCreativeTab(ACTabs.tabCrystals);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, EnumCrystalType2.TIN));
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return new AxisAlignedBB(0.2F, 0.0F, 0.2F, 0.8F, 0.7F, 0.8F);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@Override
	public String getHarvestTool(IBlockState state)
	{
		return "pickaxe";
	}

	@Override
	public int getHarvestLevel(IBlockState state)
	{
		return 3;
	}

	@Override
	public int damageDropped (IBlockState state) {
		return state.getValue(TYPE).getMetadata();
	}

	@Override
	public void getSubBlocks(CreativeTabs par2CreativeTabs, NonNullList<ItemStack> par3List) {
		for(int i = 0; i < EnumCrystalType2.values().length; i++)
			par3List.add(new ItemStack(this, 1, i));
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPE, EnumCrystalType2.byMetadata(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(TYPE).getMetadata();
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer.Builder(this).add(TYPE).build();
	}

	public enum EnumCrystalType2 implements IStringSerializable
	{
		TIN(0, "tin"),
		COPPER(1, "copper"),
		SILICON(2, "silicon"),
		MAGNESIUM(3, "magnesium"),
		ALUMINIUM(4, "aluminium"),
		SILICA(5, "silica"),
		ALUMINA(6, "alumina"),
		MAGNESIA(7, "magnesia"),
		ZINC(8, "zinc"),
		CALCIUM(9, "calcium"),
		BERYLLIUM(10, "beryllium"),
		BERYL(11, "beryl");

		private static final EnumCrystalType2[] META_LOOKUP = new EnumCrystalType2[values().length];
		private final int meta;
		private final String name;

		private EnumCrystalType2(int meta, String name)
		{
			this.meta = meta;
			this.name = name;
		}

		public int getMetadata()
		{
			return meta;
		}

		@Override
		public String toString()
		{
			return name;
		}

		public static EnumCrystalType2 byMetadata(int meta)
		{
			if (meta < 0 || meta >= META_LOOKUP.length)
				meta = 0;

			return META_LOOKUP[meta];
		}

		@Override
		public String getName()
		{
			return name;
		}

		static
		{
			for (EnumCrystalType2 enumtype : values())
				META_LOOKUP[enumtype.getMetadata()] = enumtype;
		}
	}
}
