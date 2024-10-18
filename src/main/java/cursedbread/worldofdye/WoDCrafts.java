package cursedbread.worldofdye;

import goocraft4evr.nonamedyes.NoNameDyes;
import goocraft4evr.nonamedyes.block.ModBlocks;
import goocraft4evr.nonamedyes.crafting.RecipeBuilderBleacher;
import goocraft4evr.nonamedyes.crafting.RecipeEntryBleacher;
import goocraft4evr.nonamedyes.item.ModItems;
import luke.color.ColorBlocks;
import luke.color.ColorItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static goocraft4evr.nonamedyes.crafting.ModRecipes.*;
import static net.minecraft.core.data.registry.Registries.RECIPE_TYPES;

public class WoDCrafts implements RecipeEntrypoint {

	public static RecipeNamespace RN;
	public static RecipeGroup<RecipeEntryBleacher> BLEACHER;

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
		WoDBlocks.concretePowderViridian
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
		WoDItems.bedViridian
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
		WoDItems.seatViridian
	};

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(WoDMain.MOD_ID);
		RecipeBuilder.getRecipeNamespace(WoDMain.MOD_ID);

		RN = new RecipeNamespace();
		WORKBENCH = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.workbench)));
		FURNACE = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.furnaceStoneActive)));
		BLAST_FURNACE = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.furnaceBlastActive)));
		TROMMEL = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.trommelActive)));
		BLEACHER = new RecipeGroup<>(new RecipeSymbol(new ItemStack(ModBlocks.bleacher)));

		Registries.RECIPES.register(NoNameDyes.MOD_ID, RN);
		RN.register("furnace", FURNACE);
		RN.register("blast_furnace", BLAST_FURNACE);
		RN.register("workbench", WORKBENCH);
		RN.register("bleacher", BLEACHER);
		RN.register("trommel", TROMMEL);
		RECIPE_TYPES.register("nonamedyes:bleaching", RecipeEntryBleacher.class);

		Registries.ITEM_GROUPS.register("worldofdye:powder", Registries.stackListOf(
			ColorBlocks.concretePowderWhite, ColorBlocks.concretePowderOrange, ColorBlocks.concretePowderMagenta,
			ColorBlocks.concretePowderLightblue, ColorBlocks.concretePowderYellow, ColorBlocks.concretePowderLime,
			ColorBlocks.concretePowderPink, ColorBlocks.concretePowderGray, ColorBlocks.concretePowderSilver,
			ColorBlocks.concretePowderCyan, ColorBlocks.concretePowderPurple, ColorBlocks.concretePowderBlue,
			ColorBlocks.concretePowderBrown, ColorBlocks.concretePowderGreen, ColorBlocks.concretePowderRed,
			ColorBlocks.concretePowderBlack, WoDBlocks.concretePowderCrimson, WoDBlocks.concretePowderMaroon,
			WoDBlocks.concretePowderAshGray, WoDBlocks.concretePowderOlive, WoDBlocks.concretePowderOchre,
			WoDBlocks.concretePowderBuff, WoDBlocks.concretePowderVerdigris, WoDBlocks.concretePowderLightYellow,
			WoDBlocks.concretePowderIndigo, WoDBlocks.concretePowderXanthic, WoDBlocks.concretePowderCinnamon,
			WoDBlocks.concretePowderNavyBlue, WoDBlocks.concretePowderRoyalPurple, WoDBlocks.concretePowderViridian
		));
		Registries.ITEM_GROUPS.register("worldofdye:concrete", Registries.stackListOf(
			ColorBlocks.concrete, WoDBlocks.concreteCrimson, WoDBlocks.concreteMaroon,
			WoDBlocks.concreteAshGray, WoDBlocks.concreteOlive, WoDBlocks.concreteOchre,
			WoDBlocks.concreteBuff, WoDBlocks.concreteVerdigris, WoDBlocks.concreteLightYellow,
			WoDBlocks.concreteIndigo, WoDBlocks.concreteXanthic, WoDBlocks.concreteCinnamon,
			WoDBlocks.concreteNavyBlue, WoDBlocks.concreteRoyalPurple, WoDBlocks.concreteViridian
		));
		Registries.ITEM_GROUPS.register("worldofdye:bed", Registries.stackListOf(
			ColorItems.bedWhite, ColorItems.bedOrange, ColorItems.bedMagenta,
			ColorItems.bedLightblue, ColorItems.bedYellow, ColorItems.bedLime,
			ColorItems.bedPink, ColorItems.bedGray, ColorItems.bedSilver,
			ColorItems.bedCyan, ColorItems.bedPurple, ColorItems.bedBlue,
			ColorItems.bedBrown, ColorItems.bedGreen, Item.bed,
			ColorItems.bedBlack, WoDItems.bedCrimson, WoDItems.bedMaroon,
			WoDItems.bedAshGray, WoDItems.bedOlive, WoDItems.bedOchre,
			WoDItems.bedBuff, WoDItems.bedVerdigris, WoDItems.bedLightYellow,
			WoDItems.bedIndigo, WoDItems.bedXanthic, WoDItems.bedCinnamon,
			WoDItems.bedNavyBlue, WoDItems.bedRoyalPurple, WoDItems.bedViridian
		));
		Registries.ITEM_GROUPS.register("worldofdye:seat", Registries.stackListOf(
			ColorItems.seatWhite, ColorItems.seatOrange, ColorItems.seatMagenta,
			ColorItems.seatLightblue, ColorItems.seatYellow, ColorItems.seatLime,
			ColorItems.seatPink, ColorItems.seatGray, ColorItems.seatSilver,
			ColorItems.seatCyan, ColorItems.seatPurple, ColorItems.seatBlue,
			ColorItems.seatBrown, ColorItems.seatGreen, Item.seat,
			ColorItems.seatBlack, WoDItems.seatCrimson, WoDItems.seatMaroon,
			WoDItems.seatAshGray, WoDItems.seatOlive, WoDItems.seatOchre,
			WoDItems.seatBuff, WoDItems.seatVerdigris, WoDItems.seatLightYellow,
			WoDItems.seatIndigo, WoDItems.seatXanthic, WoDItems.seatCinnamon,
			WoDItems.seatNavyBlue, WoDItems.seatRoyalPurple, WoDItems.seatViridian
		));
	}

	@Override
	public void onRecipesReady() {
		for (int i = 0; i < 14; i++) {
			RecipeBuilder.Shaped(WoDMain.MOD_ID)
				.setShape("DSS", "SSG", "GGG")
				.addInput('D', new ItemStack(ModItems.dye, 1, i))
				.addInput('S', Block.sand)
				.addInput('G', Block.gravel)
				.create("nndconcretecraft", new ItemStack(nndconcrede[i], 8));
		}
		for (int j = 0; j < 14; j++){
			RecipeBuilder.Shaped(WoDMain.MOD_ID)
				.setShape("CCW", "PPP")
				.addInput('C', Item.cloth)
				.addInput('P', "minecraft:planks")
				.addInput('W', new ItemStack(ModBlocks.wool, 1, j))
				.create("nndbedcraft", new ItemStack(nndbed[j], 1));
		}
		for (int k = 0; k < 14; k++){
			RecipeBuilder.Shaped(WoDMain.MOD_ID)
				.setShape("CWC", "P P")
				.addInput('C', Item.cloth)
				.addInput('P', "minecraft:planks")
				.addInput('W', new ItemStack(ModBlocks.wool, 1, k))
				.create("nndseatcraft", new ItemStack(nndseat[k], 1));
		}

		new RecipeBuilderBleacher(WoDMain.MOD_ID)
			.setInput("worldofdye:powder")
			.create("how_did_you_wash_concrete_powder", new ItemStack(ColorBlocks.concretePowderWhite));
		new RecipeBuilderBleacher(WoDMain.MOD_ID)
			.setInput("worldofdye:concrete")
			.create("colored_concrete_to_white", new ItemStack(ColorBlocks.concrete, 1, 0));
		new RecipeBuilderBleacher(WoDMain.MOD_ID)
			.setInput("worldofdye:bed")
			.create("colored_bed_to_white", new ItemStack(ColorItems.bedWhite));
		new RecipeBuilderBleacher(WoDMain.MOD_ID)
			.setInput("worldofdye:seat")
			.create("colored_seat_to_white", new ItemStack(ColorItems.seatWhite));
	}
}
