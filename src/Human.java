public class Human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String jobTitle;

    public Human(String name, int year, String town, String jobTitle) {
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

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }
        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getJobTitle () {
            return jobTitle;
        }

        public void setJobTitle (){
            this.jobTitle = jobTitle;
        }
}
