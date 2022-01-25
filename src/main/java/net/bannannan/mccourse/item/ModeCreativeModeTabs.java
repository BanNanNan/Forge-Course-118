package net.bannannan.mccourse.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModeCreativeModeTabs {

    public static final CreativeModeTab COURSE_TAB = new CreativeModeTab("coursemodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COBALT_INGOT.get());
        }
    };
}