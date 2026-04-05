import java.util.ArrayList;
import java.util.List;

public class Difficulty {
    private String difficultyName;
    private List<EntityWave> combatWaves;
    private int currentWaveIndex;

    public Difficulty(String difficultyName) {
        this.difficultyName = difficultyName;
        this.combatWaves = new ArrayList<>();
        this.currentWaveIndex = 0;
    }

    public EntityWave[] getAllWaves() {
        return combatWaves.toArray(new EntityWave[0]);
    }

    public EntityWave getCurrentWave() {
        if (currentWaveIndex < combatWaves.size()) {
            return combatWaves.get(currentWaveIndex);
        }
        return null;
    }

    public EntityWave advanceWave() {
        currentWaveIndex++;
        return getCurrentWave();
    }

    public boolean hasNextWave() {
        return currentWaveIndex + 1 < combatWaves.size();
    }

    public void addCombatWave(EntityWave wave) {
        combatWaves.add(wave);
    }

    public void removeCombatWave(EntityWave wave) {
        combatWaves.remove(wave);
    }

    public String getDifficultyName() {
        return difficultyName;
    }
}
