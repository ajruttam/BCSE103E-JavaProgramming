/*********************************************************
Move capitals to end

Sample I/O:
InDiAnGOVernmenT
ninernmenIDAGOVT
*********************************************************/

import java.util.Scanner;

class MoveCapitalsToEnd{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sm = "", cp = "";
        for (int i = 0; i < str.length(); i++)
        {
            char e = str.charAt(i);
            if (e >= 'A' && e <= 'Z')
                cp += e;
            else
                sm += e;
        }
        System.out.print(sm + cp);
    }
}