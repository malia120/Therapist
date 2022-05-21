import java.util.Scanner;

public class Therapist {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String name, problem, randomReplies;

        

        System.out.println("Hello there! May i take your name?");

        name = scan.nextLine();

        System.out.println("Nice to meet you " + name + "! So tell me, What's the matter?");

        problem = scan.nextLine();
        String[] words = problem.split(" ");
        String problemRepeat3 = words[words.length - 3];
        String problemRepeat2 = words[words.length - 2];
        String problemRepeat1 = words[words.length - 1];
        System.out.println(problemRepeat3 + " " + problemRepeat2 + " " + problemRepeat1 + "?");

        problem = scan.nextLine();

        System.out.println("I'm really sorry to hear that " + name + ". And how does that make you feel?");

        problem = scan.nextLine();
        String[] words1 = problem.split(" ");
        String problemRepeat4 = words1[words1.length - 3];
        String problemRepeat5 = words1[words1.length - 2];
        String problemRepeat6 = words1[words1.length - 1];

        System.out.println("" + problemRepeat4 + " " + problemRepeat5 + " " + problemRepeat6 + "?");
    
        randomReplies = scan.nextLine();
        
        switch(randomReplies){

            case "I love you":
            case "i love you":
            case "i love u":
            System.out.println("I love you too " + name + "!");
            break;

            case "bye":
            case "bye bye":
            case "goodbye":
            case "cya":
            System.out.println("See you later!");
            break;

            case "Yes":
            case "Yeah":
            case "yes":
            case "yeah":
            System.out.println("Tell me why agree");
            break;

            case "No":
            case "no":
            case "nah":
            case "Nah":
            System.out.println("Tell me why you disagree");
            break;

            case "I dont know":
            case "idk":
            case "i dont know":
            case "Idk":
            case "I'm not sure":
            case "im not sure":
            case "im unsure":
            System.out.println("What makes you unsure?");
            break;

        default:
        System.out.println("What do you mean by that?");

        }
        scan.close();

    }
}