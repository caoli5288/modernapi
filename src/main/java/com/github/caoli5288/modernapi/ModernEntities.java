package com.github.caoli5288.modernapi;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

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

    public static void resetAttackCooldown(Player entity) {
        entity.resetCooldown();
    }

    public static void swingMainHand(LivingEntity entity) {
        entity.swingMainHand();
    }

    public static void swingOffHand(LivingEntity entity) {
        entity.swingOffHand();
    }
}
