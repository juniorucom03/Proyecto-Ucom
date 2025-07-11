public class EnemyFactory {
    public Enemy createEnemy(String type) {
        if (type.equals("weak")) {
            return new WeakEnemy();
        } else if (type.equals("strong")) {
            return new StrongEnemy();
        } else {
            throw new IllegalArgumentException("Tipo de enemigo desconocido: " + type);
        }
    }
}
