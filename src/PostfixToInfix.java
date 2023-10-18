
        import java.util.Scanner;

        public class PostfixToInfix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println ("Dwse thn arithmitikh parastash se postfix morfh: ");
            String parastash = scanner.nextLine();
            boolean mistake = false;
            if (((parastash.charAt(parastash.length()-1) != '+') && (parastash.charAt(parastash.length()-1) != '*') && (parastash.charAt(parastash.length()-1) != '-') && (parastash.charAt(parastash.length()-1) != '/')) && (mistake == false)) {
                System.out.println ("Lathos morfh parastashs");
                mistake = true;
            }
            for (int i=0; i< parastash.length() && (mistake == false); i++) {
                if((parastash.charAt(i) != '1' && parastash.charAt(i)!= '2' && parastash.charAt(i) != '3' && parastash.charAt(i) != '4' && parastash.charAt(i) != '5' && parastash.charAt(i) != '6' && parastash.charAt(i) != '7'
                        && parastash.charAt(i)!= '8' && parastash.charAt(i)!= '9' && parastash.charAt(i)!= '+' && parastash.charAt(i)!= '-' && parastash.charAt(i)!= '*' && parastash.charAt(i) != '/')) {
                    System.out.println ("Lathos morfh parastashs");
                    mistake = true;
                }
            }
            if (mistake == false) {
                StringDoubleEndedQueueImpl<String> q = new StringDoubleEndedQueueImpl<String>();
                for (int i = 0; i < parastash.length(); i++){
                    char c = parastash.charAt(i);
                    if (c != '+' && c!= '*' && c!= '/' && c != '-') {
                        q.addLast(String.valueOf(c));
                    }
                    else {
                        String temp1 = q.removeLast();
                        String temp2 = q.removeLast();
                        q.addLast("(" + temp2 + String.valueOf(c) + temp1 + ")");
                    }
                }
                q.printQueue(System.out);
            }


        }

 }


















