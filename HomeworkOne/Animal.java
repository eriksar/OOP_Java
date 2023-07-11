public abstract class Animal {
    private int runMaxDistance; // Дистанция бега
    private int swimMaxDistance; // Дистанция плавания
    private float jumpMaxDistance; // Дистанция прыжка

    public Animal(int runMaxDistance, int swimMaxDistance, float jumpMaxDistance) {
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxDistance = jumpMaxDistance;
    }
    public void run(int runDistance) { // Бегать
        System.out.println("run: " + (runDistance <= runMaxDistance));
    }
    public void swim(int swimDistance) { // Плыть
        System.out.println("swim: " + (swimDistance <= swimMaxDistance));
    }
    public void jump(float jumpHeight) { // Прыгать
        System.out.println("jump: " + (jumpHeight <= jumpMaxDistance));
    }
}
