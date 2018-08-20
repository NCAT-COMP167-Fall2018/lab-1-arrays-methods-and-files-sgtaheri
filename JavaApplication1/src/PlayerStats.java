/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sghotbitaheri
 */
public class PlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[80];
        int[] scores = new int[80];
        
      readData(names, scores, args[0]);
        // TODO code application logic here
    }
    public static void readData(String[] names, int [] scores, String)
    try{
        Scanner reader = new Scanner(new File(filename));
        
        int currentIndex = 0;
        while(reader.hasNext()){
        String[] line = reader.nextLine().split(" ");
        
        names[currentIndex] = line[0];
        scores[currentIndex] = Integer.parseInt(line[1]);
                
        currentIndex++;
        
    } catch (fileNotFoundException ex) {
        System.err.println("Unable to read file in readData");
    }
}
