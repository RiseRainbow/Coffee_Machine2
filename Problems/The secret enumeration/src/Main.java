public class Main {

    public static void main(String[] args) {
        int count =0;
        Secret[] secrets = Secret.values();
        String[] S = new String[secrets.length];
        String s;
        for (int i=0; i<secrets.length; i++) {
           s = secrets[i].toString();
            if (s.startsWith("STAR")){
                count++;
            }
        }
        System.out.println(count);
        /*Secret.values().toString();
        for (int i=0; i<secrets.length; i++){
            if(S[i].startsWith("STAR")){
                count++;
            }
            System.out.println(count);
        }*/
    }


}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/
