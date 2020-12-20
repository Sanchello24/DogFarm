package com.company;

public class Staff {
    private String name;
    private String occupation;

    private boolean isDirty = true;

    //создаем конструктор
    public Staff() {
    }

    public Staff(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    //метод который показывает айди персонала
    void showIdStaff() {
        System.out.println(name + ", " + occupation);
    }

    public String toString() {
        return name + ", " + occupation;
    }

    //метод чтобы уборщик почистил вольер
    public void dogPlace() {
        if (isDirty) {
            System.out.println("I need to clean a dog's place");
        } else {
            System.out.println("Nice. Everything is clear");
        }
    }
    //метод чтобы заботливый человек проверил здорова собака или нет
    public void checkHealth(){
        System.out.println("I need to check the dogs. I need to know if one of them is healthy or sick");
    }
    //метод чтобы заботливый человек покормил животных
    public void feedDogs(){
        System.out.println("And don't forget to feed doggies");

    }
    //метод чтобы тренер начал обучать щенка
    public void teaching () {
        System.out.println("I'm ready to train Jesus. She is a puppy yet and she is a new one. Hope Jesus will grow smart and beautiful dog");
    }
}
