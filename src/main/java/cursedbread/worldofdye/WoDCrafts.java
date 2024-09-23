package cursedbread.worldofdye;

import goocraft4evr.nonamedyes.block.ModBlocks;
import goocraft4evr.nonamedyes.item.ModItems;
import luke.color.ColorBlocks;
import luke.color.ColorItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class WoDCrafts implements RecipeEntrypoint {

	public static Block[] nndconcrede = {
		WoDBlocks.concretePowderCrimson,
		WoDBlocks.concretePowderMaroon,
		WoDBlocks.concretePowderAshGray,
		WoDBlocks.concretePowderOlive,
		WoDBlocks.concretePowderOchre,
		WoDBlocks.concretePowderBuff,
		WoDBlocks.concretePowderVerdigris,
		WoDBlocks.concretePowderLightYellow,
		WoDBlocks.concretePowderIndigo,
		WoDBlocks.concretePowderXanthic,
		WoDBlocks.concretePowderCinnamon,
		WoDBlocks.concretePowderNavyBlue,
		WoDBlocks.concretePowderRoyalPurple,
		WoDBlocks.concretePowderViridian,
	};

	public static Item[] nndbed = {
		WoDItems.bedCrimson,
		WoDItems.bedMaroon,
		WoDItems.bedAshGray,
		WoDItems.bedOlive,
		WoDItems.bedOchre,
		WoDItems.bedBuff,
		WoDItems.bedVerdigris,
		WoDItems.bedLightYellow,
		WoDItems.bedIndigo,
		WoDItems.bedXanthic,
		WoDItems.bedCinnamon,
		WoDItems.bedNavyBlue,
		WoDItems.bedRoyalPurple,
		WoDItems.bedViridian,
	};

	public static Item[] nndseat = {
		WoDItems.seatCrimson,
		WoDItems.seatMaroon,
		WoDItems.seatAshGray,
		WoDItems.seatOlive,
		WoDItems.seatOchre,
		WoDItems.seatBuff,
		WoDItems.seatVerdigris,
		WoDItems.seatLightYellow,
		WoDItems.seatIndigo,
		WoDItems.seatXanthic,
		WoDItems.seatCinnamon,
		WoDItems.seatNavyBlue,
		WoDItems.seatRoyalPurple,
		WoDItems.seatViridian,
	};

	@Override
	public void onRecipesReady() {
		RecipeBuilderShaped templatePowder = new RecipeBuilderShaped("worldofdye", new String[]{"DSS", "SSG", "GGG"});
		for (int i = 0; i < 14; i++) {
			templatePowder.addInput('D', new ItemStack(ModItems.dye, 1, i)).addInput('S', Block.sand)
				.addInput('G', Block.gravel)
				.create("concrete_powder_crimson", new ItemStack(nndconcrede[i], 8));
		}
		RecipeBuilderShaped templateBed = new RecipeBuilderShaped("worldofdye", new String[]{"CCW", "PPP"});
		for (int j = 0; j < 14; j++){
			templateBed.addInput('C', Item.cloth)
				.addInput('P', "minecraft:planks")
				.addInput('W', new ItemStack(ModBlocks.wool, 1, j))
				.create("white_bed", new ItemStack(nndbed[j], 1));
		}
		RecipeBuilderShaped templateSeat = new RecipeBuilderShaped("worldofdye", new String[]{"CWC", "P P"});
		for (int k = 0; k < 14; k++){
			templateSeat.addInput('C', Item.cloth)
				.addInput('P', "minecraft:planks")
				.addInput('W', new ItemStack(ModBlocks.wool, 1, k))
				.create("white_seat", new ItemStack(nndseat[k], 1));
		}
	}

	@Override
	public void initNamespaces() {

	}
}
