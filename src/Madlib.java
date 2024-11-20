public class Madlib {
    int decimalBiggerThan1;
    String classmate;
    String city;
    String noun;
    String pluralNoun;
    String adjective;
    String pluralAnimal;
    String trueOrFalse;
    int number1;
    int number2;
    int wholeNumberBetween1And4;
    String letterGrade;
    String miltonTeacher;
    String miltonDean;
    String season;
    String story;

    public Madlib() {
        season = "summer";
        miltonDean = "Mrs. Swain";
        miltonTeacher = "Mrs. Millet";
        letterGrade = "D";
        wholeNumberBetween1And4 = 3;
        number2 = 1000;
        number1 = 5;
        trueOrFalse = "True";
        pluralAnimal = "Unicorns";
        adjective = "spicy";
        pluralNoun = "legos";
        noun = "sponge";
        city = "New York";
        classmate = "Jace Livigni";
        decimalBiggerThan1 = 75;


        story = "This weekend I am going camping with "
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
    }
}






