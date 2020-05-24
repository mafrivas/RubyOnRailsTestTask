import java.util.Scanner;

public class Main {
    private static void typeSeq(int N,String str){
        Str newStr=new Str(str);
        for (int i = 0; i < N; i++) {
            System.out.println(newStr.getOldStr());
            newStr=new Str(newStr.getNewStr());
        }
    }
    private static boolean isCorrect(String str){
        String regEx="\\d+";
        return str.matches(regEx);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int N;
        if (isCorrect(str)) {
            N=in.nextInt();
            typeSeq(N,str);
        }
        else{
            System.out.println("Введен неправильный тип строки");
        }
    }
}
