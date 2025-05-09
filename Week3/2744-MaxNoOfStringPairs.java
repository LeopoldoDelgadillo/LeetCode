class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int pairs = 0;
        for(int i=0;i<words.length;i++){
            System.out.println("String " + i + ": " +words[i]);
            for(int j=i+1;j<words.length;j++){
                System.out.println("Pairing " + words[i] + " with " +words[j]);
                boolean isPair=false;
                for(int k = 0;k<2;k++){
                    if(words[i].charAt(k)!=words[j].charAt(Math.abs(k-1))){
                        System.out.println(words[i].charAt(k) + " didn't match with " + words[j].charAt(Math.abs(0-k)) + ", so it's not a pair.");
                        isPair = false;
                        break;
                    }
                    isPair = true;
                }
                if(isPair==true){
                    System.out.println(words[i] + " with " + words[j] + " is a pair! Going to next string...");
                    pairs++;
                    break;
                }
            }
        }
        return pairs;
    }
}
