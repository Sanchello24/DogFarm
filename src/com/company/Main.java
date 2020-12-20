package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("God", "Beagler", 1);
        dog1.showIdDog();
        dog1.age();
        dog1.nutrition();
        dog1.isHungry = true;
        dog1.meal();
        dog1.isHealthy = true;
        dog1.healthcare();
        dog1.isTrained = false;
        dog1.activities();
        System.out.println();

        Dog dog2 = new Dog("Sasha", "Cockapoo", 3);
        dog2.showIdDog();
        dog2.age();
        dog2.isHealthy = true;
        dog2.healthcare();
        dog2.nutrition();
        dog2.isHungry = true;
        dog2.meal();
        dog2.isTrained = true;
        dog2.activities();
        System.out.println();

        Dog dog3 = new Dog("Fread", "labrador", 6);
        dog3.showIdDog();
        dog3.age();
        dog3.isHealthy = false;
        dog3.healthcare();
        dog3.nutrition();
        dog3.isHungry = true;
        dog3.meal();
        dog3.stayHome();
        System.out.println();

//создаем персонал из свойства
        Staff cleaner = new Staff("Sweet", "Cleaner");
        Staff trainer = new Staff("Smoke", "Trainer");
        Staff careMan = new Staff("CJ", "Careman");

        cleaner.showIdStaff();
        cleaner.dogPlace();
        System.out.println();

        trainer.showIdStaff();
        trainer.teaching();
        System.out.println();

        careMan.showIdStaff();
        careMan.checkHealth();
        careMan.feedDogs();
        System.out.println();
    }
}