package net.xisurthros.xisurthros.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab XISURTHROS_TAB = new CreativeModeTab("xisurthrostab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };
    // To make a 2nd creative mode tab
//    public static final CreativeModeTab XISURTHROS_TAB_2 = new CreativeModeTab("xisurthrostab2") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModItems.RAW_ZIRCON.get());
//        }
//    };
}
