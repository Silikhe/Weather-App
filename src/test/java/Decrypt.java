public class Decrypt {
    private int mKey;
    private String mText;

    Decrypt(String text, int key) {
        this.mText = text;
        this.mKey = key;
    }

    public boolean isString(){
        for (int i = 0; i < this.mText.length(); i++){
            if (this.mText.charAt(i) >= '0' && this.mText.charAt(i) <= '9'){
                System.out.println("Expected characters or words");
                return false;
            }
        }
        return true;
    }

    public String backward(){
        char[] newCharText = mText.toCharArray();

        for (int i = 0; i < newCharText.length; i++){
            //        For uppercase letters
            if (Character.isUpperCase(newCharText[i])){
                int castText = ((int) newCharText[i] - 65 - this.mKey) % 26 + 65;
                newCharText[i] = (char)castText;
            }
            //        For lowercase letters
            else if (Character.isLowerCase(newCharText[i])){
                int castText = ((int) newCharText[i] - 97 - this.mKey) % 26 + 97;
                newCharText[i] = (char)castText;
            }
        }

        final String newS = String.valueOf(newCharText);
        return newS;
    }
}
