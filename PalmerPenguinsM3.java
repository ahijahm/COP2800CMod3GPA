// PalmerPenguinsM3.java
// Ahijah Marseille
// 05/29/2026
// Extend cunctionality using if-else and switch

public class PalmerPenguinsM3 {

        // constants to represent the species and count 
        static final String SP_CHINSTRAP = "Chinstrap"; 
        static final String SP_GENTOO = "Gentoo"; 
        static final String SP_ADELIE = "Adelie"; 
        static final int NUM_CHINSTRAP = 68;
        static final int NUM_GENTOO = 123;
        static final int NUM_ADELIE = 151;
        static final int TOTAL_SPECIES = 3;
        
        public static void main(String[] args) {
        
            // Calculate Total Penguins
            int totalPenguins = NUM_CHINSTRAP + NUM_GENTOO
                                + NUM_ADELIE;
            // variables for highest population
            String highestPopMsg = "N/A";
            boolean tie = false;
            int maxPop = 0;
            int c = NUM_CHINSTRAP;
            int g = NUM_GENTOO;
            int a = NUM_ADELIE;
                                
            // output the species names with introductory text 
            System.out.println("Introducing the Palmer Penguins: "); 
            System.out.println("\t" + SP_CHINSTRAP + "!");
            System.out.println("\t" + SP_GENTOO + "!");
            System.out.println("and last but not least...");
            System.out.println("\t" + SP_ADELIE + "!");
            System.out.print("There are a total of " + TOTAL_SPECIES);
            System.out.println(" penguin species in this dataset.");
            System.out.print("There are a total of " + totalPenguins);
            System.out.println(" penguins in this dataset.");
            
            //Enhance Output with Percentages
            System.out.printf("%s: %d (%.2f%%)\n",SP_CHINSTRAP,
                                                 NUM_CHINSTRAP,
                                                 ((double)NUM_CHINSTRAP
                                                 /totalPenguins * 100));
            System.out.printf("%s: %d (%.2f%%)\n",SP_GENTOO,
                                                 NUM_GENTOO,
                                                 ((double)NUM_GENTOO
                                                 /totalPenguins * 100));
            System.out.printf("%s: %d (%.2f%%)\n",SP_ADELIE,
                                                 NUM_ADELIE,
                                                 ((double)NUM_ADELIE
                                                 /totalPenguins * 100));
             //Introduce Branching Analysis
             //initializing maxPop to test for max
             maxPop = c;
             
             if (c < g) {
                 maxPop = g;
                 if (maxPop <= a) {
                     maxPop = a;
                 }
             } else if (c <= a) {
                 maxPop = a;
                 if (g >= maxPop) {
                     maxPop = g;
                 }
             } else if (c > a) {
                 if (g <= maxPop) {
                     maxPop = c;
                 }
               }
               
              // solving for if numbers are equal
              if ((maxPop == a) && (maxPop == g) {
                  tie = true;
              } else if ((maxPop == c) && (maxPop == g)) {
                  tie = true;
              } else if ((maxPop == c) && (maxPop == a)) {
                  tie = true;
              }
              
              //Outputting messages
             if ((maxPop == c) && (!tie)) {
             highestPopMsg = "Chinstrap penguins are the most populous";
             } else if ((maxPop == g) && (!tie) {
                highestPopMsg = "Gentoo penguins are the most populous";
             } else if ((maxPop == a) && (!tie) {
                highestPopMsg = "Adelie penguins are the most populous";
             }
             
             System.out.println("Branching Analysis:);
             if (tie) {
                highestPopMsg = "There is a tie between species for the most populous"
                System.out.println(highestPopMsg + ".");
             } else {
             System.out.println(highestPopMsg + ".");
             }
    }
}