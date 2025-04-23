package net.liferquest.imaginarium.item;

import net.liferquest.imaginarium.Imaginarium;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Imaginarium.MOD_ID);

    public static final RegistryObject<Item> TEST_TOTEM = ITEMS.register("test_totem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_PAINT_TUBE = ITEMS.register("red_paint_tube",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
