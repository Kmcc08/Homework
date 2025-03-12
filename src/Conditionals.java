public class Conditionals {
    public String question = " is leif a real sigma? ";
    public int randomInt;

    public static void main(String[] args) {
        Conditionals magicEightball = new Conditionals();
    }

    public Conditionals(){
        System.out.println(question);
        randomInt= (int)(Math.random()*11);

        if (randomInt>=7){
            System.out.println(" Not likely :( ");

        }

        if(randomInt<7 && randomInt>=5){
            System.out.println(" Yes he is! ;) ");
        }

        if(randomInt<5 && randomInt>=3){
            System.out.println(" Hmm... I'm not sure ");
        }
        if(randomInt==2){
            System.out.println(" Why would you ask that? ");
        }
        if(randomInt ==1){
            System.out.println(" The only real sigma is me ");
        }
    }


}
