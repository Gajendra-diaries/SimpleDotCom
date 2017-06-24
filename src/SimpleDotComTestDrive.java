

public class SimpleDotComTestDrive {

    
    public static void main(String[] args) {
        simpleDotCom dot = new simpleDotCom();
        int[] locations = { 2, 3, 4 };
        dot.setLocationCells(locations) ;
        String userGuess = "4";
        String result = dot .checkYourself(userGuess);
        
    }
    
}

