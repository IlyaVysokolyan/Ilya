package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer{

    int magicAtt = 15;
    final  int MAX_HEALTH =100;

    public Shaman() {
        health = 100;
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
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
    public void healHimself() {
        health+=50;
        if(health > MAX_HEALTH){
            health=MIN_HEALTH;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health+=30;
        if(hero.health > MAX_HEALTH){
            hero.health =MAX_HEALTH;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
