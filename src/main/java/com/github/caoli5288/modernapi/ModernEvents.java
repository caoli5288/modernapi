package com.github.caoli5288.modernapi;

import net.kyori.adventure.text.Component;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ModernEvents {

    public static Component deathMessage(PlayerDeathEvent event) {
        return event.deathMessage();
    }

    public static void deathMessage(PlayerDeathEvent event, Component message) {
        event.deathMessage(message);
    }
}
