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
package com.shinoow.abyssalcraft.common.entity;

import com.shinoow.abyssalcraft.api.entity.IOmotholEntity;
import com.shinoow.abyssalcraft.api.item.ACItems;
import com.shinoow.abyssalcraft.common.entity.ai.EntityAIWorship;
import com.shinoow.abyssalcraft.lib.ACConfig;
import com.shinoow.abyssalcraft.lib.ACSounds;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityRemnantTrader extends EntityMob implements IOmotholEntity {

	public int timer;

	public EntityRemnantTrader(World worldIn) {
		super(worldIn);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(3, new EntityAIAttackMelee(this, 0.35D, false));
		tasks.addTask(4, new EntityAIOpenDoor(this, true));
		tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.35D));
		tasks.addTask(6, new EntityAIWander(this, 0.35D));
		tasks.addTask(7, new EntityAITempt(this, 0.5D, ACItems.token_of_jzahar, false));
		tasks.addTask(8, new EntityAILookIdle(this));
		tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(8, new EntityAIWatchClosest(this, EntityRemnant.class, 8.0F));
		tasks.addTask(8, new EntityAIWatchClosest(this, EntityGatekeeperMinion.class, 8.0F));
		tasks.addTask(8, new EntityAIWatchClosest(this, EntityRemnantTrader.class, 8.0F));
		tasks.addTask(9, new EntityAIWorship(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		//		targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLivingBase.class, 20, true, false, entity -> entity.getClass() == target));
		setSize(0.6F, 1.95F);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();

		getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(64.0D);
		getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.2D);
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ACConfig.hardcoreMode ? 100.0D : 50.0D);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(ACConfig.hardcoreMode ? 20.0D: 10.0D);
	}

	@Override
	public boolean processInteract(EntityPlayer par1EntityPlayer, EnumHand hand)
	{
		if(isEntityAlive() && !par1EntityPlayer.isSneaking()) {
			timer = 100;
			playSound(ACSounds.remnant_scream, 3F, 1F);
		}

		return super.processInteract(par1EntityPlayer, hand);
	}

	@Override
	protected float getSoundPitch()
	{
		return rand.nextInt(10) == 0 ? 0.2F : super.getSoundPitch();
	}


	@Override
	public String getName()
	{
		return TextFormatting.ITALIC + super.getName() + TextFormatting.RESET;
	}

	@Override
	public void onLivingUpdate(){
		super.onLivingUpdate();
		if(timer > 0)
			timer--;
	}

	@Override
	public boolean isPotionApplicable(PotionEffect potioneffectIn) {
		if(potioneffectIn.getPotion() == MobEffects.POISON)
			return false;
		return super.isPotionApplicable(potioneffectIn);
	}

	@Override
	protected SoundEvent getAmbientSound()
	{
		return SoundEvents.ENTITY_VILLAGER_AMBIENT;
	}

	@Override
	protected SoundEvent getDeathSound()
	{
		return ACSounds.shadow_death;
	}
}
