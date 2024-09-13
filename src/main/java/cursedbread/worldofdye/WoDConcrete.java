package cursedbread.worldofdye;

import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class WoDConcrete extends Block {

	public WoDConcrete(String key, int id, Material material) {
		super(key, id, material);
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		return new ItemStack[]{new ItemStack(this, 1, meta)};
	}

	private static final IconCoordinate[] textures_nnd = new IconCoordinate[] {
		TextureRegistry.getTexture("worldofdye:block/concrete_crimson"),
		TextureRegistry.getTexture("worldofsye:block/concrete_maroon"),
		TextureRegistry.getTexture("worldofsye:block/concrete_ash_gray"),
		TextureRegistry.getTexture("worldofsye:block/concrete_olive"),
		TextureRegistry.getTexture("worldofsye:block/concrete_ochre"),
		TextureRegistry.getTexture("worldofsye:block/concrete_buff"),
		TextureRegistry.getTexture("worldofsye:block/concrete_verdigris"),
		TextureRegistry.getTexture("worldofsye:block/concrete_light_yellow"),
		TextureRegistry.getTexture("worldofsye:block/concrete_indigo"),
		TextureRegistry.getTexture("worldofsye:block/concrete_xanthic"),
		TextureRegistry.getTexture("worldofsye:block/concrete_cinnamon"),
		TextureRegistry.getTexture("worldofsye:block/concrete_navy_blue"),
		TextureRegistry.getTexture("worldofsye:block/concrete_royal_purple"),
		TextureRegistry.getTexture("worldofsye:block/concrete_viridian")
	};

	@Override
	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
		return textures_nnd[data];
	}

}
