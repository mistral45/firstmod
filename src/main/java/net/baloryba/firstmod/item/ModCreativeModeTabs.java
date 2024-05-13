package net.baloryba.firstmod.item;

import net.baloryba.firstmod.FirstMod;
import net.baloryba.firstmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FIRSTMOD_TAB = CREATIVE_MODE_TABS.register("firstmod_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SHIT_SWORD.get()))
                    .title(Component.translatable("creativetab.firstmod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SHIT_SWORD.get());
                        pOutput.accept(ModItems.SHIT.get());
                        pOutput.accept(ModBlocks.SHIT_BLOCK.get());
                        pOutput.accept(ModBlocks.HARDENED_SHIT.get());
                        pOutput.accept(ModItems.SHIT_DETECTOR.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
