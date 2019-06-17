import java.util.Scanner;

public class Main {



    public static void main (String[] args){
        String[]  listOfNoun = new String[]{"toys","Jedi","robots","cakes","hamburgers","tea","UBC","baskerball","lipstick","dream","soul","house", "school", "computer"};
        String[]  listOfVerb = new String[]{"play","beat","cringe","laugh","sneak","crouch","lie","suck","die","fly", "eat", "sleep","fight", "write", "think"};
        String[]  listOfAdj  = new String[]{"ugly","playful","muscular","outstanding","marvelous","pleasant","dumb","meaningless", "bright","beautiful", "shiny"};
        String[]  listOfAdv  = new String[]{"relentlessly","hopelessly","perfectly","nicely","unexpectedly", "thankfully", "abruptly", "firmly", "lightly"};

        linkedList Noun = new linkedList();
        linkedList Verb = new linkedList();
        linkedList Adj = new linkedList();
        linkedList Adv = new linkedList();

        for (int i=0;i<listOfNoun.length;i++) Noun.insert(new linkedList.Node(0, listOfNoun[i]));
        for (int i=0;i<listOfVerb.length;i++) Verb.insert(new linkedList.Node(0, listOfVerb[i]));
        for (int i=0;i<listOfAdj.length;i++)  Adj.insert(new linkedList.Node(0, listOfAdj[i]));
        for (int i=0;i<listOfAdv.length;i++)  Adv.insert(new linkedList.Node(0, listOfAdv[i]));
        int again = 1;
        while(again == 1) {
            Scanner input = new Scanner(System.in);
            System.out.println("Make a choice:");
            System.out.println("1. What immortal hand or eye Could frame thy fearful symmetry?--William Blake");
            System.out.println("2. Let life be beautiful like summer flowers and death like autumn leaves.--Rabindranath Tagore");
            System.out.println("3. Tread softly because you tread on my dreams.--William Butler Yeats");
            int choice = input.nextInt();
            System.out.println("Please enter your name:");
            String name = input.next();

            switch (choice) {
                case 1:
                    System.out.println("What " + Adj.proceed() + " hand or eye Could " + Verb.proceed() + " thy " + Adj.proceed() + " symmetry?" + "--" + name);
                    break;
                case 2:
                    System.out.println("Let " + Noun.proceed() + " be " + Adj.proceed() + " like summer " + Noun.proceed() + " and death " + Verb.proceed() + " autumn " + Noun.proceed() + "." + "--" + name);
                    break;
                case 3:
                    System.out.println("Tread " + Adv.proceed() + " because you " + Verb.proceed() + " on my " + Noun.proceed() + "." + "--" + name);
                    break;
            }
            System.out.println("\nPlay again? \n1. yes 2. no");
            again=input.nextInt();
        }
    }
}
