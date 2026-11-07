package com.github.caoli5288.modernapi;

import com.destroystokyo.paper.ParticleBuilder;
import lombok.RequiredArgsConstructor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;

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

        private final ParticleBuilder builder;

        public @NotNull ModernParticleBuilder spawn() {
            builder.spawn();
            return this;
        }

        public @NotNull Particle particle() {
            return builder.particle();
        }

        public @NotNull ModernParticleBuilder particle(@NotNull Particle particle) {
            builder.particle(particle);
            return this;
        }

        public @Nullable List<Player> receivers() {
            return builder.receivers();
        }

        public boolean hasReceivers() {
            return builder.hasReceivers();
        }

        public @NotNull ModernParticleBuilder allPlayers() {
            builder.allPlayers();
            return this;
        }

        public @NotNull ModernParticleBuilder receivers(@Nullable List<Player> receivers) {
            builder.receivers(receivers);
            return this;
        }

        public @NotNull ModernParticleBuilder receivers(@Nullable Collection<Player> receivers) {
            builder.receivers(receivers);
            return this;
        }

        public @NotNull ModernParticleBuilder receivers(@Nullable Player... receivers) {
            builder.receivers(receivers);
            return this;
        }

        public @NotNull ModernParticleBuilder receivers(int radius) {
            builder.receivers(radius);
            return this;
        }

        public @NotNull ModernParticleBuilder receivers(int radius, boolean byDistance) {
            builder.receivers(radius, byDistance);
            return this;
        }

        public @NotNull ModernParticleBuilder receivers(int xzRadius, int yRadius) {
            builder.receivers(xzRadius, yRadius);
            return this;
        }

        public @NotNull ModernParticleBuilder receivers(int xzRadius, int yRadius, boolean byDistance) {
            builder.receivers(xzRadius, yRadius, byDistance);
            return this;
        }

        public @NotNull ModernParticleBuilder receivers(int xRadius, int yRadius, int zRadius) {
            builder.receivers(xRadius, yRadius, zRadius);
            return this;
        }

        public @Nullable Player source() {
            return builder.source();
        }

        public @NotNull ModernParticleBuilder source(@Nullable Player source) {
            builder.source(source);
            return this;
        }

        public @Nullable Location location() {
            return builder.location();
        }

        public @NotNull ModernParticleBuilder location(@NotNull Location location) {
            builder.location(location);
            return this;
        }

        public @NotNull ModernParticleBuilder location(@NotNull World world, double x, double y, double z) {
            builder.location(world, x, y, z);
            return this;
        }

        public int count() {
            return builder.count();
        }

        public @NotNull ModernParticleBuilder count(int count) {
            builder.count(count);
            return this;
        }

        public double offsetX() {
            return builder.offsetX();
        }

        public double offsetY() {
            return builder.offsetY();
        }

        public double offsetZ() {
            return builder.offsetZ();
        }

        public @NotNull ModernParticleBuilder offset(double offsetX, double offsetY, double offsetZ) {
            builder.offset(offsetX, offsetY, offsetZ);
            return this;
        }

        public double extra() {
            return builder.extra();
        }

        public @NotNull ModernParticleBuilder extra(double extra) {
            builder.extra(extra);
            return this;
        }

        public @Nullable <T> T data() {
            return builder.data();
        }

        public @NotNull <T> ModernParticleBuilder data(@Nullable T data) {
            builder.data(data);
            return this;
        }

        public boolean force() {
            return builder.force();
        }

        public @NotNull ModernParticleBuilder force(boolean force) {
            builder.force(force);
            return this;
        }

        public @NotNull ModernParticleBuilder color(@Nullable Color color) {
            builder.color(color);
            return this;
        }

        public @NotNull ModernParticleBuilder color(@Nullable Color color, float size) {
            builder.color(color, size);
            return this;
        }

        public @NotNull ModernParticleBuilder color(int r, int g, int b) {
            builder.color(r, g, b);
            return this;
        }
    }
}
