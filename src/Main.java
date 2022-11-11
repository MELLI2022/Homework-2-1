public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим",
                30,
                "Минск",
                "бренд-менеджер");
        Human anja = new Human("Аня",
                29,
                "Москва",
                "методист образовательных программ");
        Human katja = new Human("Катя",
                28,
                "Калининград",
                "продакт-менеджера");
        Human artem = new Human("Артём",
                27,
                "Москва",
                "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир",
                21, "Казань",
                "безработный");
        printInfo(maxim);
        printInfo(anja);
        printInfo(katja);
        printInfo(artem);
        printInfo(vladimir);
    }
    private static void printInfo(Human human){
        System.out.println("Привет! Меня зовут " + human.getName() + "." +
                " Я из города " + human.getTown() + "." +
                " Я родился в " + human.getYearOfBirth()+ " году." +
                "Я работаю на должности " + human.getJobTitle()+ ". " +
                "Будем знакомы!");
    }
}