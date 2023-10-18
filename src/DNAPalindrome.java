import java.util.Scanner;

    public class DNAPalindrome {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("DOSE THN AKOLOYTHIA DNA");
            String s = scanner.nextLine();
            Boolean mistake = false;
            for (int i=0;i<s.length();i++){
                if (s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G' && mistake == false){
                    System.out.println("MH EGKYRH MORFH AKOLOYTHIAS");
                    mistake = true;

                }
            }
            if (mistake == false){
                String s2 = "";
                StringDoubleEndedQueueImpl<String> q = new StringDoubleEndedQueueImpl<String>();
                for (int i = 0;i < s.length();i++){
                    char temp = s.charAt(i);
                    if (temp == 'A'){
                        temp = 'T';
                    }else if(temp == 'T'){
                        temp='A';
                    }
                    else if(temp == 'C'){
                        temp = 'G';
                    }
                    else {
                        temp = 'C';
                    }

                    q.addFirst(String.valueOf(temp));
                    s2 = q.getFirst() + s2;

                }
                if (s.equals(s2)){
                    System.out.println(" Einai Watson-Crick complemented palindrome");
                }else {
                    System.out.println("Den einai Watson-Crick complemented palindrome");
                }

            }

        }
}

