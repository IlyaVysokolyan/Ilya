package day11.task2;

public abstract class Hero implements PhysAttack{
    final int MIN_HEALTH = 0;
    int health ;
    int physAtt;
    double physDef ;
    double magicDef ;


    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackSc = physAtt*(1-hero.physDef);
        if(hero.health-attackSc < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }else {
            hero.health-=attackSc;
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }
}
