package cursedbread.worldofdye.models;

import net.minecraft.client.render.block.model.BlockModelBed;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;

public class BlockModelOliveBed<T extends Block> extends BlockModelBed<T> {
	public BlockModelOliveBed(Block block) {
		super(block);
		this.atlasIndices[0] = TextureRegistry.getTexture("worldofdye:block/bed/bed_olive_foot_front");
		this.atlasIndices[1] = TextureRegistry.getTexture("worldofdye:block/bed/bed_olive_foot_side");
		this.atlasIndices[2] = TextureRegistry.getTexture("worldofdye:block/bed/bed_olive_foot_top");
		this.atlasIndices[3] = TextureRegistry.getTexture("minecraft:block/bed_head_front");
		this.atlasIndices[4] = TextureRegistry.getTexture("worldofdye:block/bed/bed_olive_head_side");
		this.atlasIndices[5] = TextureRegistry.getTexture("worldofdye:block/bed/bed_olive_head_top");
	}
}
