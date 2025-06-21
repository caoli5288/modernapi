package com.github.caoli5288.modernapi;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class ModernItems {

    public static Material getMaterial(@NotNull ItemStack item) {
        return item.getType();
    }

    public static Material getMaterial(@NotNull String name) {
        return Material.getMaterial(name);
    }

    public static Material getMaterial(@NotNull String name, boolean legacyName) {
        return Material.getMaterial(name, legacyName);
    }

    public static void setCustomModelData(@NotNull ItemMeta itemMeta, Integer modelData) {
        itemMeta.setCustomModelData(modelData);
    }

    public static boolean isNullOrEmpty(ItemStack item) {
        return item == null || item.getType().isAir() || item.getAmount() == 0;
    }
}
