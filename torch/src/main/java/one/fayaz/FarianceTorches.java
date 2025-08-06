package one.fayaz;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Direction;
import net.minecraft.loot.LootTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class FarianceTorches implements ModInitializer {
    public static final String MOD_ID = "fariance-torches";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Define torch types and wood types
    private static final String[] TORCH_TYPES = {"normal", "soul", "redstone", "copper"};
    private static final String[] BASE_WOOD_TYPES = {"oak", "spruce", "birch", "jungle", "acacia", "dark_oak", "mangrove", "cherry", "crimson", "warped", "bamboo"};

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Fariance Torches...");

        TutorialBlocks.init();
    }

}

