public class Player {
    private ShootingStrategy shootingStrategy;

    public void setShootingStrategy(ShootingStrategy strategy) {
        this.shootingStrategy = strategy;
    }

    public void performShoot() {
        if (shootingStrategy != null) {
            shootingStrategy.shoot();
        } else {
            System.out.println("No hay estrategia de disparo seleccionada.");
        }
    }
}
