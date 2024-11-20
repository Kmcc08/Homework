public class Madlib {

    public static void main(String[] args) {
        Madlib myStory = new Madlib();
    }

    public Madlib() {
       String season = "summer";
        String miltonDean = "Mrs. Swain";
        String miltonTeacher = "Mrs. Millet";
        String letterGrade = "D";
       int wholeNumberBetween1And4 = 3;
       int number2 = 1000;
       int number1 = 5;
        String trueOrFalse = "True";
        String  pluralAnimal = "Unicorns";
        String adjective = "spicy";
        String  pluralNoun = "legos";
        String noun = "sponge";
        String city = "New York";
        String classmate = "Jace Livigni";
       int decimalBiggerThan1 = 75;

       String story = "This weekend I am going camping with "
                + classmate + ". We are going to a campsite in "
                + city + ". I packed my " + noun + " and "
                + pluralNoun + ". The forecast is calling for a high of "
                + decimalBiggerThan1 + " degrees Fahrenheit. So it should be a "
                + adjective + " day! This year, the park rangers have seen "
                + number1 + " " + pluralAnimal + " which seems kind of dangerous. "
                + miltonTeacher + " said it's " + trueOrFalse + " that " + pluralAnimal + " eat class "
                + wholeNumberBetween1And4 + " students in the " + season + ". But, "
                + miltonDean + " said it actually has only happened "
                + number2 + " times. Wish us luck! If we survive, we will earn a "
                + letterGrade + "- in P.E. class.";

        System.out.println(story);
    }


}






