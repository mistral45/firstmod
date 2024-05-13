package net.baloryba.firstmod.item;

import net.baloryba.firstmod.FirstMod;
import net.baloryba.firstmod.item.custom.ShitDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> SHIT_SWORD = ITEMS.register("shit_sword",
            () -> new Item(new Item.Properties().durability(50)));

    public static final RegistryObject<Item> SHIT = ITEMS.register("shit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHIT_DETECTOR = ITEMS.register("shit_detector",
            () -> new ShitDetectorItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
