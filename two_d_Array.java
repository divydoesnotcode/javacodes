public class two_d_Array {
    public static void main(){
        char[][] telephone= {{'1','2','3'},
                            {'4','5','6'},
                            {'7','8','9'},
                            {'*','0','#'}};

        for (char[] row : telephone){
            for (char number: row){
                System.out.println(number + " ");
            }
            System.out.println();
        }
    }
}
