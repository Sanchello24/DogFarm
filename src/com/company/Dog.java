package com.company;

    public class Dog {
        //создаем поля
        public String name;
        public String dogBreed;
        public int year;

        boolean isTrained = true;
        boolean isHealthy = true;
        boolean isHungry = true;

        //создаем конструктор
        public Dog(String name, String dogBreed, int year) {
            this.name = name;
            this.dogBreed = dogBreed;
            this.year = year;
        }

        public Dog() {
        }

        //метод который выводит айди собаки
        void showIdDog() {
            System.out.println(name + ", " + dogBreed + ", " + year + " year(s)");
        }

        //метод который выводит возраст собаки
        void age() {
            if (year <= 1) {
                System.out.println("little dog");
            } else if (year < 6) {
                System.out.println("Adult dog");
            } else if (year > 6) {
                System.out.println("old dog");
            }
        }

        //метод голодная собака или нет
        void meal() {
            if (isHungry) {
                System.out.println("The dog wants to eat and drink");
            } else {
                System.out.println("The dog is full. Them wants to sleep");
            }
        }

        //метод тренированнная собака или нет
        void activities() {
            if (isTrained) {
                System.out.println("The dog is going to the work");
            } else {
                System.out.println("The dog is going to work out");
            }
        }

        //метод здоровая собака или нет
        void healthcare() {
            if (isHealthy) {
                System.out.println("The dog is healthy");
            } else {
                System.out.println("The dog is sick. They need good care and everyday massage");
            }
        }

        //метод рацион питания
        void nutrition() {
            if (year <= 1) {
                System.out.println("The puppy should eat twice a day. To take vitamins four times in a day");
            } else if (year < 6) {
                System.out.println("The dog should eat three times in a day. To drink 5 liters of water and take a lot of vitamins");
            } else if (year > 6) {
                System.out.println("The Grandma should eat soup amd fish. To take vitamins two times in a day");
            }
        }

        //специальный метод для старых собак
        void stayHome() {
            if (year > 6) {
                System.out.println("The dog stay home");
            }
        }
    }
