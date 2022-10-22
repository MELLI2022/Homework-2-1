public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;

    Human(String name, int year, String town, String jobTitle ){
        if (name == null || name.isEmpty()){
            this.name = "Информация не указана";
        }else {
            this.name = name;
        }
        if (town == null|| town.isEmpty()){
            this.town = "Информация не указана";
        }else {this.town = town;
        }
        if (jobTitle == null || jobTitle.isEmpty()){
            this.jobTitle = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }
        if (year > 0) {
            this.yearOfBirth = 2022 - year;
        } else {
            yearOfBirth = 0;
        }
    }

    public String toString(){
    return "Привет! Меня зовут "+name+". Я из города "+town+". Я родился в "+yearOfBirth+" году.Я работаю на должности "+jobTitle+". Будем знакомы!";
}
}
