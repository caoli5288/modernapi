package com.github.caoli5288.modernapi;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public class ModernItems {

    public static Material getMaterial(@NotNull ItemStack item) {
        return item.getType();
    }

    public static Material getMaterial(@NotNull Block block) {
        return block.getType();
    }

    public static ModernBlockData getBlockData(@NotNull Block block) {
        return new ModernBlockData(block.getBlockData());
    }

    public static void setBlockData(@NotNull Block block, @NotNull ModernBlockData blockData) {
        blockData.apply(block, true);
    }

    public static void setBlockData(@NotNull Block block, @NotNull ModernBlockData blockData, boolean applyPhysics) {
        blockData.apply(block, applyPhysics);
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

    public static void editMeta(@NotNull ItemStack item, @NotNull Consumer<ItemMeta> edit) {
        item.editMeta(edit);
    }

    public static @Nullable List<Component> lore(@NotNull ItemMeta meta) {
        return meta.lore();
    }

    public static void lore(@NotNull ItemMeta meta, @NotNull List<Component> lore) {
        meta.lore(lore);
    }

    public static boolean isNullOrEmpty(ItemStack item) {
        return item == null || item.getType().isEmpty() || item.getAmount() == 0;
    }
}
