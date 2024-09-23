package cursedbread.worldofdye;


import cursedbread.worldofdye.models.*;
import luke.color.ColorItems;
import luke.color.block.BlockConcrete;
import luke.color.blockmodel.BlockModelConcretePainted;
import luke.color.blockmodel.BlockModelOrangeBed;
import net.minecraft.client.render.block.model.BlockModelSeat;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockBed;
import net.minecraft.core.block.BlockSeat;
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

	public static Block concreteCrimson;
	public static Block concreteMaroon;
	public static Block concreteAshGray;
	public static Block concreteOlive;
	public static Block concreteOchre;
	public static Block concreteBuff;
	public static Block concreteVerdigris;
	public static Block concreteLightYellow;
	public static Block concreteIndigo;
	public static Block concreteXanthic;
	public static Block concreteCinnamon;
	public static Block concreteNavyBlue;
	public static Block concreteRoyalPurple;
	public static Block concreteViridian;

	public static Block concretePowderCrimson;
	public static Block concretePowderMaroon;
	public static Block concretePowderAshGray;
	public static Block concretePowderOlive;
	public static Block concretePowderOchre;
	public static Block concretePowderBuff;
	public static Block concretePowderVerdigris;
	public static Block concretePowderLightYellow;
	public static Block concretePowderIndigo;
	public static Block concretePowderXanthic;
	public static Block concretePowderCinnamon;
	public static Block concretePowderNavyBlue;
	public static Block concretePowderRoyalPurple;
	public static Block concretePowderViridian;

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
		BlockBuilder powder = new BlockBuilder(WoDMain.MOD_ID)
			.setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
			.setHardness(0.5f)
			.setResistance(0.5f)
			.setTags(BlockTags.MINEABLE_BY_SHOVEL);

		BlockBuilder bed = new BlockBuilder(WoDMain.MOD_ID)
			.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
			.setHardness(0.2f)
			.setResistance(1.0f)
			.setUseInternalLight()
			.setVisualUpdateOnMetadata()
			.setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU);

		BlockBuilder concrete = new BlockBuilder(WoDMain.MOD_ID)
			.setHardness(5.0f)
			.setResistance(25.0f)
			.setBlockModel(BlockModelConcretePainted::new)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		//powder

		concretePowderCrimson = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_crimson"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.crimson", WoDMain.blockId++,0));

		concretePowderMaroon = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_maroon"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.maroon", WoDMain.blockId++,1));

		concretePowderAshGray = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_ash_gray"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.ashgray", WoDMain.blockId++,2));

		concretePowderOlive = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_olive"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.olive", WoDMain.blockId++,3));

		concretePowderOchre = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_ochre"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.ochre", WoDMain.blockId++,4));

		concretePowderBuff = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_buff"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.buff", WoDMain.blockId++,5));

		concretePowderVerdigris = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_verdigris"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.verdigris", WoDMain.blockId++,6));

		concretePowderLightYellow = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_light_yellow"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.lightyellow", WoDMain.blockId++,7));

		concretePowderIndigo = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_indigo"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.indigo", WoDMain.blockId++,8));

		concretePowderXanthic = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_xanthic"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.xanthic", WoDMain.blockId++,9));

		concretePowderCinnamon = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_cinnamon"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.cinnamon", WoDMain.blockId++,10));

		concretePowderNavyBlue = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_navy_blue"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.navyblue", WoDMain.blockId++,11));

		concretePowderRoyalPurple = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_royal_purple"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.royalpurple", WoDMain.blockId++,12));

		concretePowderViridian = powder
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/powder_viridian"))
			.build(new cursedbread.worldofdye.WoDPowder("concrete.powder.viridian", WoDMain.blockId++,13));

		//concrete

		concreteCrimson = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_crimson"))
			.build(new Block("concrete.crimson", WoDMain.blockId++, Material.stone));
		concreteMaroon = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_maroon"))
			.build(new Block("concrete.maroon", WoDMain.blockId++, Material.stone));
		concreteAshGray = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_ash_gray"))
			.build(new Block("concrete.ashgray", WoDMain.blockId++, Material.stone));
		concreteOlive = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_olive"))
			.build(new Block("concrete.olive", WoDMain.blockId++, Material.stone));
		concreteOchre = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_ochre"))
			.build(new Block("concrete.ochre", WoDMain.blockId++, Material.stone));
		concreteBuff = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_buff"))
			.build(new Block("concrete.buff", WoDMain.blockId++, Material.stone));
		concreteVerdigris = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_verdigris"))
			.build(new Block("concrete.verdigris", WoDMain.blockId++, Material.stone));
		concreteLightYellow = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_light_yellow"))
			.build(new Block("concrete.lightyellow", WoDMain.blockId++, Material.stone));
		concreteIndigo = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_indigo"))
			.build(new Block("concrete.indigo", WoDMain.blockId++, Material.stone));
		concreteXanthic = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_xanthic"))
			.build(new Block("concrete.xanthic", WoDMain.blockId++, Material.stone));
		concreteCinnamon = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_cinnamon"))
			.build(new Block("concrete.cinnamon", WoDMain.blockId++, Material.stone));
		concreteNavyBlue = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_navy_blue"))
			.build(new Block("concrete.navyblue", WoDMain.blockId++, Material.stone));
		concreteRoyalPurple = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_royal_purple"))
			.build(new Block("concrete.royalpurple", WoDMain.blockId++, Material.stone));
		concreteViridian = concrete
			.setBlockModel(block -> new BlockModelStandard<>(block).withTextures("worldofdye:block/concrete_viridian"))
			.build(new Block("concrete.viridian", WoDMain.blockId++, Material.stone));

		//beds

		bedCrimson = bed
			.setBlockModel(BlockModelCrimsonBed::new)
			.build(new BlockBed("bed.crimson", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedCrimson)};
				}
			});
		bedMaroon = bed
			.setBlockModel(BlockModelMaroonBed::new)
			.build(new BlockBed("bed.maroon", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedMaroon)};
				}
			});
		bedAshGray = bed
			.setBlockModel(BlockModelAshGrayBed::new)
			.build(new BlockBed("bed.ashgray", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedAshGray)};
				}
			});
		bedOlive = bed
			.setBlockModel(BlockModelOliveBed::new)
			.build(new BlockBed("bed.olive", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedOlive)};
				}
			});
		bedOchre = bed
			.setBlockModel(BlockModelOchreBed::new)
			.build(new BlockBed("bed.ochre", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedOchre)};
				}
			});
		bedBuff = bed
			.setBlockModel(BlockModelBuffBed::new)
			.build(new BlockBed("bed.buff", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedBuff)};
				}
			});
		bedVerdigris = bed
			.setBlockModel(BlockModelVerdigrisBed::new)
			.build(new BlockBed("bed.verdigris", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedVerdigris)};
				}
			});
		bedLightYellow = bed
			.setBlockModel(BlockModelLightYellowBed::new)
			.build(new BlockBed("bed.lightyellow", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedLightYellow)};
				}
			});
		bedIndigo = bed
			.setBlockModel(BlockModelIndigoBed::new)
			.build(new BlockBed("bed.indigo", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedIndigo)};
				}
			});
		bedXanthic = bed
			.setBlockModel(BlockModelXanthicBed::new)
			.build(new BlockBed("bed.xanthic", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedXanthic)};
				}
			});
		bedCinnamon = bed
			.setBlockModel(BlockModelCinnamonBed::new)
			.build(new BlockBed("bed.cinnamon", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedCinnamon)};
				}
			});
		bedNavyBlue = bed
			.setBlockModel(BlockModelNavyBlueBed::new)
			.build(new BlockBed("bed.navyblue", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedNavyBlue)};
				}
			});
		bedRoyalPurple = bed
			.setBlockModel(BlockModelRoyalPurpleBed::new)
			.build(new BlockBed("bed.royalpurple", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedRoyalPurple)};
				}
			});
		bedViridian = bed
			.setBlockModel(BlockModelViridianBed::new)
			.build(new BlockBed("bed.viridian", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.bedViridian)};
				}
			});

		//seats

		seatCrimson = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_crimson_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_crimson_foot_front"))
			.build(new BlockSeat("seat.crimson", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatCrimson)};
				}
			});

		seatMaroon = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_maroon_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_maroon_foot_front"))
			.build(new BlockSeat("seat.maroon", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatMaroon)};
				}
			});

		seatAshGray = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_ash_gray_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_ash_gray_foot_front"))
			.build(new BlockSeat("seat.ashgray", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatAshGray)};
				}
			});

		seatOlive = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_olive_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_olive_foot_front"))
			.build(new BlockSeat("seat.olive", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatOlive)};
				}
			});

		seatOchre = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_ochre_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_ochre_foot_front"))
			.build(new BlockSeat("seat.ochre", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatOchre)};
				}
			});

		seatBuff = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_buff_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_buff_foot_front"))
			.build(new BlockSeat("seat.buff", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatBuff)};
				}
			});

		seatVerdigris = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_verdigris_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_verdigris_foot_front"))
			.build(new BlockSeat("seat.verdigris", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatVerdigris)};
				}
			});

		seatLightYellow = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_light_yellow_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_light_yellow_foot_front"))
			.build(new BlockSeat("seat.lightyellow", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatLightYellow)};
				}
			});

		seatIndigo = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_indigo_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_indigo_foot_front"))
			.build(new BlockSeat("seat.indigo", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatIndigo)};
				}
			});

		seatXanthic = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_xanthic_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_xanthic_foot_front"))
			.build(new BlockSeat("seat.xanthic", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatXanthic)};
				}
			});

		seatCinnamon = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_cinnamon_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_cinnamon_foot_front"))
			.build(new BlockSeat("seat.cinnamon", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatCinnamon)};
				}
			});

		seatNavyBlue = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_navy_blue_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_navy_blue_foot_front"))
			.build(new BlockSeat("seat.navyblue", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatNavyBlue)};
				}
			});

		seatRoyalPurple = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_royal_purple_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_royal_purple_foot_front"))
			.build(new BlockSeat("seat.royalpurple", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatRoyalPurple)};
				}
			});

		seatViridian = bed
			.setBlockModel(block -> new BlockModelSeat<>(block).withTextures("worldofdye:block/seat/seat_viridian_top", "minecraft:block/planks_oak", "worldofdye:block/bed/bed_viridian_foot_front"))
			.build(new BlockSeat("seat.viridian", WoDMain.blockId++) {
				public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
					return new ItemStack[]{new ItemStack(WoDItems.seatViridian)};
				}
			});
	}

}
