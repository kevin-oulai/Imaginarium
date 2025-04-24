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

    public static final RegistryObject<Item> REVEAL_TOTEM = ITEMS.register("reveal_totem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREATION_TOTEM = ITEMS.register("creation_totem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCULPTURE_TOTEM = ITEMS.register("sculpture_totem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAMORPHOSIS_TOTEM = ITEMS.register("metamorphosis_totem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RED_PAINT_TUBE = ITEMS.register("red_paint_tube",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
