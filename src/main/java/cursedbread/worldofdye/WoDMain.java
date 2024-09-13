package cursedbread.worldofdye;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.Properties;


public class WoDMain implements ModInitializer, GameStartEntrypoint {
    public static final String MOD_ID = "worldofdye";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("ExampleMod initialized.");
    }

	public static int blockId;
	public static int itemId;

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id", "2000");
		prop.setProperty("starting_item_id", "17000");

		ConfigHandler config = new ConfigHandler(MOD_ID,prop);

		blockId = config.getInt("starting_block_id");
		itemId = config.getInt("starting_item_id");
	}

	@Override
	public void beforeGameStart() {
		new WoDItems().initilizeItems();
		new WoDBlocks().initializeBlocks();
	}

	@Override
	public void afterGameStart() {

	}


}
