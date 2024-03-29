package dev.anullihate.primalgamescore.generator;

import cn.nukkit.level.ChunkManager;
import cn.nukkit.level.generator.Generator;
import cn.nukkit.math.NukkitRandom;
import cn.nukkit.math.Vector3;

import java.util.Map;

public class Empty extends Generator {

    private final String name = "empty";
    private ChunkManager chunkManager;

    public Empty(Map options) {
        /* empty */
    }

    @Override
    public int getId() {
        return 1;
    }

    @Override
    public void init(ChunkManager chunkManager, NukkitRandom nukkitRandom) {
        this.chunkManager = chunkManager;
    }

    @Override
    public void generateChunk(int chX, int chZ) {

    }

    @Override
    public void populateChunk(int i, int i1) {
        /* empty */
    }

    @Override
    public Map<String, Object> getSettings() {
        return null;
    }

    @Override
    public String getName() {
        return "emptyworld";
    }

    @Override
    public Vector3 getSpawn() {
        return new Vector3(128.0, 65.0, 128.0);
    }

    @Override
    public ChunkManager getChunkManager() {
        return chunkManager;
    }
}
