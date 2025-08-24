package com.github.caoli5288.modernapi;

import com.destroystokyo.paper.ParticleBuilder;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Delegate;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.jetbrains.annotations.NotNull;

public class ModernParticles {

    public static Particle getParticle(@NotNull String name) {
        return Particle.valueOf(name);
    }

    public static Object dustOptions(Color color, float size) {
        return new Particle.DustOptions(color, size);
    }

    public static Object dustOptions(Color color, Color to, float size) {
        return new Particle.DustTransition(color, to, size);
    }

    public static ModernParticleBuilder builder(Particle particle) {
        return new ModernParticleBuilder(particle.builder());
    }

    @RequiredArgsConstructor
    public static class ModernParticleBuilder {

        @Delegate
        private final ParticleBuilder builder;
    }
}
