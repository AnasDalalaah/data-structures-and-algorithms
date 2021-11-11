/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTabel;

public class App {

    public static void main(String[] args) {

        HashTable<String, Integer> clubs = new HashTable<String, Integer>();

        clubs.add("Real Madrid",100);
        clubs.add("Barcelona", 200);
        clubs.add("Man United", 300);
        clubs.add("Zamalic,", 100);

        System.out.println("The size is => " + clubs.getSize());
        System.out.println(clubs.get("Real Madrid"));
        System.out.println("Delete Barcelona => " + clubs.remove("Barcelona"));
        System.out.println("The size is => " + clubs.getSize());
        System.out.println(clubs.contains("ss"));
        System.out.println(clubs.contains("Real Madrid"));

        //        *****Code Challenge 31 *****

        String paragraph1 = "Once upon a time, there was a brave princess who...";

        String paragraph2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only";

        String paragraph3= "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York";
        
        System.out.println(clubs.repeatedWord(paragraph3));


    }
}
