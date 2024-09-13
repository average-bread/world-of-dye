package cursedbread.worldofdye;


import luke.color.ColorItems;
import luke.color.block.BlockConcrete;
import luke.color.block.BlockPowder;
import luke.color.blockmodel.BlockModelConcretePainted;
import luke.color.blockmodel.BlockModelOrangeBed;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockBed;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.BlockBuilder;

import static luke.color.ColorMod.MOD_ID;

public class WoDBlocks {

	public static Block concrete;

	public static Block concredePowderCrimson;
	public static Block concredePowderMaroon;
	public static Block concredePowderAshGray;
	public static Block concredePowderOlive;
	public static Block concredePowderOchre;
	public static Block concredePowderBuff;
	public static Block concredePowderVerdigris;
	public static Block concredePowderLightYellow;
	public static Block concredePowderIndigo;
	public static Block concredePowderXanthic;
	public static Block concredePowderCinnamon;
	public static Block concredePowderNavyBlue;
	public static Block concredePowderRoyalPurple;
	public static Block concredePowderViridian;

	public static Block bedCrimson;
	public static Block bedMaroon;
	public static Block bedAshGray;
	public static Block bedOlive;
	public static Block bedOchre;
	public static Block bedBuff;
	public static Block bedVerdigris;
	public static Block bedLightYellow;
	public static Block bedIndigo;
	public static Block bedXanthic;
	public static Block bedCinnamon;
	public static Block bedNavyBlue;
	public static Block bedRoyalPurple;
	public static Block bedViridian;

	public static Block seatCrimson;
	public static Block seatMaroon;
	public static Block seatAshGray;
	public static Block seatOlive;
	public static Block seatOchre;
	public static Block seatBuff;
	public static Block seatVerdigris;
	public static Block seatLightYellow;
	public static Block seatIndigo;
	public static Block seatXanthic;
	public static Block seatCinnamon;
	public static Block seatNavyBlue;
	public static Block seatRoyalPurple;
	public static Block seatViridian;

	public void initializeBlocks() {
		BlockBuilder powder = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
			.setHardness(0.5f)
			.setResistance(0.5f)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL);

		BlockBuilder bed = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
			.setHardness(0.2f)
			.setResistance(1.0f)
			.setUseInternalLight()
			.setVisualUpdateOnMetadata()
			.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU);

		concrete = new BlockBuilder(MOD_ID)
			.setHardness(5.0f)
			.setResistance(25.0f)
			.setBlockModel(BlockModelConcretePainted::new)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.setItemBlock(block -> new ItemBlockPainted(block, false))
			.build(new BlockConcrete("concrete", WoDMain.blockId++, Material.stone));

		concredePowderCrimson = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_crimson"))
			.build(new BlockPowder("concrete.powder.crimson", WoDMain.blockId++,0));

		concredePowderMaroon = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_maroon"))
			.build(new BlockPowder("concrete.powder.maroon", WoDMain.blockId++,1));

		concredePowderAshGray = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_ash_gray"))
			.build(new BlockPowder("concrete.powder.ashgray", WoDMain.blockId++,2));

		concredePowderOlive = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_olive"))
			.build(new BlockPowder("concrete.powder.olive", WoDMain.blockId++,3));

		concredePowderOchre = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_ochre"))
			.build(new BlockPowder("concrete.powder.ochre", WoDMain.blockId++,4));

		concredePowderBuff = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_buff"))
			.build(new BlockPowder("concrete.powder.buff", WoDMain.blockId++,5));

		concredePowderVerdigris = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_verdigris"))
			.build(new BlockPowder("concrete.powder.verdigris", WoDMain.blockId++,6));

		concredePowderLightYellow = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_light_yellow"))
			.build(new BlockPowder("concrete.powder.lightyellow", WoDMain.blockId++,7));

		concredePowderIndigo = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_indigo"))
			.build(new BlockPowder("concrete.powder.indigo", WoDMain.blockId++,8));

		concredePowderXanthic = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_xanthic"))
			.build(new BlockPowder("concrete.powder.xanthic", WoDMain.blockId++,9));

		concredePowderCinnamon = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_cinnamon"))
			.build(new BlockPowder("concrete.powder.cinnamon", WoDMain.blockId++,10));

		concredePowderNavyBlue = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_navy_blue"))
			.build(new BlockPowder("concrete.powder.navyblue", WoDMain.blockId++,11));

		concredePowderRoyalPurple = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_royal_purple"))
			.build(new BlockPowder("concrete.powder.royalpurple", WoDMain.blockId++,12));

		concredePowderViridian = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_viridian"))
			.build(new BlockPowder("concrete.powder.viridian", WoDMain.blockId++,13));

		/*bedCrimson = bed
			.setBlockModel(BlockModelOrangeBed::new)
			.build(new BlockBed("bed.crimson", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(ColorItems.bedCrimson)};
				}
			});*/
	}

}
