import fond.io.*;


public class StringaMaiuscoleMinuscole {
    public static void main(String[] args) {
        int countMaiuscole = 0;
        int countMinuscole = 0;
        InputWindow in = new InputWindow();
        String str = in.readString("Inserisci una stringa: ");
        for(int i = 0;i < str.length();i++){
            boolean b = Character.isAlphabetic(str.charAt(i));
            if(b){
                if(Character.isUpperCase(str.charAt(i))){
                    countMaiuscole++;
                }
                else{
                    countMinuscole++;
                }
            }
        }
        OutputWindow out = new OutputWindow();
        out.writeln("Maiuscole: " +countMaiuscole +" Minuscole: " +countMinuscole);
    }
}
