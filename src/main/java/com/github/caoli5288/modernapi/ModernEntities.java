package com.github.caoli5288.modernapi;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.HumanEntity;

public class ModernEntities {

    public static float getAttackCooldown(HumanEntity entity) {
        return entity.getAttackCooldown();
    }

    public static double getAbsorptionAmount(Damageable entity) {
        return entity.getAbsorptionAmount();
    }

    public static void setAbsorptionAmount(Damageable entity, double amount) {
        entity.setAbsorptionAmount(amount);
    }
}
