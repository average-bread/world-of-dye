package cursedbread.worldofdye;

import luke.color.ColorBlocks;
import luke.color.block.BlockPowder;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

public class WoDPowder extends BlockPowder {
	public WoDPowder(String key, int id, int metaID) {
		super(key, id, metaID);
	}

	public void onBlockAdded(World world, int x, int y, int z) {
		world.scheduleBlockUpdate(x, y, z, this.id, this.tickRate());
		int powder = world.getBlockId(x, y, z);
		if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water) {
			world.setBlock(x, y, z, powder-14);
		}

	}
}
