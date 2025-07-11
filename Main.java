public class Main {
    public static void main(String[] args) {
        // -------------------------------
        // Prueba Strategy
        System.out.println("=== Strategy ===");
        Player player = new Player();
        player.setShootingStrategy(new SingleShotStrategy());
        player.performShoot(); // Disparo simple

        player.setShootingStrategy(new DoubleShotStrategy());
        player.performShoot(); // Disparo doble

        // -------------------------------
        // Prueba Factory
        System.out.println("\n=== Factory ===");
        EnemyFactory factory = new EnemyFactory();

        Enemy weakEnemy = factory.createEnemy("weak");
        weakEnemy.display(); // Enemigo débil creado.

        Enemy strongEnemy = factory.createEnemy("strong");
        strongEnemy.display(); // Enemigo fuerte creado.

        // -------------------------------
        // Prueba Singleton
        System.out.println("\n=== Singleton ===");
        GameManager gameManager = GameManager.getInstance();
        gameManager.addScore(100);

        GameManager anotherRef = GameManager.getInstance();
        anotherRef.addScore(50);

        System.out.println("Score final: " + gameManager.getScore()); // Score final: 150
    }
}
