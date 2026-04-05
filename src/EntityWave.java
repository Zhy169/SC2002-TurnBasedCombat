import java.util.ArrayList;
import java.util.List;

public class EntityWave {
    private List<Enemy> enemies;

    public EntityWave() {
        this.enemies = new ArrayList<>();
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }
}
