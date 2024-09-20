package cursedbread.worldofdye;

import luke.color.ColorBlocks;
import luke.color.item.ItemColorBed;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import turniplabs.halplibe.helper.ItemBuilder;

import static luke.color.ColorMod.MOD_ID;

public class WoDItems {

	public static Item bedCrimson;
	public static Item bedMaroon;
	public static Item bedAshGray;
	public static Item bedOlive;
	public static Item bedOchre;
	public static Item bedBuff;
	public static Item bedVerdigris;
	public static Item bedLightYellow;
	public static Item bedIndigo;
	public static Item bedXanthic;
	public static Item bedCinnamon;
	public static Item bedNavyBlue;
	public static Item bedRoyalPurple;
	public static Item bedViridian;

	public static Item seatCrimson;
	public static Item seatMaroon;
	public static Item seatAshGray;
	public static Item seatOlive;
	public static Item seatOchre;
	public static Item seatBuff;
	public static Item seatVerdigris;
	public static Item seatLightYellow;
	public static Item seatIndigo;
	public static Item seatXanthic;
	public static Item seatCinnamon;
	public static Item seatNavyBlue;
	public static Item seatRoyalPurple;
	public static Item seatViridian;

	public void initilizeItems() {

		//beds

		bedCrimson = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/crimson_bed")
			.build(new ItemColorBed("bed.crimson", WoDMain.itemId++, WoDBlocks.bedCrimson));
		bedMaroon = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/maroon_bed")
			.build(new ItemColorBed("bed.maroon", WoDMain.itemId++, WoDBlocks.bedMaroon));
		bedAshGray = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/ash_gray_bed")
			.build(new ItemColorBed("bed.ashgray", WoDMain.itemId++, WoDBlocks.bedAshGray));
		bedOlive = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/olive_bed")
			.build(new ItemColorBed("bed.olive", WoDMain.itemId++, WoDBlocks.bedOlive));
		bedOchre = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/ochre_bed")
			.build(new ItemColorBed("bed.ochre", WoDMain.itemId++, WoDBlocks.bedOchre));
		bedBuff = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/buff_bed")
			.build(new ItemColorBed("bed.buff", WoDMain.itemId++, WoDBlocks.bedBuff));
		bedVerdigris = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/verdigris_bed")
			.build(new ItemColorBed("bed.verdigris", WoDMain.itemId++, WoDBlocks.bedVerdigris));
		bedLightYellow = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/light_yellow_bed")
			.build(new ItemColorBed("bed.lightyellow", WoDMain.itemId++, WoDBlocks.bedLightYellow));
		bedIndigo = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/indigo_bed")
			.build(new ItemColorBed("bed.indigo", WoDMain.itemId++, WoDBlocks.bedIndigo));
		bedXanthic = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/xanthic_bed")
			.build(new ItemColorBed("bed.xanthic", WoDMain.itemId++, WoDBlocks.bedXanthic));
		bedCinnamon = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/cinnamon_bed")
			.build(new ItemColorBed("bed.cinnamon", WoDMain.itemId++, WoDBlocks.bedCinnamon));
		bedNavyBlue = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/navy_blue_bed")
			.build(new ItemColorBed("bed.navyblue", WoDMain.itemId++, WoDBlocks.bedNavyBlue));
		bedRoyalPurple = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/royal_purple_bed")
			.build(new ItemColorBed("bed.royalpurple", WoDMain.itemId++, WoDBlocks.bedRoyalPurple));
		bedViridian = new ItemBuilder(WoDMain.MOD_ID)
			.setIcon("worldofdye:item/viridian_bed")
			.build(new ItemColorBed("bed.viridian", WoDMain.itemId++, WoDBlocks.bedViridian));

		//seats

		seatCrimson = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/crimson_seat")
			.build(new ItemPlaceable("seat.crimson", WoDMain.itemId++, WoDBlocks.seatCrimson));
		seatMaroon = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/maroon_seat")
			.build(new ItemPlaceable("seat.maroon", WoDMain.itemId++, WoDBlocks.seatMaroon));
		seatAshGray = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/ash_gray_seat")
			.build(new ItemPlaceable("seat.ashgray", WoDMain.itemId++, WoDBlocks.seatAshGray));
		seatOlive = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/olive_seat")
			.build(new ItemPlaceable("seat.olive", WoDMain.itemId++, WoDBlocks.seatOlive));
		seatOchre = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/ochre_seat")
			.build(new ItemPlaceable("seat.ochre", WoDMain.itemId++, WoDBlocks.seatOchre));
		seatBuff = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/buff_seat")
			.build(new ItemPlaceable("seat.buff", WoDMain.itemId++, WoDBlocks.seatBuff));
		seatVerdigris = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/verdigris_seat")
			.build(new ItemPlaceable("seat.verdigris", WoDMain.itemId++, WoDBlocks.seatVerdigris));
		seatLightYellow = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/light_yellow_seat")
			.build(new ItemPlaceable("seat.lightyellow", WoDMain.itemId++, WoDBlocks.seatLightYellow));
		seatIndigo = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/indigo_seat")
			.build(new ItemPlaceable("seat.indigo", WoDMain.itemId++, WoDBlocks.seatIndigo));
		seatXanthic = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/xanthic_seat")
			.build(new ItemPlaceable("seat.xanthic", WoDMain.itemId++, WoDBlocks.seatXanthic));
		seatCinnamon = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/cinnamon_seat")
			.build(new ItemPlaceable("seat.cinnamon", WoDMain.itemId++, WoDBlocks.seatCinnamon));
		seatNavyBlue = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/navy_blue_seat")
			.build(new ItemPlaceable("seat.navyblue", WoDMain.itemId++, WoDBlocks.seatNavyBlue));
		seatRoyalPurple = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/royal_purple_seat")
			.build(new ItemPlaceable("seat.royalpurple", WoDMain.itemId++, WoDBlocks.seatRoyalPurple));
		seatViridian = (new ItemBuilder(WoDMain.MOD_ID)).setIcon("worldofdye:item/viridian_seat")
			.build(new ItemPlaceable("seat.viridian", WoDMain.itemId++, WoDBlocks.seatViridian));
	}
}
