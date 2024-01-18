package com.hbm.items.food;

import com.hbm.explosion.ExplosionNukeSmall;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWaffle extends ItemFood {

	public ItemWaffle(int heal, boolean canWolfEat) {
		super(heal, canWolfEat);
	}
	
	@Override
    	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
			
		if(!world.isRemote)
			ExplosionNukeSmall.explode(world, player.posX, player.posY + 0.5, player.posZ, ExplosionNukeSmall.PARAMS_MEDIUM);
  	  }

	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean bool)
	{
		list.add("This shit explodes u fuckwits");
	}

}
