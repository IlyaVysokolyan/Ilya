package day11.task2;

public class Magician extends Hero implements MagicAttack {

    int magicAtt = 20;

    public Magician() {
        health = 100;
        magicDef = 0.8;
        physAtt = 5;
        physDef = 0;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackSc1 = magicAtt*(1-hero.magicDef);
        if(hero.health -attackSc1 <MIN_HEALTH){
            hero.health =MIN_HEALTH;
        }else {
            hero.health-=attackSc1;
        }

    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
