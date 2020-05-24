public class Str {
    private String OldStr;
    private String NewStr;

    public Str(String OldStr){
        this.OldStr=OldStr;
        this.NewStr= nextLineInSeq(OldStr);
    }
    private static String nextLineInSeq(String str) {
        str=str+"@";
        char arr[]=str.toCharArray();
        int i=0;
        char Symbol = arr[0];
        int counter = 0;
        String newStr="";
        while(i<arr.length){
            while (Symbol==arr[i]){
                counter++;
                i++;
            }
            newStr=newStr+Integer.toString(counter)+String.valueOf(Symbol);
            Symbol=arr[i];
            i++;
            counter=1;
        }
        return newStr;
    }
    public String getNewStr(){
        return NewStr;
    }
    public String getOldStr(){
        return OldStr;
    }
    public void setOldStr(String OldStr){
        this.OldStr=OldStr;
    }
    public void setNewStr(String NewStr){
        this.NewStr=NewStr;
    }
}
