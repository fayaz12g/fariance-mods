package one.fayaz;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class TutorialBlocks {
    public static final Block EXAMPLE_BLOCK = register("example_block", Block::new, Block.Settings.create().strength(4.0f));

    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of("tutorial", path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }

    public static void init() {
        register();
    }
}
