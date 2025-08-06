package one.fayaz.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import one.fayaz.FarianceBase;

public class ModSoundEvents {

    public static final RegistryEntry<SoundEvent> ITEM_ARMOR_EQUIP_AMETHYST = register("item.armor.equip_amethyst");

    private static RegistryEntry<SoundEvent> register(String id) {
        Identifier identifier = Identifier.of(FarianceBase.MOD_ID, id);
        return Registry.registerReference(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }
}
