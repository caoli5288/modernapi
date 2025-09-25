package com.github.caoli5288.modernapi;

import lombok.RequiredArgsConstructor;
import lombok.experimental.Delegate;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Bisected;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Directional;
import org.bukkit.block.data.Rotatable;

@RequiredArgsConstructor
public class ModernBlockData {

    @Delegate
    private final BlockData blockData;

    public void apply(Block block, boolean applyPhysics) {
        block.setBlockData(blockData, applyPhysics);
    }

    public boolean isDirectional() {
        return blockData instanceof Directional;
    }

    public BlockFace getFacing() {
        return ((Directional) blockData).getFacing();
    }

    public void setFacing(BlockFace face) {
        ((Directional) blockData).setFacing(face);
    }

    public boolean isBisected() {
        return blockData instanceof Bisected;
    }

    public Half getHalf() {
        Bisected.Half half = ((Bisected) blockData).getHalf();
        if (half == Bisected.Half.TOP) {
            return Half.TOP;
        }
        return Half.BOTTOM;
    }

    public void setHalf(Half half) {
        ((Bisected) blockData).setHalf(half.half);
    }

    public boolean isRotatable() {
        return blockData instanceof Rotatable;
    }

    public BlockFace getRotation() {
        return ((Rotatable) blockData).getRotation();
    }

    public void setRotation(BlockFace face) {
        ((Rotatable) blockData).setRotation(face);
    }

    public enum Half {
        TOP(Bisected.Half.TOP),
        BOTTOM(Bisected.Half.BOTTOM);

        private final Bisected.Half half;

        Half(Bisected.Half half) {
            this.half = half;
        }
    }
}
